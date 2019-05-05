package Trees;

public class checkIfContainsX {
	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){
		if(root == null){
			return false;
		}
		boolean flag = false;
		
		if(root.data == x){
			return true;
		}
		
		for(TreeNode<Integer> i : root.children){
			flag = checkIfContainsX(i,x);
			if(flag == true){
				break;
			}
		}
		
		return flag;
	}
}
