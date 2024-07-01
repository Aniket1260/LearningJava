package dsa.java;

public class Trie {
	private TrieNode root;
	public Trie() {
		root = new TrieNode();
	}
	private class TrieNode{
		private TrieNode[] children;
		private boolean isWord;
		public TrieNode() {
			this.children = new TrieNode[26];
			this.isWord = false;
		}
	}
	public void insert(String word) {
		if (word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Word is null or empty");
		}
		word = word.toLowerCase();
		TrieNode current = root;
		for(int i = 0;i<word.length();i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if(current.children[index] == null) {
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			}
			else {
				current = current.children[index];
			}
		}
		current.isWord = true;
	}
	public boolean search(String word) {
		  if (word == null || word.isEmpty()) {
	            return false;
	        }
	        word = word.toLowerCase();
	        TrieNode current = root;
	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            int index = c - 'a';
	            if (current.children[index] == null) {
	                return false;
	            }
	            current = current.children[index];
	        }
	        return current.isWord;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Trie trie = new Trie();
	      trie.insert("cat");
	      trie.insert("cab");
	      trie.insert("son");
	      trie.insert("so");
//	      trie.insert(null);
	      trie.insert("");
	      System.out.println("Values inserted successfully !!!");
	      System.out.print(trie.search("cat"));
	}

}
