package L21;

public class sortKsortedArray {
	public static void main(String[] args) {
		int arr[] = {2,6,3,12,57,8};
		sortAlmostSortedArray(arr,3);
	}
	public static void sortAlmostSortedArray(int input[], int k){
		PriorityQueue pq = new PriorityQueue();
		int i = 0;
		for(; i<k; i++){
			pq.insert(input[i]);
		}
		int j = 0;
		for(; j<input.length-k; j++){
			input[j] = pq.removeMin();
			pq.insert(input[i]);
			i++;
		}
		while(pq.getSize()!=0){
			input[j] = pq.removeMin();
			j++;
		}
		
		for(int t = 0; t<input.length; t++){
			System.out.print(input[t] + " ");
		}
	}
}
