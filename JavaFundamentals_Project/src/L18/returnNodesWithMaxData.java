package L18;

public class returnNodesWithMaxData {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		TreeNode<Integer> max = returnMaxNode(root);
		System.out.println("Max Node Data :-" + max.data);
	}
	public static TreeNode<Integer> returnMaxNode(TreeNode<Integer> root){
		if(root == null){
			return root;
		}
		TreeNode<Integer> max = root;
		for(int i = 0; i<root.children.size(); i++){
			TreeNode<Integer> maxChildren =  returnMaxNode(root.children.get(i));
			if(max.data<maxChildren.data){
				max = maxChildren;
			}
		}
		return max;
	}
}
