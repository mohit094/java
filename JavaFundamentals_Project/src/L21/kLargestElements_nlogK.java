package L21;

import java.util.ArrayList;

public class kLargestElements_nlogK {
	public static void main(String[] args) {
		int arr[] = {112,600,300,12,57,8};
		ArrayList<Integer> arr1 = kLargestElements(arr,4);
		for(int i = 0; i < arr1.size(); i++){
			System.out.println(arr1.get(i) + " ");
		}
	}
	public static ArrayList<Integer> kLargestElements(int input[], int k){
		PriorityQueue pq = new PriorityQueue();
		int i = 0;
		
		int j = 0;
		for(;j<input.length;j++){
			if(pq.getSize()==k){
				int t = pq.removeMin();
				if(t < input[j]){
					t = input[j];
				}
				pq.insert(t);
				continue;
			}
			
			pq.insert(input[j]);
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		while(pq.getSize()!=0){
			arr.add(pq.removeMin());
		}
		return arr;
	}
}
