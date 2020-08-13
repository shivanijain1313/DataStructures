import java.util.Arrays;


//Complexity O(n)
public class MaxHeap {

	public static void build_heap(int[] a) {
		for (int i = a.length / 2 - 1; i >= 0; i--) {
			max_heapify(i, a);
		}
	}

	private static void max_heapify(int i, int[] a) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if (left < a.length && a[left] > a[largest])
			largest = left;
		
		if (right < a.length && a[right] > a[largest])
			largest = right;
		
		if (largest != i) {
			int temp = a[i];
			a[i] = a[largest];
			a[largest] = temp;
			max_heapify(largest, a);
		}

	}

	public static void main(String args[]) {
		int a[] = {1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17 };
		build_heap(a);
		System.out.println(Arrays.toString(a));

	}

}
