import java.util.PriorityQueue;

public class KthSmallestOrLargestElementArray{

	public static void main(String[] args) {
		int[] A = {34,45,21,12,54,67,15};
		int k = 2;
		System.out.println("\n2nd smallest element: "+ findKthSmallestElement(A,k));
		System.out.println("\n2nd largest element: "+ findKthLargestElement(A,k));
	}

	public static int findKthSmallestElement(int[] A,int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		//Adding all the elements in Priority queue
		for (int i=0;i<A.length;i++) {
			pq.offer(A[i]);
		}

		//Extracting k elements from pq.The last element extracted will be the kth smallest element
		int n = -1;
		while(k>0){
			n = pq.poll();
			k--;
		}
		return n;
	}

	public static int findKthLargestElement(int[] A,int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int numElements = A.length;

		//Adding all the elements in Priority queue
		for (int i=0;i<A.length;i++) {
			pq.offer(A[i]);
		}

		//Extracting largest elements
		int n = -1;
		while(numElements-k+1>0){
			n = pq.poll();
			k++;
		}
		return n;
	}
}