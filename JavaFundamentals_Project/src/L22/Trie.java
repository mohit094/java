package L22;

public class Trie {
	TrieNode root;
	
	Trie() {
		root = new TrieNode('\0');
	}
	
	private void addWord(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		
		TrieNode child;
		if(root.children.containsKey(word.charAt(0))) {
			child = root.children.get(word.charAt(0));
		}
		else {
			child = new TrieNode(word.charAt(0));
			root.children.put(word.charAt(0), child);
		}
		addWord(child, word.substring(1));
	}
	
	public void addWord(String word) {
		addWord(root, word);
	}
	
	public void removeWord(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = false;
			return;
		}
		
		TrieNode child;
		if(root.children.containsKey(word.charAt(0))) {
			child = root.children.get(word.charAt(0));
		}
		else {
			return;
		}
		
		removeWord(child, word.substring(1));
		
		if(child.isTerminal == false && child.children.size() == 0) {
			root.children.remove(word.charAt(0));
		}
	}
	
	
	
	
	
	
	
}
