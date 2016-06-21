/*
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length. 
Do not allocate extra space for another array, you must do this in place with constant memory.
For example, given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].
*/
import java.util.*;

public class RemoveDuplicatesFromArrayInPlace{


	/*
	This method returns the number of unique elements, but does not change the original array correctly. 
	For example, if the input array is {1, 2, 2, 3, 3}, the array will be changed to {1, 2, 3, 3, 3}. 
	The correct result should be {1, 2, 3}. 
	Because array's size can not be changed once created, there is no way we can return the original array with correct results.
	*/
	public static int removeDuplicates(int[] a){
		//return if the array length is less than 2
		if(a.length<2)
			return a.length;

		int j=0;
		int i=1;
		while(i<a.length){
			if(a[i]==a[j]){
				i++;
			}
			else{
				j++;
				a[j]=a[i];
				i++;
			}
		}

		return j+1;
	}

	public static int[] removeDuplicatesAndStoreUniqueElementsInAnotherArray(int[] a){
		//return if the array length is less than 2
		if(a.length<2)
			return a;

		int j=0;
		int i=1;
		while(i<a.length){
			if(a[i]==a[j]){
				i++;
			}
			else{
				j++;
				a[j]=a[i];
				i++;
			}
		}

		int[] b = Arrays.copyOf(a,j+1);

		return b;
	}

	public static void main(String[] args) {
		int[] a = {1,2,2,3,3};
		System.out.println("Original Array: "+ Arrays.toString(a));
		a = removeDuplicatesAndStoreUniqueElementsInAnotherArray(a);
		System.out.println("Array after removing duplicate elements: "+ Arrays.toString(a));
	}
}