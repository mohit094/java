package L18;

public class printAllNodesAtDepthK {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		print(root,2);
	}
	public static void print(TreeNode<Integer> root, int k){
		if(root == null){
			return;
		}
		if(k == 0){
			System.out.print(root.data + " ");
			return;
		}
		for(int i = 0; i<root.children.size(); i++){
			print(root.children.get(i),k-1);
		}
		return;
	}
}
