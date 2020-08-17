
public class StackAsLinkedList {

	static class StackNode {
		int data;
		StackNode next;

		public StackNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	StackNode root;

	public void push(int data) {
		StackNode node = new StackNode(data);

		if (root == null) {
			root = node;
		} else {
			node.next = root;
			root = node;
		}
		System.out.println(data + " pushed to the Stack");
	}

	public int pop() {

		if (root == null) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			int element = root.data;
			root = root.next;
			System.out.println(element + " popped from the Stack");
			return element;
		}
	}

	public int peek() {

		if (root == null) {
			System.out.println("Stack is empty");
			return 0;
		} else {
			return root.data;
		}
	}

	public boolean isEmpty() {
		return root == null;
	}

	public static void main(String[] args) {

		StackAsLinkedList stack = new StackAsLinkedList();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println("Top element is " + stack.peek());
	}

}
