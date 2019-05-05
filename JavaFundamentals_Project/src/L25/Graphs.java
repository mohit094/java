package L25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import L17.QueueEmptyException;
import L17.QueueUsingLL;

public class Graphs {

	
	
	public static int findParent(int parent[], int i) {
		if(parent[i] == i) {
			return i;
		}
		return findParent(parent, parent[i]);
	}
	
	public static int[][] kruskals(int edges[][], int n) {
		int ans[][] = new int[n-1][2];
		int parent[] = new int[n];
		for(int i = 0; i < n; i++) {
			parent[i] = i;
		}
		int count = 0;
		int i = 0;
		while(count < n-1) {
			int x = edges[i][0];
			int y = edges[i][1];
			int xParent = findParent(parent, x);
			int yParent = findParent(parent, y); 
			if(xParent != yParent) {
				ans[count][0] = x;
				ans[count][1] = y;
				count++;
				if(xParent < yParent) {
					parent[yParent] = xParent;
				}
				else {
					parent[xParent] = yParent;
				}
			}
			i++;
		}
		return ans;
	}
/*	6
	8
	0 1
	1 2
	2 3
	3 0
	3 1
	4 3
	4
	4 5
	5 3*/
	
	
	public static void dfs(HashMap<Integer, ArrayList<Integer>> adjacencyList, int n) {
		boolean isVIsisted[] = new boolean[n];
		dfsHelper(adjacencyList, n, isVIsisted, 0);
	}
	
	private static void dfsHelper(
			HashMap<Integer, ArrayList<Integer>> adjacencyList, int n,
			boolean[] isVIsisted, int startVertex) {
		System.out.print(startVertex + " ");
		isVIsisted[startVertex] = true;
		ArrayList<Integer> a = adjacencyList.get(startVertex);
		for(int i : a) {
			if(isVIsisted[i] == false) {
				dfsHelper(adjacencyList, n, isVIsisted, i);
			}
		}
	}
	
	public static void bfs(HashMap<Integer, ArrayList<Integer>> adjacencyList, int n) throws QueueEmptyException {
		QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
		boolean isVisisted[] = new boolean[n];
		q.enqueue(0);
		while(!q.isEmpty()) {
			int current = q.dequeue();
			System.out.println(current);
			isVisisted[current] = true;
			ArrayList<Integer> a = adjacencyList.get(current);
			for(int i : a) {
				if(isVisisted[i] == false) {
					q.enqueue(i);
					isVisisted[i] = true;
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws QueueEmptyException {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int edges[][] = new int[e][2];
		HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<Integer, ArrayList<Integer>>();
		for(int i = 0; i < e; i++) {
			int source = s.nextInt();
			int dest = s.nextInt();
			edges[i][0] = source;
			edges[i][1] = dest;
			if(adjacencyList.containsKey(source)) {
				ArrayList<Integer> a = adjacencyList.get(source);
				a.add(dest);
			}
			else {
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(dest);
				adjacencyList.put(source, a);
			}
			
			if(adjacencyList.containsKey(dest)) {
				ArrayList<Integer> a = adjacencyList.get(dest);
				a.add(source);
			}
			else {
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(source);
				adjacencyList.put(dest, a);
			}
		}
		
		dfs(adjacencyList, n);
		System.out.println();
		bfs(adjacencyList, n);
		int ans[][] = kruskals(edges, n);
		for(int i = 0; i < ans.length; i++) {
			System.out.println(ans[i][0] + " " + ans[i][1]);
		}
	}
	
}
