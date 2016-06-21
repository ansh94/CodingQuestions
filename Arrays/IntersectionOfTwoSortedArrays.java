/*
Program to find the intersection of two sorted arrays
eg if A={1,3,4,5,7} and B={2,3,5,6} then intersection = 3,5

logic- Since arrays are sorted, compare the first element of both the arrays.(i=0, j=0)
If both elements are same, we have our intersection point, print it and increment the indexes for other interection points.
Else if  A[i] > B[j], increase the B[] index, j++.
Else if  B[j]> A[i], increase the A[] index, i++.
If any of the array gets over that means you have not found the intersection point
*/

public class IntersectionOfTwoSortedArrays{
	
	public static void main(String[] args) {
		int[] A = {1,3,4,5,7};
		int[] B = {2,3,5,6};
		intersectionOfArrays(A,B);	
	}

	public static void intersectionOfArrays(int[] A,int[] B){
		int i=0,j=0;

		while(i<A.length && j<B.length){
			if(A[i]>B[j]){
				j++;
			}

			else if(B[j]>A[i]){
				i++;
			}

			else{
				System.out.printf(A[i]+ " ");
				i++;
				j++;
			}
		}
	}
}