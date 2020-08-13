import java.util.Arrays;

public class MinHeap {

	private static void build_heap(int[] a) {
		for (int i = a.length / 2 - 1; i >= 0; i--)
			min_heapify(i, a);

	}

	private static void min_heapify(int i, int[] a) {
		int smallest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < a.length && a[left] < a[smallest])
			smallest = left;

		if (right < a.length && a[right] < a[smallest])
			smallest = right;

		if (smallest != i) {
			int temp = a[smallest];
			a[smallest] = a[i];
			a[i] = temp;
		}

	}

	public static void main(String args[]) {
		int a[] = { 45, 3, 5, 4, 6, 13, 10, 1, 9, 8, 15, 17 };
		build_heap(a);
		System.out.println(Arrays.toString(a));

	}

}
