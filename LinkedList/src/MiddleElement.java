public class MiddleElement {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void printMiddle(Node head) {
		Node slw_ptr = head, fast_ptr = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (fast_ptr != null && fast_ptr.next != null) {
			slw_ptr = slw_ptr.next;
			fast_ptr = fast_ptr.next.next;
		}
		System.out.println("Middle element is :" + slw_ptr.data);
	}

	public static void main(String args[]) {
		Node head = new Node(6);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(9);
		printMiddle(head);
	}

}
