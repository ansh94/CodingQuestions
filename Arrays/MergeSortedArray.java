/*
Given two sorted integer arrays A and B, merge B into A as one sorted array. 
You may assume that A has enough space (size that is greater or equal to m + n) to hold additional elements from B. 
The number of elements initialized in A and B are m and n respectively.

Logic - using the concept of in-place merging
*/

import java.util.*;

public class MergeSortedArray{

	public static int[] mergeSortedArray(int[] a,int[] b){
		int[] answer = new int[a.length + b.length];
	    int i = 0, j = 0, k = 0;

	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       	
	            answer[k++] = a[i++];

	        else        
	            answer[k++] = b[j++];               
	    }

	    while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

	    return answer;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		a = mergeSortedArray(a,b);
		System.out.println("Merged Array: "+ Arrays.toString(a));
	}
}