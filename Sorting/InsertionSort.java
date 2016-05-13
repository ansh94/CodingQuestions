/*
Time Complexity: O(n*n)
Auxiliary Space: O(1)
Boundary Cases: Insertion sort takes maximum time to sort if elements are sorted in reverse order. 
and it takes minimum time (Order of n) when elements are already sorted.
Algorithmic Paradigm: Incremental Approach
Sorting In Place: Yes
Stable: Yes
Online: Yes
Uses: Insertion sort is uses when number of elements is small. It can also be useful when input array is almost sorted,
only few elements are misplaced in complete big array.
*/
import java.util.*;

public class InsertionSort{
	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11,45,32};
		System.out.println("Before sorting array is: "+ Arrays.toString(arr));
		insertionSort(arr,arr.length);
		System.out.println("After sorting array is: "+ Arrays.toString(arr));
	}

	public static void insertionSort(int[] a,int n){
		//outer loop for going through each element.first element is not considered as 1 element is considered sorted.
		for (int i=1;i<n;i++) {
			
			int j=i;
			while(j>0 && a[j]<a[j-1]){
				//swap the elements
				int temp = a[j-1];
				a[j-1] = a[j];
				a[j] = temp;
				j--;
			}
		}
	}
}