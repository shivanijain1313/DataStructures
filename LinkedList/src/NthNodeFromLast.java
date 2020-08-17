

public class NthNodeFromLast {

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void getNthFromLast(Node head, int n) {

		Node ref_ptr = head, main_ptr = head;
		int count = 0;

		if (head != null) {
			while (count != n) {
				if (ref_ptr == null) {
					System.out.println(n + " is greater than the length of linkedlist");
				}
				ref_ptr = ref_ptr.next;
				count++;
			}

			while (ref_ptr != null) {
				ref_ptr = ref_ptr.next;
				main_ptr = main_ptr.next;
			}
		}
		System.out.println("Nth node from last is: "+ main_ptr.data);
	}
	
	public static void main(String args[]) {
		Node head = new Node(6);
		head.next = new Node(3);
		head.next.next = new Node(4);
		head.next.next.next = new Node(5);
		getNthFromLast(head,2);
	}

}
