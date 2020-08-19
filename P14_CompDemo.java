package collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * Look closely at the MyComp class, which implements Comparator by implementing
 * compare( ). (As explained earlier, overriding equals( ) is neither necessary
 * nor common. It is also not necessary to override the default methods added by
 * JDK 8.) Inside compare( ), the String method compareTo( ) compares the two
 * strings. However, bStr—not aStr— invokes compareTo( ). This causes the
 * outcome of the comparison to be reversed.
 * 
 * @author Safdar.Khan
 *
 */
class MyComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		// Reverse the comparison.
		return o2.compareTo(o1);
	}

	// No need to override equals or the default methods.
}

public class P14_CompDemo {

	public static void main(String[] args) {
		
		//Prior JDK8
		//TreeSet<String> ts = new TreeSet<>(new MyComp());
		
		//Since JDK8
		TreeSet<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));

		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");

		for (String element : ts)
			System.out.print(element + " ");
		System.out.println();
	}

}
