package L19;

public class diameterOfTree {
	class diameterPair{
		int height = 0;
		int diameter = 0;
	}
	public static void main(String[] args) {
		
	}
	public static int height(BTNode<Integer> root){
		if(root == null){
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		return Math.max(leftHeight, rightHeight) + 1;
	}
	public static int diameter(BTNode<Integer> root){
		if(root == null){
			return 0;
		}
		int diameter1 = height(root.left) + height(root.right) + 1;
		int diameter2 = height(root.left);
		int diameter3 = height(root.right);
		return Math.max(diameter1, Math.max(diameter2, diameter3));
	}
	
}
