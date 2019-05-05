package Trees;

class  temp<T>{
	T largest = null;
	T secondLargest = null;
}
public class secondLargest {
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){
		temp<TreeNode<Integer>> n = new temp<TreeNode<Integer>>();
		findSecondLargest2(root,n);
		return n.secondLargest;
	}
	
	public static void findSecondLargest2(TreeNode<Integer> root, temp<TreeNode<Integer>> n){
		if(root == null){
			return;
		}
		
		for(TreeNode<Integer> childrenNode : root.children){
			findSecondLargest2(childrenNode,n);
		}
		
		if(n.largest == null){
			n.largest = root;
		}
		else if(n.secondLargest == null && root.data<n.largest.data){
			n.secondLargest = root;
		}
		else if(root.data>n.largest.data){
			n.secondLargest = n.largest;
			n.largest = root;
		}
		else if(n.secondLargest!=null && root.data >= n.secondLargest.data){
			n.secondLargest = root;
		}
	}
}
