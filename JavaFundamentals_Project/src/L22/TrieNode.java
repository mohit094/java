package L22;

import java.util.HashMap;

public class TrieNode {
	char data;
	HashMap<Character, TrieNode> children;
	
	boolean isTerminal;
	
	TrieNode(char data) {
		this.data = data;
		children = new HashMap<Character, TrieNode>();
		isTerminal = false;
	}
}
