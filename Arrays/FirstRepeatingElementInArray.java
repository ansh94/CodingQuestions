/*
Program to find first repeating element in an array

Logic - Intitialize index = -1 and use a hashset.Navigate the array from right to left
If hashset doesn't contain element add it,
Else if hashset contains then update the index with current index in navigation
At the end index will be updated by the ele­ment which is repeated and has the low­est index.
*/
import java.util.*;

public class FirstRepeatingElementInArray{

	public static void main(String[] args) {
		int[] a = {1,2,5,7,5,3,10,2};
		System.out.println("Original Array: "+ Arrays.toString(a));
		System.out.println("First Repeating Element in given array is: " + findFirstRepeatingElement(a));
	}

	public static int findFirstRepeatingElement(int[] a){
		int index = -1;
		Set<Integer> hs = new HashSet<>();

		for (int i=a.length-1;i>=0;i--) {
			if(hs.contains(a[i])){
				index = i;
			}

			else{
				hs.add(a[i]);
			}
		}
		return a[index];
	}
}