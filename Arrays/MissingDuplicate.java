/*
Given an Integer array. Array contains duplicates of all the numbers in array except one number . Find that number.
Example :
int [] A = { 2,1,3,5,5,3,2,1,6,7,7,8,8};
Output : Missing duplicate is 6

Better Solution using XOR
A^A = 0 and A^B^A = B, so if we XOR all the elements, answer will be the missing no
If we have only one element, the missing no will be that no 
*/
import java.util.*;
public class MissingDuplicate{
	
	public static void main(String[] args) {
		int[] a = {2, 1, 3, 5, 5, 3, 2, 1, 6, 7, 7, 8, 8};
		System.out.println("Original array: "+ Arrays.toString(a));	
		System.out.println("Missing Duplicate is: "+ findMissingDuplicate(a));
	}

	public static int findMissingDuplicate(int[] a){
		// if we have only one element, the missing no will be that number
		int miss = a[0];

		for (int i=1;i<a.length;i++) {
			miss = miss ^ a[i];
		}
		return miss;
	}
}