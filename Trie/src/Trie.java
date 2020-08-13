import java.util.HashMap;
import java.util.Map;

/**
 * Trie Node structure
 *
 */
class TrieNode {

	Map<Character, TrieNode> children = new HashMap<>();

	boolean isEndOfWord;

	public Map<Character, TrieNode> getChildren() {
		return children;
	}
}

/**
 * Trie Implementation
 *
 */
public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void insert(String word) {

		TrieNode current = root;

		for (char l : word.toCharArray()) {
			current = current.getChildren().computeIfAbsent(l, c -> new TrieNode());
		}
		current.isEndOfWord = true;
	}

	public boolean search(String word, Trie trie) {

		TrieNode current = trie.root;

		for (char l : word.toCharArray()) {
			TrieNode node = current.getChildren().get(l);

			if (node == null)
				return false;
			
			current = node;

		}
		return current.isEndOfWord;
	}

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("Geek");
		System.out.println(trie.search("Geeks", trie));

	}
}
