/*
Given an array of integers check whether there are two numbers present with given product.

Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is N and a product p.
The second line of each test case contain N number of a[].

Output:
Print Yes if two numbers product is equal to p else No.

Level:School
********Amazon Question************
*/
import java.util.*;
import java.lang.*;
import java.io.*;


class EqualToProduct
 {
	public static void main (String[] args)
	 {
	 Scanner sc = new Scanner(System.in);
         int t = sc.nextInt(); //t- test cases
         StringBuilder sb = new StringBuilder();
         for(int i=0;i<t;i++){
            int n = sc.nextInt(); //n- no of elements
            int p = sc.nextInt(); //p-product
            
            //creating a hashset of second factors
            Set<Integer> secondFactors = new HashSet<>();
            boolean result = false;
            for(int j=0;j<n;j++){
                int cur = sc.nextInt();
                if(cur==0){
                    continue;
                }
                if(p % cur == 0){
                    if(secondFactors.contains(cur)){
                        result = true;
                    }
                    else{
                        int secondFactor = p/cur;
                        secondFactors.add(secondFactor);
                    }
                }
            }
            sb.append(result?"Yes\n":"No\n");
         }
         System.out.println(sb.toString());
	 }	 
}