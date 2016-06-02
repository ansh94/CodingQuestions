/*
Given two positive numbers x and y, check if y is a power of x or not.

Input:
First line contains an integer, the number of test cases 'T'. Each test case should contain two positive numbers x and y.


Output:
Print 1 if y is a power of x, else print 0.
*/
import java.util.*;

public class CheckNumberIsPowerOfAnotherNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); //t- test cases
        for(int i=0;i<t;i++){
           int x = sc.nextInt(); //x-first number
           int y = sc.nextInt(); //y-second number
           System.out.println(isPower(x,y)?"1":"0");
        }
	}

    /* Returns true if y is a power of x */
    public static boolean isPower(int x,int y){
        // The only power of 1 is 1 itself
	    if(x==1){
	        return (y==1);
	    }
	     
	    // Repeatedly compute power of x
	    int pow = 1;
	    while(pow<y){
	        pow = pow * x;
	    }
	    // Check if power of x becomes y
        return (pow == y);
    }
}
