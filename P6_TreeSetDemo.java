package collection;

import java.util.TreeSet;

/**
 * As explained, because TreeSet stores its elements in a tree, they are
 * automatically arranged in sorted order, as the output confirms.
 * 
 * @author Safdar.Khan
 *
 */

//demonstrate TreeSet
public class P6_TreeSetDemo {

	public static void main(String[] args) {
		// create a tree set
		TreeSet<String> ts = new TreeSet<>();

		// add elements to the tree set
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		System.out.println(ts);
	}

}
