/*
Given an array with all elements greater than or equal to zero.Return the maximum product of two numbers possible.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N, N is size of array.
The second line of each test case contains N input A[i].

Output:
Print the maximum product of two numbers possible.

Algo:-
1.Find top two maximum numbers
2.Calculate their product
*/
import java.util.*;

class MaximumProduct{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i=0;i<t;i++) {
			int n = sc.nextInt();
			int[] a = new int[];
			for (int j=0;j<n;j++) {
				a[j] = sc.nextInt();
			}
			maxProduct(a,a.length);
		}
	}
	public static void maxProduct(int[] a,int n){
		//initialize largest and second largest
		int posa = Integer.MIN_VALUE;
		int posb = Integer.MAX_VALUE;

		for (int i=0;i<n;i++) {
			if(a[i]>posa){
				posb = posa;
				posa = a[i];
			}
			else if(a[i]>posb){
				posb = a[i];
			}
		}
		System.out.println(posa*posb); //maximum product
	}
}