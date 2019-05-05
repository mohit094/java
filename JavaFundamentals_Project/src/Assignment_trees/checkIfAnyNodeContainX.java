package Assignment_trees;

public class checkIfAnyNodeContainX {
	public static void main(String[] args) {
		
	}
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		// Write your code here
		if(root == null){
		    return false;
		}
		boolean flag = false;
		if(root.data == x){
			return true;
		}
		for(int i = 0; i<root.children.size();i++){
			boolean result = checkIfContainsX(root.children.get(i),x);
			if(result == true){
				flag = result;
			}
		}
		return flag;
	}
}
