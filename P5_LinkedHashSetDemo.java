package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * LinkedHashSet maintains a linked list of the entries in the set
 * 
 * @author Safdar.Khan
 *
 */
//demonstrate LinkedHashSet
public class P5_LinkedHashSetDemo {

	public static void main(String[] args) {
		// create a HashSet
		HashSet<String> hs = new LinkedHashSet<>();

		// add elements to the hash set
		hs.add("Beta");
		hs.add("Alpha");
		hs.add("Eta");
		hs.add("Gamma");
		hs.add("Epsilon");
		hs.add("Omega");
		System.out.println(hs);
	}

}
