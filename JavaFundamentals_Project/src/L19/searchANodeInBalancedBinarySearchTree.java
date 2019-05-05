package L19;

public class searchANodeInBalancedBinarySearchTree {
	public static void main(String[] args) {
		
	}
	public static boolean search(BTNode<Integer> root, int x){
		if(root == null){
			return false;
		}
		boolean flag = false;
		if(root.data == x){
			return true;
		}
		if(root.data>= x){
			boolean value = search(root.left,x);
			flag = value;
		}
		else{
			boolean value = search(root.right,x);
			flag = value;
		}
		
		return flag;
	}
}
