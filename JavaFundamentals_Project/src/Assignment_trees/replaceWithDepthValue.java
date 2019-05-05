package Assignment_trees;

public class replaceWithDepthValue {
	public static void main(String[] args) {
		
	}
	public static void replaceWithDepthValue2(TreeNode<Integer> root,int depth){

		// Write your code here
		if(root == null){
			return;
		}
		root.data = depth;
		for(int i = 0; i<root.children.size();i++){
			replaceWithDepthValue2(root.children.get(i),depth + 1);
		}
		return;
	}
}
