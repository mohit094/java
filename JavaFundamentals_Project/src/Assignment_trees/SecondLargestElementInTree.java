package Assignment_trees;

class  pair<T>{
	T largest = null;
	T secondLargest = null;
}
public class SecondLargestElementInTree {
	public static void main(String[] args) throws QueueEmptyException {
		TreeUse obj = new TreeUse();//object of tree use class to use its function
		TreeNode<Integer> root = obj.takeInputLevelWise();
		pair<TreeNode<Integer>> obj1 = findSecondLargest(root);
		if(obj1.secondLargest!=null){
			System.out.println("result :- " + obj1.secondLargest.data);
		}
		else{
			System.out.println("null");
		}
		
	}

	public static pair<TreeNode<Integer>> findSecondLargest(TreeNode<Integer> root){
		// Write your code here
		//if root is null
		if(root == null){
			pair<TreeNode<Integer>> obj = new pair<TreeNode<Integer>>();
			obj.largest = null;
			obj.secondLargest = null;
			return obj;
		}
		//when children are zero then i will get only one value i.e. largest
		if(root.children.size() == 0){
			pair<TreeNode<Integer>> obj = new pair<TreeNode<Integer>>();
			obj.largest = root;
			obj.secondLargest = null;
			return obj;
		}
		
		TreeNode<Integer> temp = root;
		
		pair<TreeNode<Integer>> finalObj = new pair<TreeNode<Integer>>(); 
		//now traverse each child and update value of finalObj for largestand second largest
		// cases can be 1. final.largest can be null 2. final.largest is not null then compare values with obj.largest
		//3.finalObj.secondLargest is null or less than obj.largest or second largest.
		
		for(int i = 0; i<root.children.size(); i++){
			pair<TreeNode<Integer>> obj = findSecondLargest(root.children.get(i));
			if(obj.largest != null){
				if(finalObj.largest == null){
					finalObj.largest = obj.largest;
				}
				else if(finalObj.largest != null && finalObj.secondLargest == null){
					if(finalObj.largest.data > obj.largest.data){
						finalObj.secondLargest = obj.largest;
					}
					if(finalObj.largest.data < obj.largest.data){
						finalObj.secondLargest = finalObj.largest;
						finalObj.largest = obj.largest;
					}
				}
				else if(finalObj.largest != null && finalObj.secondLargest != null){
					if(finalObj.largest.data < obj.largest.data){
						finalObj.secondLargest = finalObj.largest;
						finalObj.largest = obj.largest;
					}
					if(finalObj.largest.data < obj.largest.data && obj.largest.data > finalObj.secondLargest.data){
						finalObj.secondLargest = obj.largest;
					}
				}
			}
			if(obj.secondLargest != null){
				if(finalObj.largest != null && finalObj.secondLargest == null){
					if(finalObj.largest.data > obj.secondLargest.data){
						finalObj.secondLargest = obj.secondLargest;
					}
					if(finalObj.largest.data < obj.secondLargest.data){
						finalObj.secondLargest = finalObj.largest;
						finalObj.largest = obj.secondLargest;
					}
				}
				else if(finalObj.largest != null && finalObj.secondLargest != null){
					if(finalObj.largest.data < obj.secondLargest.data){
						finalObj.secondLargest = finalObj.largest;
						finalObj.largest = obj.secondLargest;
					}
					if(finalObj.largest.data < obj.secondLargest.data && obj.secondLargest.data > finalObj.secondLargest.data){
						finalObj.secondLargest = obj.secondLargest;
					}
				}
			}
		}
		//after getting finalobj compare its values with root data
		if(root.data > finalObj.largest.data){
			finalObj.secondLargest = finalObj.largest;
			finalObj.largest = root;
		}
		else if(finalObj.secondLargest == null && root.data != finalObj.largest.data){
			finalObj.secondLargest = root;
		}
		else if(finalObj.secondLargest != null && root.data > finalObj.secondLargest.data){
			finalObj.secondLargest = root;
		}
		return finalObj;
	}

}
