/*
Function to sort an array of zeros and ones(all zeros on left side and all 1's on right)
eg input = {0,1,0,1,0,1}
output = {0,0,0,1,1,1}

Algo-using one pass
1. Maintain two indices.Initilize first index left as 0 and right index right as n-1
2. Do following while(left<right)
- Keep incrementing index left while there are 0's in it
- Keep decrementing index right while there are 1's in it
- If left < right then exchange a[left] and a[right]
*/

public static void sortArrayZerosAndOnes(int[] a,int n){
	int left = 0;
	int right = n-1;

	while(left<right){

		while((a[left]==0) && (left<right)){
			left++;
		}

		while((a[right==1]) && (left<right)){
			right--;
		}

		//swapping a[left] and a[right]
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}
	System.out.println("After sorting array of 0's and 1's we get: " + Arrays.toString(a));
}