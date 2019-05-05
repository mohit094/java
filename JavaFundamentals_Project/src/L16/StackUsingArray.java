package L16;

public class StackUsingArray {
	private int data[];
	private int nextIndex;
	
	StackUsingArray() {
		data = new int[4];
		nextIndex = 0;
	}
	
	public int size() {
		return nextIndex;
	}
	
	public boolean isEmpty() {
		if(nextIndex == 0) {
			return true;
		}
		else {
			return false;
		}
//		return nextIndex == 0;
	}
	
	public int top() {
		if(isEmpty()) {
			System.out.println("Stack underflow!");
			return -1;
		}
		return data[nextIndex - 1];
	}
	
	public void push(int element) {
		if(nextIndex == data.length) {
			int temp[] = new int[2 * data.length];
			for(int i = 0; i < data.length; i++) {
				temp[i] = data[i];
			}
			data = temp;
			/*System.out.println("Overflow");
			return;*/
		}
		data[nextIndex] = element;
		nextIndex++;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack underflow!");
			return -1;
		}
		nextIndex--;
		return data[nextIndex];
	}
	
	
	
	
	
	
	
	
}
