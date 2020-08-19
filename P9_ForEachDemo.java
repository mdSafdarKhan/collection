package collection;

import java.util.ArrayList;

/**
 * As you can see, the for loop is substantially shorter and simpler to use than
 * the iteratorbased approach. However, it can only be used to cycle through a
 * collection in the forward direction, and you can’t modify the contents of the
 * collection.
 * 
 * @author Safdar.Khan
 *
 */
//use for-each for loop to cycle through a collection
public class P9_ForEachDemo {

	public static void main(String[] args) {
		// Create an array list for integers.
		ArrayList<Integer> vals = new ArrayList<Integer>();
		// Add values to the array list.
		vals.add(1);
		vals.add(2);
		vals.add(3);
		vals.add(4);
		vals.add(5);

		// use for loop to display the values
		System.out.println("contents of vals");
		for (int v : vals) {
			System.out.print(v + " ");
		}
		System.out.println();

		// now sum the values by using a for loop
		int sum = 0;
		for (int v : vals) {
			sum += v;
		}
		System.out.println("sum of values " + sum);
	}

}
