package L20;

import L17.QueueEmptyException;

class pairBST{
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	boolean result = true;
}
public class ConfirmBST {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BTNode<Integer> root = obj.takeInputLevelWise();
/*		pairBST resultPair =confirmBST(root);
		System.out.println(resultPair.result);*/
		boolean result =confirmBST2(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		System.out.println(result);
	}
	public static pairBST confirmBST(BTNode<Integer> root){
		if(root == null){
			pairBST newPair = new pairBST();
			return newPair;
		}
		pairBST leftBST = confirmBST(root.left);
		pairBST rightBST = confirmBST(root.right);
		
		pairBST rootBST = new pairBST();
		if(root.left == null && root.right == null){
			rootBST.max = root.data;
			rootBST.min = root.data;
			return rootBST;
		}
		else if(root.left == null && root.right!=null){
			rootBST.min = root.data;
			if(rightBST.result == true){
				if(root.data<=rightBST.max && root.data<=rightBST.min){
					rootBST.max = rightBST.max;
					return rootBST;
				}
				else{
					rootBST.result = false;
					return rootBST;
				}
			}
			else{
				rootBST.result = false;
				return rootBST;
			}
		}
		else if(root.left != null && root.right==null){
			rootBST.max = root.data;
			if(leftBST.result == true){
				if(root.data>leftBST.max && root.data>leftBST.min){
					rootBST.min = leftBST.min;
					return rootBST;
				}
				else{
					rootBST.result = false;
					return rootBST;
				}
			}
			else{
				rootBST.result = false;
				return rootBST;
			}
		}
		else{
			if(leftBST.result == true && rightBST.result == true){
				if(root.data>leftBST.max && root.data>leftBST.min){
					rootBST.min = leftBST.min;
				}
				else{
					rootBST.result = false;
					return rootBST;
				}
				if(root.data<=rightBST.max && root.data<=rightBST.min){
					rootBST.max = rightBST.max;
				}
				else{
					rootBST.result = false;
					return rootBST;
				}
				return rootBST;
			}
			else{
				rootBST.result = false;
				return rootBST;
			}
		}
	}
//code second approach 
	public static boolean confirmBST2(BTNode<Integer> root,int min, int max){
		if(root == null){
			return true;
		}
		boolean flag = false;
		if(root.data<max && root.data>min){
			flag = true;
		}
		
		boolean leftResult = confirmBST2(root.left,min,root.data);
		boolean rightResult = confirmBST2(root.right,root.data-1,max);
		
		if(flag && leftResult && rightResult){
			flag = true;
		}
		else{
			flag = false;
		}
		
		return flag;
		
	}
}
