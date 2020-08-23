
public class KnapSack {

	public static void main(String args[]) {
		int val[] = { 60, 100, 120 };
		int wt[] = { 10, 20, 30 };
		int W = 50;
		int n = wt.length;
		System.out.println(knapSack(wt, val, W, n));
	}

	public static int knapSack(int[] wt, int[] val, int W, int n) {
		int[][] t = new int[n + 1][W + 1];

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= W; j++) {
				if (i == 0 || j == 0) {
					t[i][j] = 0;
				}

				else if (wt[i - 1] > j)
					t[i][j] = t[i - 1][j];
				else
					t[i][j] = max(t[i - 1][j], val[i - 1] + t[i - 1][j - wt[i - 1]]);
			}
		}
		return t[n][W];
	}

	private static int max(int a, int b) {

		return a > b ? a : b;
	}

}
