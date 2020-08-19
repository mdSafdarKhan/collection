package collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * The following program uses a vector to store various types of numeric
 * objects. It demonstrates several of the legacy methods defined by Vector. It
 * also demonstrates the Enumeration interface.
 * 
 * @author Safdar.Khan
 *
 */
public class P17_VectorDemo {

	public static void main(String[] args) {
		// initial size is 3, increment is 2
		Vector<Integer> v = new Vector<>(3, 2);

		System.out.println("initial size " + v.size());
		System.out.println("initial capacity " + v.capacity());

		v.addElement(5);
		v.addElement(4);
		v.addElement(3);
		v.addElement(2);

		System.out.println("capacity after addition " + v.capacity());

		v.addElement(1);

		System.out.println("current capacity " + v.capacity());

		v.addElement(12);
		v.addElement(13);

		System.out.println("current capacity " + v.capacity());

		v.addElement(14);
		v.addElement(15);

		System.out.println("current capacity " + v.capacity());

		v.addElement(16);
		v.addElement(17);

		System.out.println("first element " + v.firstElement());
		System.out.println("last element " + v.lastElement());

		if (v.contains(3))
			System.out.println("v contains 3");

		Enumeration<Integer> em = v.elements();
		while (em.hasMoreElements())
			System.out.print(em.nextElement() + " ");
		System.out.println();

	}

}
