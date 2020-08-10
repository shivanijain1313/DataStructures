
public class KadaneAlgorithm {

	public static void maxSumSubArray(int[] a) {
		int max_so_far = Integer.MIN_VALUE;
		int max_ending_here = 0;

		for (int i = 0; i < a.length; i++) {
			max_ending_here = max_ending_here + a[i];

			if (max_so_far < max_ending_here)
				max_so_far = max_ending_here;

			if (max_ending_here < 0)
				max_ending_here = 0;
		}

		System.out.println("Maximum contiguous sum is: " + max_so_far);
	}

	public static void main(String args[]) {
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		maxSumSubArray(a);

	}

}
