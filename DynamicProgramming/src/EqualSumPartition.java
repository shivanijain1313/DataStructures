
public class EqualSumPartition {

	public static void main(String[] args) {
		int arr[] = { 3, 1, 1, 2, 2, 1 };
		int n = arr.length;
		if (findPartition(arr, n))
			System.out.println("Can be divided into two subsets of equal sum");
		else
			System.out.println("Can not be divided into two subsets of equal sum");

	}

	private static boolean findPartition(int[] arr, int n) {
		int sum = 0;

		for (int i = 0; i < n; i++)
			sum += arr[i];

		if (sum % 2 != 0)
			return false;
		else
			return isSubSetSum(arr, n, sum / 2);

	}

	private static boolean isSubSetSum(int[] arr, int n, int sum) {
		boolean t[][] = new boolean[n + 1][sum + 1];

		for (int i = 0; i <= n; i++) {
			t[i][0] = true;
		}
		for (int j = 1; j <= sum; j++) {
			t[0][j] = true;
		}

		for (int i = 1; i < n + 1; i++) {
			for (int j = 1; j < sum + 1; j++) {

				if (arr[i - 1] > j)
					t[i][j] = t[i - 1][j];
				else
					t[i][j] = t[i - 1][j] || t[i - 1][j - arr[i-1]];
			}
		}
		return t[n][sum];
	}

}
