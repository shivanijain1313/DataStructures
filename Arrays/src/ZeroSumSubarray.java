import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubarray {

	public static boolean isZeroSumSubarray(int[] a) {

		Set<Integer> set = new HashSet<>();
		int curr_sum = 0;

		for (int i = 0; i < a.length; i++) {
			curr_sum += a[i];
			if (set.contains(curr_sum) || curr_sum == 0 || a[i] == 0) {
				return true;
			}
			set.add(curr_sum);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 4, -6, 3, -1, 4, 2, 7 };

		if (isZeroSumSubarray(arr)) {
			System.out.println("Subarray exists");
		} else {
			System.out.println("Subarray do not exist");
		}

	}

}
