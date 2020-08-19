package collection;

import java.util.ArrayList;

//convert an ArrayList into an array
public class P2_ArrayListToArray {

	public static void main(String[] args) {
		// create an array list
		ArrayList<Integer> al = new ArrayList<>();

		// add elements to the array list
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		System.out.println("contents of al " + al);

		// get the array
		Integer[] ia = new Integer[al.size()];
		ia = al.toArray(ia);
		int sum = 0;

		// sum the array
		for (int i : ia)
			sum += i;
		System.out.println("sum is " + sum);
	}

}
