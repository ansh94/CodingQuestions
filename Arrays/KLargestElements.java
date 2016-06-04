/*
Given an array, print k largest elements from the array.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and k, N is the size of array and K is the largest elements to be returned.
The second line of each test case contains N input C[i].

Output:
Print the k largest element in descending order.

Algo(temporary array method):-
1) Store the first k elements in a temporary array temp[0..k-1].
2) Find the smallest element in temp[], let the smallest element be min.
3) For each element a[i] in arr[k] to arr[n-1]
   If a[i] is greater than the min then remove min from temp[] and insert a[i].
4) Print final k elements of temp[]

Time Complexity: O((n-k)*k). If we want the output sorted then O((n-k)*k + klogk)
*/
import java.util.*;

public class KLargestElements{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //t- test cases
        for(int i=0;i<t;i++){
           int n = sc.nextInt(); //n- no of elements
           int k = sc.nextInt(); //no.of elemens to be returned
           int[] a = new int[n];
           for(int j=0;j<n;j++){
               a[j] = sc.nextInt();
            }
            printKLargestElements(a,k);
            System.out.println();
        }
	}

	public static void printKLargestElements(int[] a,int k){
		//store the first k elements in a temporary array
	    int[] temp = new int[k];
	    for(int i=0;i<k;i++){
	        temp[i] = a[i];
	    }

	    for(int i=k;i<a.length;i++){
	        int min = Integer.MAX_VALUE;
	        int minIndex = 0;
	        //find the smallest element(min) in temp
	        for(int j = 0; j < temp.length; j++){				
				if(temp[j] <min){
	     			min = temp[j];
					minIndex = j;
		      	}
	     	}	
			if(a[i] > min){
				temp[minIndex] = a[i]; 	
			}
	    }

	    //arranging k largest elements in descending order
	    Integer[] newArray = new Integer[temp.length];
        int i=0;
        for(int value: temp){
            newArray[i++] = Integer.valueOf(value);
        }
	    Arrays.sort(newArray,Collections.reverseOrder());
	     
	    //printing the final k largest elements
	    for(Integer val: newArray){
	        System.out.print(val.intValue() + " ");
	    }
	}
}