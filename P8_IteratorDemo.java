package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * The following example implements these steps, demonstrating both the Iterator
 * and ListIterator interfaces. It uses an ArrayList object, but the general
 * principles apply to any type of collection. Of course, ListIterator is
 * available only to those collections that implement the List interface.
 * 
 * @author Safdar.Khan
 *
 */

//demonstrate iterators	
public class P8_IteratorDemo {

	public static void main(String[] args) {
		// create an array list
		ArrayList<String> al = new ArrayList<>();
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		System.out.println("original content of al " + al);

		// use iterator to display contents of al
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// modify object being iterated
		ListIterator<String> litr = al.listIterator();
		while (litr.hasNext()) {
			String element = litr.next();
			litr.set(element + "+");
		}
		System.out.println("modified contents of al");
		itr = al.iterator();
		while (itr.hasNext()) {
			String element = itr.next();
			System.out.print(element + " ");
		}
		System.out.println();

		// now display the list backwards
		System.out.println("modified list backwards");
		while (litr.hasPrevious()) {
			String element = litr.previous();
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
