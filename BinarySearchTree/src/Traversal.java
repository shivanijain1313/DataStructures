
/**
 * Inorder, PreOrder and PostOrder Tree Traversal (Complexity: O(n))
 *
 */
public class Traversal {

	public static void inorderTraversal(Node root) {

		if (root != null) {
			inorderTraversal(root.left);
			System.out.print(root.data + " ");
			inorderTraversal(root.right);
		}

	}

	public static void preOrderTraversal(Node root) {

		if (root != null) {
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}

	public static void postOrderTraversal(Node root) {

		if (root != null) {
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			System.out.print(root.data + " ");
		}
	}

	public static void main(String args[]) {
		Node root = null;
		root = BST.insert(root, 50);
		BST.insert(root, 30);
		BST.insert(root, 20);
		BST.insert(root, 40);
		BST.insert(root, 70);
		BST.insert(root, 60);
		BST.insert(root, 80);

		System.out.print("Inorder Traversal: ");
		inorderTraversal(root);

		System.out.print("\nPreOrder Traversal: ");
		preOrderTraversal(root);

		System.out.print("\nPostOrder Traversal: ");
		postOrderTraversal(root);
	}

}
