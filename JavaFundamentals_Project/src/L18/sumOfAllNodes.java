package L18;

public class sumOfAllNodes {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		int sum = sum(root);
		System.out.println("The sum is :- " + sum);
	}
	public static int sum(TreeNode<Integer> root){
		if(root == null){
			return 0;
		}
		
		int sum = 0;
		for(int i = 0; i<root.children.size(); i++){
			int childrenSum = sum(root.children.get(i));
			sum = sum + childrenSum;
		}
		sum = sum + root.data;
		return sum;
	}
}
