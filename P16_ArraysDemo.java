package collection;

import java.util.Arrays;

public class P16_ArraysDemo {

	public static void main(String[] args) {
		// allocate and initialize array
		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = -3 * i;
		}
		System.out.println("original content");
		display(arr);
		
		Arrays.sort(arr);
		System.out.println("sorted");
		display(arr);
		
		Arrays.fill(arr, 2, 6, -1);
		System.out.println("after fill");
		display(arr);
		
		Arrays.sort(arr);
		System.out.println("after sorting again");
		display(arr);
		
		System.out.print("the value -9 is at location ");
		int index = Arrays.binarySearch(arr, -9);
		System.out.println(index);
	}

	private static void display(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}

}
