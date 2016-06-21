/*
Function to find peak element in a given array
A peak element is a element which is greater than or equal to both of its neighbours

Algo:- (Using Binary Search) Complexity - O(logn)
*/

public static int peak (int[] a,int low,int high,int size){
	int mid = (low+high)/2;

	//if middle element is peak element,return it
	if((mid==0 || a[mid]>=a[mid-1]) && (a[mid]>=a[mid+1] || mid==size-1)){
		return mid;
	}

	//if middle element is smaller than its left element,we will get our peak element in left half
	else if (mid>0 && a[mid]<a[mid-1]){
		return peak(a,low,mid-1,size);
	}

	//if middle element is smaller than its right element,we will get our peak element in right half
	else{
		return peak(a,mid+1,high,size);
	}
}