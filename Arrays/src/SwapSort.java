import java.util.Arrays;

public class SwapSort {

	public static void singleSwapSort(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			while (i != a[i] && i < a.length) {
				int temp = a[i];
				a[i] = a[temp];
				a[temp] = temp;
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String args[]) {
		int a[] = { 3, 4, 0, 1, 2 };
		singleSwapSort(a);

	}

}
