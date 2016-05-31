/*
Given an integer array, for each element in the array check whether there exist a smaller element on the next immediate position of the array. 
If it exist print the smaller element. If there is no smaller element on the immediate next to the element then print -1.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case contains an integer N, where N is the size of array.
The second line of each test case contains N integers sperated with a space which is input for the array arr[ ]

Output:
For each test case, print in a newline the next immediate smaller elements for each element in the array.

Level:School
********Amazon Question************
*/
import java.util.*;
import java.io.*;

class ImmediateSmallerElement
 {
	public static void main (String[] args)
	 {
	 	Scanner sc = new Scanner(System.in);
         int t = sc.nextInt(); //t- test cases
         for(int i=0;i<t;i++){
            int n = sc.nextInt(); //n- no of elements
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            nextSmallerElement(a);
            System.out.println();
         }
	 }
	 public static void nextSmallerElement(int[] a){
	     for(int i=1;i<a.length;i++){
	         if(a[i]<a[i-1]){
	             System.out.print(a[i] + " ");
	         }
	         else{
	             System.out.print("-1 ");
	         }
	     }
	     System.out.print("-1 ");
	 }
}