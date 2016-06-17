/*
Given an unsorted array of positive and negative numbers. 
Create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers respectively.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N,N is the size of array.
The second line of each test case contains N input a[].

Output:
Print an array of alternate positive and negative numbers.
Note: Solution should start with positive number.
*/
import java.util.*;

class RearrangeArrayPositiveAndNegative{
	public static void main(String[] args) {
		int[] arr = new int[100];
		int n = 0;
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0){
			if(sc.hasNext()==true){
				n = sc.nextInt();
			}
			for (int i = 0; i < n; i++)
               if(sc.hasNextInt())
                arr[i] = sc.nextInt();
               createArray(arr,n);
			System.out.println();
            t--;
		}
	}

	public static void createArray(int[] a,int n){
		//create two  arrays for positive and negative numbers
		int[] pos = new int[100];
		int[] neg = new int[100];

		for (int i=0,j=0,k=0;i<n;i++) {
			if(a[i]>0){
				pos[j] = a[i];
				j++;
			}
			else{
				neg[k] = a[i];
				k++;
			}
		}

		//print numbers from both arrays alternate
		for (int i=0,j=0,k=0;i<n;i++) {
			//print positive numbers in even positions
			if(i%2==0){
				System.out.print(pos[j]+" ");
				j++;
			}
			//print negative numbers in odd positions
			else
            {
            	System.out.print(neg[k]+" ");
            	k++;
            }
		}
	}
}