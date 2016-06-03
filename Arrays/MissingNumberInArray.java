/*
Java program to find missing elements in an Integer array containing numbers 1-100
If only one missing number use sum of series= n(n+1/2) but works only for one missing number.

Logic- calculate sum of numbers and then subtract that from actual sum
*/

import java.util.*;


public class MissingNumberInArray{

	/*
	method to find missing number in an array of size n containing numbers from 1 to n onle
	eg can be used to find missing numbers from 1-100,1-1000
	*/
	public static int getOneMissingNumber(int[] numbers,int n){
		int expectedSum = n * ((n+1)/2);
		int actualSum = 0;
		for (int i:numbers) {
			actualSum+=i;
		}
		return expectedSum - actualSum;
	}


	public static void main(String[] args) {

		int[] iArray = {1,2,3,5};
		int missing = getOneMissingNumber(iArray,5);
		
		System.out.println("Missing Number in array is " + missing);
	}
}


