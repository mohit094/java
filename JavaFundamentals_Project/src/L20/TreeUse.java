package L20;

class Pair {
	TreeNode<Integer> node;
	int sum;
}

public class TreeUse {
	
	public static Pair maxChildSum_2(TreeNode<Integer> root) {
		int maxSum = root.data;
		for(int i = 0; i < root.children.size(); i++) {
			maxSum += root.children.get(i).data;
		}
		Pair ans = new Pair();
		ans.node = root;
		ans.sum = maxSum;
		
		for(int i = 0; i < root.children.size(); i++) {
			Pair childAns = maxChildSum_2(root.children.get(i));
			if(childAns.sum > ans.sum) {
				ans = childAns;
			}
		}
		
		return ans;
	}
	
	public static TreeNode<Integer> maxChildSum_3(TreeNode<Integer> root) {
		return maxChildSum_2(root).node;
	}
	
	
	public static TreeNode<Integer> maxChildSum(TreeNode<Integer> root) {
		TreeNode<Integer> max = root;
		int maxSum = root.data;
		for(int i = 0; i < root.children.size(); i++) {
			maxSum += root.children.get(i).data;
		}
		
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> childAns = maxChildSum(root.children.get(i));
			int childSum = childAns.data;
			for(int j = 0; j < childAns.children.size(); j++) {
				childSum += childAns.children.get(i).data;
			}
			if(childSum > maxSum) {
				max = childAns;
				maxSum = childSum;
			}
		}
		return max;
	}
}
