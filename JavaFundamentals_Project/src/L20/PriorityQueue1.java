package L20;

import java.util.ArrayList;

public class PriorityQueue1 {
	ArrayList<Integer> data;
	
	PriorityQueue1(){
		data = new ArrayList<Integer>();
		data.add(null);
	}
	
	public int getSize(){
		return data.size()-1;
	}
	
	public void insert(int element){
		data.add(element);
		int childIndex = getSize();
		int parentIndex = childIndex/2;
		while(childIndex > 1){
			parentIndex = childIndex/2;
			if(data.get(parentIndex) > data.get(childIndex)){
				
				int temp = data.get(childIndex);
				data.set(childIndex, data.get(parentIndex));
				data.set(parentIndex, temp);
				
				childIndex = parentIndex;
			}
			
			else{
				break;
			}
		}
	}
	
	public int removeMin() {
		int ans = data.get(1);
		int lastIndex = data.size()-1;
		data.set(1, data.get(lastIndex));
		data.remove(lastIndex);
		int parentIndex = 1;
		while(lastIndex < data.size()){
			int leftChildIndex = parentIndex*2;
			int rightChildIndex = parentIndex*2 + 1;
			int minIndex = parentIndex;
			if(leftChildIndex < data.size()){
				if(data.get(leftChildIndex) < data.get(minIndex)){
					minIndex = leftChildIndex;
				}
			}
			
			if(rightChildIndex < data.size()){
				if(data.get(rightChildIndex) < data.get(minIndex)){
					minIndex = rightChildIndex;
				}
			}
			
			if(minIndex == parentIndex){
				break;
			}
			int temp = data.get(parentIndex);
			data.set(parentIndex, data.get(minIndex));
			data.set(minIndex, temp);
			
			parentIndex = minIndex;
		}
		
		return ans;
	}
	
}
