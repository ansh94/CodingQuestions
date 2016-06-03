/*
Program to reverse an array in place without using any additional storage(array)

Logic - swap first element with last element, swap second element with second last element until you reach the middle of the array. 
This way, all elements of array will be reversed without using any additional buffer. 
Key thing to keep in mind in this algorithm is that you only need to iterate till middle element, 
if you go beyond that then you end up swapping elements twice and result in same array.
*/

import java.util.Arrays;
public class ReverseArrayInPlace{

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		reverseArray(numbers);
	}

	public static void reverseArray(int[] input){
		System.out.println("Original array: " + Arrays.toString(input));

		//handling null,empty and one element
		if(input==null || input.length<=1){
			return;
		}

		//we have to iterate till middle element only
		for (int i=0;i<input.length/2;i++) {  
			//swapping numbers
			int temp = input[i];  
			input[i] = input[input.length-1-i]; //first with last,second with second last and so on.
			input[input.length-1-i] = temp;
		}

		System.out.println("Reversed Array: " + Arrays.toString(input));
	}
}	