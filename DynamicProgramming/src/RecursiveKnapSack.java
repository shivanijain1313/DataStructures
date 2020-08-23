
public class RecursiveKnapSack {

	public static void main(String args[]) {
		int val[] = { 60, 100, 120 };
		int wt[] = { 10, 20, 30 };
		int W = 50;
		int n = wt.length - 1;
		System.out.println(knapsack(wt, val, W, n));
	}

	public static int knapsack(int[] wt, int[] val, int W, int n) {
		if (W == 0 || n == 0) {
			return 0;
		}

		if (wt[n] > W) {
			return knapsack(wt, val, W, n - 1);
		} else {
			return max(knapsack(wt, val, W, n - 1), val[n] + knapsack(wt, val, W - wt[n], n - 1));
		}
	}

	public static int max(int a, int b) {
		return a > b ? a : b;
	}

}
