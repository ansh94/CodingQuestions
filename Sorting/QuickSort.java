/*
Time Complexity: 
Worst Case: O(n*n) The worst case occurs when the partition process always picks greatest or smallest element as pivot. 
If we consider above partition strategy where last element is always picked as pivot, the worst case would occur 
when the array is already sorted in increasing or decreasing order. 
Best Case: O(nlogn) The best case occurs when the partition process always picks the middle element as pivot.
Average Case: O(nlogn)

*/
import java.util.Arrays;

public class QuickSort{

	public static void main(String[] args) {
		
		int[] input = {23,31,1,21,36,72};
		System.out.println("Before Sorting: "+ Arrays.toString(input));
		quickSort(input); //sort the integer array using quick sort alogorithm
		System.out.println("After Sorting: "+ Arrays.toString(input));

		// input with duplicates 
		int[] withDuplicates = { 11, 14, 16, 12, 11, 15}; 
		System.out.println("Before sorting : " + Arrays.toString(withDuplicates)); 
		quickSort(withDuplicates); // sort the integer array using quick sort algorithm 
		System.out.println("After sorting : " + Arrays.toString(withDuplicates)); 
	}

	//public method exposed to client
	public static void quickSort(int[] array){
		recursiveQuickSort(array,0,array.length-1);
	}

	//recursive quick sort method
	public static void recursiveQuickSort(int[] A,int low,int high){
		int pivot;
		pivot = Partition(A,low,high);
		
		if(low<pivot-1){
			recursiveQuickSort(A,low,pivot-1);
		}

		if(high>pivot){
			recursiveQuickSort(A,pivot,high);
		}
	}

	public static int Partition(int[] A,int low,int high){
		int left,right,pivot_item;
		pivot_item=A[low]; //taking leftmost element as pivot
		left=low;
		right=high;

		while(left<=right){
			//move left while item < pivot_item
			while(A[left] < pivot_item){
				left++;
			}

			//move right while item > pivot_item
			while(A[right] > pivot_item){
				right--;
			}

			//swap the values;
			if(left<=right){
				int tmp = A[left];
				A[left]=A[right];
				A[right]=tmp;

				//increment left index and decrement right index
				left++;
				right--;
			}
		}
		return left;
	}
}