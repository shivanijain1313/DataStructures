
public class SubSetSum {

	public static void main(String args[]) {
		int set[] = { 3, 34, 4, 12, 5, 2 };
		int sum = 7;
		int n = set.length;
		if (isSubsetSum(set, n, sum) == true)
			System.out.println("Found a subset with given sum");
		else
			System.out.println("No subset with given sum");
	}

	private static boolean isSubsetSum(int[] set, int n, int sum) {
		boolean t[][] = new boolean[n + 1][sum + 1];

		for (int i = 0; i <= n; i++) {
			t[i][0] = true;
		}

		for (int j = 1; j <= sum; j++) {
			t[0][j] = false;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sum; j++) {

				if (set[i - 1] > j)
					t[i][j] = t[i - 1][j];
				else
					t[i][j] = t[i - 1][j] || t[i - 1][j - set[i - 1]];

			}
		}
		return t[n][sum];

	}

}
