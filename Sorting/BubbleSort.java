/*
Optimized Bubble sort program in Java
Worst and Average Case Time Complexity: O(n*n). Worst case occurs when array is reverse sorted.
Best Case Time Complexity: O(n). Best case occurs when array is already sorted.
Auxiliary Space: O(1)
Boundary Cases: Bubble sort takes minimum time (Order of n) when elements are already sorted.
Sorting In Place: Yes
Stable: Yes
*/
import java.util.*;

public class BubbleSort{
	public static void main(String[] args) {
		int[] arr = {64,25,12,22,11,45,32};
		System.out.println("Before sorting array is: "+ Arrays.toString(arr));
		bubbleSortImproved(arr,arr.length);
		System.out.println("After sorting array is: "+ Arrays.toString(arr));
	}

	public static void bubbleSortImproved(int[] A,int n){
		int pass,i,temp,swapped=1;

		//swapped is a flag which checks if the array is already sorted or not and can skip remaining passes if it is sorted
		for(pass=n-1;pass>=0&&swapped==1;pass--){
			swapped=0;
			for(i=0;i<=pass-1;i++){
				if(A[i]>A[i+1]){
					//swap elements
					temp = A[i];
					A[i] = A[i+1];
					A[i+1] = temp;
					swapped = 1;
				}
			}
		}
	}
}