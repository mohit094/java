package L21;

import java.util.ArrayList;

public class kMinElements_nlogk {
	
	public static void main(String[] args) {
		int arr[] = {112,600,300,12,57,8};
		ArrayList<Integer> arr1 = kMinElements(arr,3);
		for(int i = 0; i < arr1.size(); i++){
			System.out.println(arr1.get(i) + " ");
		}
	}
	
	public static ArrayList<Integer> kMinElements(int input[], int k){
		PriorityQueue pq = new PriorityQueue();
		int j = 0;
		
		for(;j<input.length;j++){
			if(pq.getSize() == k){
				int t = pq.min();
				if(t>input[j]){
					pq.removeMax();
					pq.insertMax(input[j]);
				}
				continue;
			}
			pq.insertMax(input[j]);
		}
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		while(pq.getSize()!=0){
			arr1.add(pq.removeMax());
		}
		return arr1;
		
	}
}
