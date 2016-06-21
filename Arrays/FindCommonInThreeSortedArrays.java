/*
Approach
1. Navigate all three arrays(A,B,C) simultaneously using indexes say, i,j,k.
2. if(A[i]==B[j]==C[k]) then print A[i] and do i++, j++, k++.
3. if not then compare all A[i],B[j],C[k] and which ever is smaller, increase its index.
4. Stop when any of these array gets over
*/


public class FindCommonInThreeSortedArrays{

	public static void findCommon(int[] A,int[] B,int[] C){
		int i=0,j=0,k=0;

		while(i<A.length && j<B.length && k<C.length){
			if((A[i]==B[j]) && (B[j]==C[k])){
				System.out.print(A[i] + " ");
				i++;
				j++;
				k++;
			}

			else if((A[i]<=B[j]) && (A[i]<=C[k])){
				i++;
			}
			else if((B[j]<=A[i]) && (B[j]<=C[k])){
				j++;
			}
			else 
				k++;
		}
	}

	public static void main(String[] args) {
		int [] A = {1,2,3,4,5,6,7,8,9,10};
		int [] B = {1,3,5,6,7,8,12};
		int [] C = {2,3,4,5,8,9};

		System.out.print("Common Elements are: ");
		findCommon(A,B,C);
	}
}