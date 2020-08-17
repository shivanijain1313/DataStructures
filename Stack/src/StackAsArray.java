
/**
 * Stack Implementation using array
 *
 */
public class StackAsArray {

	private int MAX_SIZE = 1000;
	private int a[] = new int[MAX_SIZE];
	int top = -1;

	public boolean push(int data) {

		if (top == MAX_SIZE) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = data;
			System.out.println(data+ " pushed into the stack");
			return true;
		}
	}

	public int pop() {

		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int element = a[top--];
			return element;
		}
	}

	public int peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		} else {
			int element = a[top];
			return element;
		}
	}

	boolean isEmpty() {
		return top < 0;
	}
	
	public static void main(String args[]) {
		StackAsArray stack = new StackAsArray();
		stack.push(10); 
		stack.push(20); 
		stack.push(30); 
        System.out.println(stack.pop() + " Popped from stack"); 
	}

}
