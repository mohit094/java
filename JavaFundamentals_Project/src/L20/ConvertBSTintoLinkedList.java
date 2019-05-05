package L20;

import L17.QueueEmptyException;

class pairClass{
	Node<Integer> head = null;
	Node<Integer> tail = null;
}
public class ConvertBSTintoLinkedList {
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BTNode<Integer> root = obj.takeInputLevelWise();
		pairClass sortedLinkedList =  convertBSTintoLL(root);
		Node<Integer> temp = sortedLinkedList.head;
		while(temp!=null){
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
	//10 5 20 1 7 15 30 -1 -1 6 -1 -1 19 -1 -1 -1 -1 -1 -1
	public static pairClass convertBSTintoLL(BTNode<Integer> root){
		if(root == null){
			pairClass newObj = new pairClass();
			newObj.head = null;
			newObj.tail = null;
			return newObj;
		}
		pairClass left_LL = convertBSTintoLL(root.left);
		pairClass right_LL = convertBSTintoLL(root.right);
		
		pairClass rootPair = new pairClass();
		if(left_LL.head == null){
			rootPair.head = new Node<Integer>(root.data);
			rootPair.head.next = right_LL.head;
			if(right_LL.head == null){
				rootPair.tail = rootPair.head;
			}
			else{
				rootPair.tail = right_LL.tail;
			}
			return rootPair;
		}
		else{
			rootPair.head = left_LL.head;
			Node<Integer> newNode = new Node<Integer>(root.data);
			left_LL.tail.next = newNode;
			newNode.next = right_LL.head;
			if(right_LL.head == null){
				rootPair.tail = newNode;
			}
			else{
				rootPair.tail = right_LL.tail;
			}
			return rootPair;
		}
	}
}
