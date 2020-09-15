
public class SubArraySum {

	public static void subArraySum(int[] a, int size) {

		int temp_sum = 0;

		for (int i = 0; i < size; i++) {
			temp_sum += a[i];
		}

		System.out.print(temp_sum + " ");

		for (int i = size; i < a.length; i++) {
			temp_sum = temp_sum - a[i - size] + a[i];
			System.out.print(temp_sum + " ");
		}
	}

	public static void main(String args[]) {
		int a[] = { 4, 5, 6, 3, 9, 0, 2 };
		subArraySum(a, 3);

	}

}
