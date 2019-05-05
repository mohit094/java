package L20;

import java.util.ArrayList;

public class PriorityQueue {
	ArrayList<Integer> data;

	PriorityQueue() {
		data = new ArrayList<Integer>();
		data.add(null);
	}

	public int getSize() {
		return data.size() - 1;
	}

	public void insert(int element) {
		data.add(element);

		int childIndex = data.size() - 1;
		while(childIndex >  1) {
			int parentIndex = childIndex / 2;

			if(data.get(childIndex) < data.get(parentIndex)) {
				int temp = data.get(childIndex);
				data.set(childIndex, data.get(parentIndex));
				data.set(parentIndex, temp);

				childIndex = parentIndex;
			}
			else {
				break;
			}
		}
	}

	public int min() {
		if(getSize() == 0) {
			// TODO - Exception 
		}
		return data.get(1);
	}

	public int removeMin() {
		if(getSize() == 0) {
			// TODO - Exception 
		}
		int ans = data.get(1);
		int lastIndex = data.size()-1;
		data.set(1, data.get(lastIndex));
		data.remove(lastIndex);

		int parentIndex = 1;

		while(parentIndex < data.size()) {
			int leftChildIndex = 2 * parentIndex;
			int rightChildIndex = leftChildIndex + 1;
			int minIndex = parentIndex;
			if(leftChildIndex < data.size()) {
				if(data.get(leftChildIndex) < data.get(minIndex)) {
					minIndex = leftChildIndex;
				}
			}
			if(rightChildIndex < data.size()) {
				if(data.get(rightChildIndex) < data.get(minIndex)) {
					minIndex = rightChildIndex;
				}
			}
			if(minIndex == parentIndex) {
				break;
			}
			else {
				int temp = data.get(minIndex);
				data.set(minIndex, data.get(parentIndex));
				data.set(parentIndex, temp);
				parentIndex = minIndex;
			}
		}
		return ans;
	}














}
