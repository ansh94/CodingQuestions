/*
Time Complexity:Time complexity of Merge Sort is O(nLogn) in all 3 cases (worst, average and best) as 
merge sort always divides the array in two halves and take linear time to merge two halves.
Auxiliary Space: O(n)
Algorithmic Paradigm: Divide and Conquer
Sorting In Place: No in a typical implementation
Stable: Yes
*/
import java.util.*;

public class MergeSort{

	public static void mergeSort(int[] A,int[] temp,int left,int right){
		int mid;

		if(right>left){
			//finding the middle element
			mid = (right+left)/2;

			//call merge sort for first half
			mergeSort(A,temp,left,mid);

			//call merge sort for second half
			mergeSort(A,temp,mid+1,right);

			//merge the sorted halves
			merge(A,temp,left,mid+1,right);
		}
	}

	//The merge method is used to merge the sorted array.It is used to combine the virtually divided subarrays
	//in a sorted array starting with th lowest element and ending with the largest element
	public static void merge(int[] A,int[] temp,int left,int mid,int right){
		int i,left_end,temp_pos,size;
		left_end = mid-1;
		temp_pos = left;
		size = right-left+1;

		while((left<=left_end) && (mid<=right)){
			if(A[left]<=A[mid])
				temp[temp_pos++] = A[left++];

			else
				temp[temp_pos++] = A[mid++];
		}

		//there may be some cases when arrays may not be of the same size
		while(left<=left_end){
			temp[temp_pos++] = A[left++];
		}

		while(mid<=right){
			temp[temp_pos++] = A[mid++];
		}

		//when all the items from the two subarrays are copied in sorted order into temp array[]
		//we override them into the main array A[]
		for (i=0;i<size;i++) {
			A[right] = temp[right];
			right--;
		}
	}


	public static void main(String[] args) {
		int [] numbers = {3,8,7,5,2,1,9,6,4};
		int len = numbers.length;

		System.out.println("Original numbers before sorting: "+ Arrays.toString(numbers));

		//creating a temporary array for merge sort
		int[] temp = new int[25];
		mergeSort(numbers,temp,0,len-1);

		System.out.println("Numbers after merge sort: "+ Arrays.toString(numbers));
	}
}