package L17;

public class QueueUse {
	public static void main(String[] args) throws QueueEmptyException  {
//		QueueUsingArray q = new QueueUsingArray();
		QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.enqueue(50);
		
		q.enqueue(60);
		
		System.out.println("Size : " + q.getSize());
		
		while(!q.isEmpty()) {
			System.out.println(q.dequeue());
		}
			/*try {
				System.out.println(q.dequeue());
			} catch (QueueEmptyException e) {
				System.out.println("Queue is empty !");
				System.out.println("Please add more elements before dequeue !");
				
//				e.printStackTrace();
			}
		}
		
//		System.out.println(q.front());
		try {
			System.out.println(q.dequeue());
		} catch (QueueEmptyException e) {
			e.printStackTrace();
//			System.out.println("Queue is empty !");
//			System.out.println("Please add more elements before dequeue !");
		}*/
		
		System.out.println(q.getSize());
	}
}
