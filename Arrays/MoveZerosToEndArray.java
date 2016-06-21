/*
Function to move all zeros to end of array

Algo:-
Traverse the given array from left to right.While traversing maintain the count of non-zero elements(count).
For every non-zero element a[i],put the element at a[count] and increment count.After complete traversal,all
non-zero elements hvae been shifted to front end and count is set as index of first 0.Now all we need to do is
run a loop which makes all elements from count till the end of array '0'
*/

public static void pushZerosToEnd(int[] a,int n){
	int count = 0; //count of non-zeros elements

	for (int i=0;i<n;i++) {
		if(a[i]!=0){
			a[count++] = a[i];
		}

		//now all non-zero elements have been shifted to front and count is set to index of first 0
		while(count<n){
			a[count++] = 0;
		}
	}
}