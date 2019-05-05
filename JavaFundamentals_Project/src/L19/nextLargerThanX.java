package L19;

public class nextLargerThanX {
	public static void main(String[] args) throws L17.QueueEmptyException, QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BTNode<Integer> root = BinaryTreeUse.takeInputLevelWise();
		BinaryTreeUse.printLevelWise(root);
		BTNode<Integer> node = largerThanX(root,10);
		if(node != null){
			System.out.println("Result:- " + node.data);
		}
		else{
			System.out.println("null");
		}
	}
	//input//1 2 3 -1 10 4 -1 -1 -1 -1 -1
	public static BTNode<Integer> largerThanX(BTNode<Integer> root, int x) throws QueueEmptyException{
		if(root == null){
			return root;
		}
		//create queue to have all the nodes which have the value greater than x
		QueueUsingLL<BTNode<Integer>> pendingNodes = new QueueUsingLL<BTNode<Integer>>();
		//
		BTNode<Integer> maxNode = null;
		if(root.data > x){
			//add root node in queue only if it is greater than x
			pendingNodes.enqueue(root);
		}
		BTNode<Integer> leftMax = largerThanX(root.left,x);
		if(leftMax!=null){
			// add left max node in queue only if it is not equal to null
			pendingNodes.enqueue(leftMax);
		}
		BTNode<Integer> rightMax = largerThanX(root.right,x);
		if(rightMax!=null){
			// add right max node in queue only if it is not equal to null
			pendingNodes.enqueue(rightMax);
		}
		// now compare which node has the nearest max value to x
		while(!pendingNodes.isEmpty()){
			BTNode<Integer> current = pendingNodes.dequeue();
			if(maxNode == null){
				maxNode = current;
			}
			else if(maxNode.data > current.data){
					maxNode = current;
			}
		}
		return maxNode;		
	}
}
