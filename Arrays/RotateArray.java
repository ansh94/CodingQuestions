/*
Given an array of size n, rotate it by d elements. 

Input: The first line of the input contains T denoting the number of testcases. 
First line of test case is the number of elements 'n' and elements 'd' to be rotated. Second line of test case will be the array elements.

Output: Rotated array is displayed to the user.

Algo used - Reversal algorithm for rotations
Let AB are the two parts of the input array where A = arr[0..d-1] and B = arr[d..n-1]. The idea of the algorithm is:
Reverse A to get ArB. // Ar is reverse of A 
Reverse B to get ArBr. // Br is reverse of B 
Reverse all to get (ArBr) r = BA

For arr[] = [1, 2, 3, 4, 5, 6, 7], d =2 and n = 7
A = [1, 2] and B = [3, 4, 5, 6, 7]
Reverse A, we get ArB = [2, 1, 3, 4, 5, 6, 7]
Reverse B, we get ArBr = [2, 1, 7, 6, 5, 4, 3]
Reverse all, we get (ArBr)r = [3, 4, 5, 6, 7, 1, 2]
*/


import java.util.*;

class RotateArray
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
         int t = sc.nextInt(); //t- test cases
         for(int i=0;i<t;i++){
            int n = sc.nextInt(); //n- no of elements
            int d = sc.nextInt(); //d-elements to be rotated
            int[] a = new int[n];
            for(int j=0;j<n;j++){
                a[j] = sc.nextInt();
            }
            leftRotateArray(a,d);
            System.out.println();
         }
	 }
	 //function to left rotate array of size n by d
	 public static void leftRotateArray(int[] arr,int d){
	     int n = arr.length;
	     reverseArray(arr,0,d-1);
	     reverseArray(arr,d,n-1);
	     reverseArray(arr,0,n-1);
	     printArray(arr);
	 }
	 //function to reverse array from index left to right
	 public static void reverseArray(int[] arr,int left,int right){
	     while(left<right){
	         int temp = arr[left];
	         arr[left] = arr[right];
	         arr[right] = temp;
	         left++;
	         right--;
	     }
	 }
	 //function to print the array
	 public static void printArray(int[] arr){
	     for(int i=0;i<arr.length;i++){
	         System.out.print(arr[i]+" ");
	     }
	 }
}