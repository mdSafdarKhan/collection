package collection;

import java.util.LinkedList;

/**
 * Because LinkedList implements the List interface, calls to add(E) append
 * items to the end of the list, as do calls to addLast( ). To insert items at a
 * specific location, use the add(int, E) form of add( ), as illustrated by the
 * call to add(1, "A2") in the example. Notice how the third element in ll is
 * changed by employing calls to get( ) and set( ). To obtain the current value
 * of an element, pass get( ) the index at which the element is stored. To
 * assign a new value to that index, pass set( ) the index and its new value.
 * 
 * @author Safdar.Khan
 *
 */
public class P3_LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		ll.add("C");
		ll.addFirst("A");
		ll.addLast("Z");
		ll.add(1, "A2");
		System.out.println("original contents of ll " + ll);
		ll.remove("F");
		ll.remove(2);
		System.out.println("contents of ll after deletion " + ll);
		ll.removeFirst();
		ll.removeLast();
		System.out.println("ll after deleting first and last " + ll);
		String val = ll.get(2);
		ll.set(2, val + " changed");
		System.out.println("ll after changed " + ll);
	}

}
