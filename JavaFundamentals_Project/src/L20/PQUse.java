package L20;

public class PQUse {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.insert(10);
		pq.insert(109);
		pq.insert(20);
		pq.insert(15);
		pq.insert(24);
		pq.insert(1);
		
		System.out.println(pq.min());
		
		while(pq.getSize() != 0) {
			System.out.println(pq.removeMin());
		}
		
	}
}
