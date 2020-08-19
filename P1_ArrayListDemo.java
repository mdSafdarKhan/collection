package collection;

import java.util.ArrayList;

/**
 * Notice that a1 starts out empty and grows as elements are added to it. When
 * elements are removed, its size is reduced.
 * 
 * @author Safdar.Khan
 *
 */

//demonstrate Arrayist
public class P1_ArrayListDemo {

	public static void main(String[] args) {
		// create an ArrayList
		ArrayList<String> al = new ArrayList<>();
		System.out.println("initial size of al " + al.size());

		// add elements to the array list
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		al.add(1, "A2");
		System.out.println("size of al after addition " + al.size());

		// display the array list
		System.out.println("contents of al " + al);

		// remove elements from the array list
		al.remove("F");
		al.remove(2);
		System.out.println("size of al after deletion " + al.size());
		System.out.println("contents of al " + al);
	}

}
