package Assignment_trees;

public class structural_IdenticalClass {
	public static void main(String[] args) {
		
	}
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){
		// Write your code here
		if(root1 == null || root2 == null){
			return false;
		}
		if(root1.children.size() != root2.children.size()){
			return false;
		}
		
		boolean flag = false;
		if(root1.data != root2.data){
			return flag;
		}
		else{
			flag = true;
		}
		
		for(int i = 0; i<root1.children.size(); i++){
			boolean value = checkIdentical(root1.children.get(i),root2.children.get(i));
			flag = value;
		}
		
		return flag;
	}
	
}
