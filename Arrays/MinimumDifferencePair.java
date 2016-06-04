/*
Given an unsorted array, find the minimum difference between any pair in given array.
Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, the size of array. Second line of the test case is the Array.

Output:
Print the minimum difference between any two pairs.

Algo:- 
1. Sort the array in ascending order
2. Initialize min_diff as infinite(Integer.MAX_VALUE)
3. Find min_diff  by comparing adjacent pairs in sorted array
*/
import java.util.*;

public class MinimumDifferencePair{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt(); //t- test cases
	    for(int i=0;i<t;i++){
	       int n = sc.nextInt(); //n- no of elements
	       int[] a = new int[n];
           for(int j=0;j<n;j++){
              a[j] = sc.nextInt();
	        }
           findMinimumDiffrence(a);
        }
	}

	public static void findMinimumDiffrence(int[] a){
		int n = a.length;
		
		//sort the array in ascending order
		Arrays.sort(a);

		//initialize diffrence as infinite
	    int minDiff = Integer.MAX_VALUE;

	    //find the minimum diffrence by comparing adjacent pairs in sorted array
	    for (int i=0;i<n-1;i++) {
	    	if(a[i+1] - a[i] < minDiff){
	    		minDiff = a[i+1] - a[i];
	    	}
	    }
	    System.out.println(minDiff);
	}
}

