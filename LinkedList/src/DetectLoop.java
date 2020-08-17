public class DetectLoop {
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static boolean detectLoop(Node head) {
		Node slw_ptr = head, fast_ptr = head;

		while (slw_ptr != null && fast_ptr != null && fast_ptr.next != null) {
			slw_ptr = slw_ptr.next;
			fast_ptr = fast_ptr.next.next;

			if (slw_ptr == fast_ptr)
				return true;
		}
		return false;
	}

	public static void main(String args[]) {
		Node head = new Node(6);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		head.next.next.next.next = head.next.next;
		System.out.println("LinkedList has loop: "+detectLoop(head));
		
	
	}

}

