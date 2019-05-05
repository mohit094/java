package L25;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import L17.QueueEmptyException;
import L17.QueueUsingLL;

class pair{
	HashMap<Integer,ArrayList<Integer>> m;
	
}

public class graphs_OwnFunction {
	
	public static void dfs(HashMap<Integer,ArrayList<Integer>> m,int n){
		boolean[] isVisited = new boolean[n];
		dfsHelper(m,isVisited,0);
		System.out.println();
	}
	
	public static void dfsHelper(HashMap<Integer,ArrayList<Integer>> m,boolean[] isVisited,int startIndex){
		isVisited[startIndex] = true;
		System.out.print(startIndex + " ");
		ArrayList<Integer> t = m.get(startIndex);
		for(Integer i : t){
			if(isVisited[i] == false){
				dfsHelper(m,isVisited,i);
				isVisited[i] = true;
			}
		}
	}
	
	public static void bfs(HashMap<Integer,ArrayList<Integer>> m) throws QueueEmptyException{
		QueueUsingLL<Integer> q = new QueueUsingLL<Integer>();
		boolean isVisited[] = new boolean[m.size()];
		q.enqueue(0);
		while(!q.isEmpty()){
			int current = q.dequeue();
			isVisited[current] = true;
			System.out.print(current + " ");
			ArrayList<Integer> t = m.get(current);
			for(Integer i : t){
				if(isVisited[i] == false){
					q.enqueue(i);
					isVisited[i] = true;
				}
			}
		}
	}
	
	public static HashMap<Integer,ArrayList<Integer>> takeGraphInput(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		
		HashMap<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>(); 
		for(int i = 0; i<e; i++){
			int source = s.nextInt();
			int dest = s.nextInt();
			if(m.containsKey(source)){
				ArrayList<Integer> t = m.get(source);
				t.add(dest);
			}
			else{
				ArrayList<Integer> t = new ArrayList<Integer>();
				t.add(dest);
				m.put(source, t);
			}
			if(m.containsKey(dest)){
				ArrayList<Integer> t = m.get(dest);
				t.add(source);
			}
			else{
				ArrayList<Integer> t = new ArrayList<Integer>();
				t.add(source);
				m.put(dest, t);
			}
		}
		
		return m;
	}
	
	public static int[][] kruskal(int edges[][], int n){
		
		int[][] ans = new int[n-1][2];
		int[] parent = new int[n];
		for(int i : parent){
			parent[i] = i;
		}
		
		int i = 0;
		int count = 0;
		
		while(count<n-1){
			int x = edges[i][0];
			int y = edges[i][1];
			
			int xParent = findParent(parent,x);
			int yParent = findParent(parent,y);
			
			if(xParent!=yParent){
				ans[count][0] = x;
				ans[count][1] = y;
				
				if(xParent>yParent){
					parent[xParent] = yParent;
				}
				else{
					parent[yParent] = xParent;
				}
				
				count++;
			}
			
			i++;
		}
		
		return ans;
	}
	
	private static int findParent(int[] parent, int x) {
		// TODO Auto-generated method stub
		if(parent[x] == x){
			return x;
		}
		
		return findParent(parent,parent[x]);
	}

	public static void main(String[] args) throws QueueEmptyException {
		Graphs obj = new Graphs();
		HashMap<Integer,ArrayList<Integer>> m = takeGraphInput();
		dfs(m, m.size());
		bfs(m);
	}
	
	public static HashMap<Integer,ArrayList<Integer>> takeGraphInputWithWeight(){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();
		int [][] edges = new int [e][3];
		Array[] arr = new Array[e];
		
		HashMap<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>(); 
		for(int i = 0; i<e; i++){
			int source = s.nextInt();
			int dest = s.nextInt();
			int weight = s.nextInt();
			
			edges[i][0] = source;
			edges[i][1] = dest;
			edges[i][2] = weight;
			
			if(m.containsKey(source)){
				ArrayList<Integer> t = m.get(source);
				t.add(dest);
			}
			else{
				ArrayList<Integer> t = new ArrayList<Integer>();
				t.add(dest);
				m.put(source, t);
			}
			if(m.containsKey(dest)){
				ArrayList<Integer> t = m.get(dest);
				t.add(source);
			}
			else{
				ArrayList<Integer> t = new ArrayList<Integer>();
				t.add(source);
				m.put(dest, t);
			}
		}
		
		return m;
	}
}
