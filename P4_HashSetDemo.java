package collection;

import java.util.HashSet;

/**
 * As explained, the elements are not stored in sorted order, and the precise
 * output may vary.
 * 
 * @author Safdar.Khan
 *
 */
//demonstrate HashSet
public class P4_HashSetDemo {

	public static void main(String[] args) {
		// create a HashSet
		HashSet<String> hs = new HashSet<>();

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
