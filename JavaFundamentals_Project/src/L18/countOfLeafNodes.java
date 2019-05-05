package L18;

public class countOfLeafNodes {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		int numOfLeafs = countLeafs(root);
		System.out.println("No Of leafs are :-" + numOfLeafs);
	}
	public static int countLeafs(TreeNode<Integer> root){
		if(root == null){
			return 0;
		}
		int leaf = 0;
		for(int i = 0; i < root.children.size();i++){
			leaf = leaf + countLeafs(root.children.get(i));
		}
		if(root.children.size() == 0){
			leaf = leaf + 1;
		}
		return leaf;
	}
}
