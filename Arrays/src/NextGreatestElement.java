import java.util.Arrays;
import java.util.Stack;

public class NextGreatestElement {

	public static int[] nextGreater(int[] a) {

		int[] output = new int[a.length];
		Stack<Integer> stack = new Stack<>();

		for (int i = a.length - 1; i >= 0; i--) {

			while (!stack.isEmpty() && stack.peek() < a[i])
				stack.pop();

			if (stack.isEmpty())
				output[i] = -1;
			else
				output[i] = stack.peek();
			stack.push(a[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 3, 9, 0, 2 };
		int[] output = nextGreater(a);
		
		System.out.println(Arrays.toString(output));
		

	}

}
