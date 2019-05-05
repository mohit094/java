package Trees;

class pair{
	TreeNode<Integer> finalNode;
	int finalSum;
}

public class NodeHavingMaxSumIncludingChildren {
	public static pair maxSumNode(TreeNode<Integer> root){
		if(root == null){
			return null;
		}
		pair finalPair = new pair();
		finalPair.finalNode = root;
		int sum = 0;
		sum = sum + root.data;
		for(TreeNode<Integer> i : root.children){
			sum = sum + i.data;
		}
		finalPair.finalSum = sum;
		for(TreeNode<Integer> i : root.children){
			pair temp =  maxSumNode(i);
			if(temp!= null && temp.finalSum>finalPair.finalSum){
				finalPair = temp;
			}
		}
		
		return finalPair;
	}
}
