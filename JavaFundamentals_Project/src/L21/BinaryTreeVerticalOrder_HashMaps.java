package L21;

import java.util.ArrayList;
import java.util.HashMap;

import L17.QueueEmptyException;

public class BinaryTreeVerticalOrder_HashMaps {
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeUse obj = new BinaryTreeUse();
		BTNode<Integer> root = obj.takeInputLevelWise();
		binaryTreeVerticalOrder(root);
	}
	public static void binaryTreeVerticalOrder(BTNode<Integer> root){
		
		HashMap<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>(); 
		addKey(root,m,0);
		// traverse all key value pair for Hash Maps
		//keyset() is a function which gives all the keys present in the hashmaps. It returns a linear data structure of type Set
		for (Integer key : m.keySet()) {
			ArrayList<Integer> t = m.get(key);
			for(int k : t){
				System.out.print(k + " ");
			}
			System.out.println();
			
			// another way of traversing arraylist is -> System.out.println(t); it prints all the values in the arraylist sequentially.
		}
	}
	public static void addKey (BTNode<Integer> root, HashMap<Integer,ArrayList<Integer>> m, int key){
		if(root == null){
			return;
		}
		addKey(root.left,m,key-1);
		addKey(root.right,m,key+1);
		if(m.containsKey(key)){
			ArrayList<Integer> t = m.get(key);
			t.add(root.data);
			m.put(key,t);
		}
		else{
			ArrayList<Integer> t = new ArrayList<Integer>();
			t.add(root.data);
			m.put(key,t);
		}
	}
}
