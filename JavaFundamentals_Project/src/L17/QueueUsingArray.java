package L17;

import java.util.InputMismatchException;

public class QueueUsingArray {
	private int data[];
	private int nextIndex;
	private int frontIndex;
	private int size;
	
	QueueUsingArray() {
		data = new int[5];
		nextIndex = 0;
		frontIndex = -1;
		this.size = 0 ;	
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int front() {
		if(isEmpty()) {
			System.out.println("Underflow !");
			return -1;
		}
		return data[frontIndex];
	}
	//dynamic queue for 
	public void enqueue(int element) {
		if(size == data.length) {
			System.out.println("Doubling");
			int temp[] = new int[data.length * 2];
			int j = 0;
			for(int i = frontIndex; i < data.length; i++) {
				temp[j++] = data[i];
			}
			for(int i = 0; i < frontIndex; i++) {
				temp[j++] = data[i];
			}
			nextIndex = data.length;
			frontIndex = 0;
			data = temp;
			
			/*System.out.println("Overfloe !");
			return;*/
		}
		data[nextIndex] = element;
		nextIndex = (nextIndex + 1) % data.length;
		size++;
		if(frontIndex == -1) {
			frontIndex = 0;
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			QueueEmptyException e = new QueueEmptyException();
			try {
				throw e;
			} catch (QueueEmptyException x) {
				// TODO Auto-generated catch block
//				e1.printStackTrace();
			}
			catch(InputMismatchException c) {
				
			}
			/*System.out.println("Underflow !");
			return -1;*/
		}
		int ans = data[frontIndex];
		frontIndex = (frontIndex + 1) % data.length;
		size--;
		if(size == 0) {
			nextIndex = 0;
			frontIndex = -1;
		}
		return ans;
	}
}
