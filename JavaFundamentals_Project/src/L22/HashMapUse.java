package L22;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

import L19.BTNode;
import L19.BinaryTreeUse;

public class HashMapUse {

	private static void helper(BTNode<Integer> root,
			HashMap<Integer, ArrayList<Integer>> m, int i) {
		if(root == null) {
			return;
		}
		
		helper(root.left, m, i-1);
		helper(root.right, m, i+1);
		
		if(m.containsKey(i)) {
			ArrayList<Integer> a = m.get(i);
			a.add(root.data);
			m.put(i, a);
		}
		else {
			ArrayList<Integer> a = new ArrayList<Integer>();
			a.add(root.data);
			m.put(i, a);
		}
	}
	
	public static void printTreeInVerticalOrder(BTNode<Integer> root) {
		HashMap<Integer, ArrayList<Integer>> m = new HashMap<Integer, ArrayList<Integer>>();
		
		helper(root, m, 0);
		
		// Print hashmap
		Set<Integer> s = m.keySet();
		for(int i : s) {
			ArrayList<Integer> a = m.get(i);
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
	}

	
}
