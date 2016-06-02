/*
Write a program to print Binary representation of a given number.

Input:

The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N.

Output:

Print binary representation of a number in 14 bits.

Level:School
********Microsoft Question************
*/
import java.util.*;

class BinaryRepresentation{
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //t- test cases
        for(int i=0;i<t;i++){
           int n = sc.nextInt(); //n-number
           printBinaryNumber(n);
           System.out.println();
        }
	}

	//using bit operators
	public static void printBinaryNumber(int n){
	    for(int i=13;i>-1;i--){
	        System.out.print((n>>i)&1);
	    }
	 }
	}
}