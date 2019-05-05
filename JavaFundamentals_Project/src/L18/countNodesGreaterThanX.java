package L18;

public class countNodesGreaterThanX {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		int count = countNodes(root,1);
		System.out.println("Count of Nodes greater than 1 are :- " +  count);
	}
	public static int countNodes(TreeNode<Integer> root, int x){
		if(root == null){
			return 0;
		}
		int count = 0;
		for(int i = 0; i<root.children.size(); i++){
			count = count + countNodes(root.children.get(i),x);
		}
		if(root.data>x){
			count = count + 1;
		}
		return count;
	}
}
