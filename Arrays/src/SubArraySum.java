
public class SubArraySum {

	public static void subArraySum(int[] a, int sum) {

		int temp_sum = a[0], start_index = 0;
		boolean found = false;

		for (int i = 1; i <= a.length; i++) {
			
			while (temp_sum > sum && start_index < i - 1) {
				temp_sum = temp_sum - a[start_index];
				start_index++;
			}

			if (temp_sum == sum) {
				System.out.println("Subarray found between indices: " + start_index + " and " + (i - 1));
				found = true;
			}

			if (i < a.length) {
				temp_sum = temp_sum + a[i];
			}
		}

		if (!found)
			System.out.println("Subarray not found.");

	}

	public static void main(String args[]) {
		int a[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
		int sum = 0;
		subArraySum(a, sum);

	}

}
