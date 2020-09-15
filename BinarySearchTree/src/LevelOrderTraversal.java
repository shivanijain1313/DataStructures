import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	public static void levelOrder(Node root) {

		if (root == null)
			return;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			Node element = queue.remove();
			System.out.println(element.data);

			if (element.left != null)
				queue.add(element.left);

			if (element.right != null)
				queue.add(element.right);
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
		levelOrder(root);
	}

}
