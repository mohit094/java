package Practice_array;
/*Let A[0 ... n-1] be an array of n distinct positive integers. 
 * If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of A. 
 * Given an integer array A, your task is to find the number of inversions in A.Let A[0 ... n-1] be an array
 * of n distinct positive integers. If i < j and A[i] > A[j] then the pair (i, j) is called an inversion of A.
 * Given an integer array A, your task is to find the number of inversions in A.*/
public class countInversion {
	
	public static void main(String[] args) {
		int[] A = {1,2,3,4};
		long ans = solve(A,4);
		System.out.println();
	}
	
	static long solve(int[] A,int n){
		//Write your code here.
		long count = 0;
		for(int i : A){
			for(int j = i+1;j<n;j++){
				if(A[i]>A[j]){
					count++;
				}
			}
		}
		return count;
		
	}
}
