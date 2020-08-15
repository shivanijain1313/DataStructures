
class Node {
	public Node(int data) {
		this.data = data;
		left = right = null;
	}

	int data;
	Node left, right;
}


/**
 * Insertion in BST: Complexity (Average: O(log n), Worst: O(n))
 * Searching in BST: Complexity (Average: O(log n), Worst: O(n))
 *
 */
public class BST {

	public static Node insert(Node root, int data) {
		if (root == null) {
			root = new Node(data);
			return root;
		}

		if (data < root.data)
			root.left = insert(root.left, data);

		else if (data > root.data)
			root.right = insert(root.right, data);

		return root;
	}

	public static boolean search(Node root, int data) {
		
		if(root == null) {
			return false;
		}

		if (root.data == data)
			return true;

		if (data < root.data)
			return search(root.left, data);

		return search(root.right, data);

	}

	public static void main(String args[]) {
		Node root = null;
		root = insert(root, 50);
		insert(root, 30);
		insert(root, 20);
		insert(root, 40);
		insert(root, 70);
		insert(root, 60);
		insert(root, 80);

		System.out.println(search(root, 10));

	}

}
