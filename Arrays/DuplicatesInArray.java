import java.util.*;

/*
Java Program to find duplicate elements in an array. There are two straight
forward solution of this problem first, brute force way and second by using
HashSet data structure.

It is a generic program can be used for array of integers,strings etc
 */

public class DuplicatesInArray{

    public static void main(String args[]) {

        //String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" , "C" };
    	int[] A = {1,2,3,4,5,6,6,7,4,3};
    	System.out.println("Original array: "+ Arrays.toString(A));
        //System.out.println("Original array: "+ Arrays.toString(names));

        // First solution : finding duplicates using brute force method (complexity - O(n^2))
        /*
        System.out.println("Finding duplicate elements in array using brute force method");
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i]==A[j]) {
                   System.out.println("Duplicates exist: "+ A[i]);
                }
            }
        }
        */

        // Second solution : use HashSet data structure to find duplicates (Complexity- O(n))
        //Set doesn't allow duplicates in Java.Just loop over array elements, insert them into HashSet using 
        // add() method and check return value. If add return false it means element is not allowed in set
        //and that is your duplicate
        //for string duplicates - change hashset of type string and accordingly below
        System.out.println("Duplicate elements from array using HashSet data structure");
        Set<Integer> store = new HashSet<>();

        for (int number : A) {
            if (store.add(number) == false) {
                System.out.println("found a duplicate element in array : "
                        + number);
            }
        }
    }
}
