package collection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/**
 * The following program demonstrates some of the algorithms. It creates and
 * initializes a linked list. The reverseOrder( ) method returns a Comparator
 * that reverses the comparison of Integer objects. The list elements are sorted
 * according to this comparator and then are displayed. Next, the list is
 * randomized by calling shuffle( ), and then its minimum and maximum values are
 * displayed.
 * 
 * Notice that min( ) and max( ) operate on the list after it has been shuffled.
 * Neither requires a sorted list for its operation.
 * 
 * @author Safdar.Khan
 *
 */

//Demonstrate various algorithms.
public class P15_AlgorithmsDemo {

	public static void main(String[] args) {
		// Create and initialize linked list.
		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(-8);
		ll.add(20);
		ll.add(-20);
		ll.add(8);

		// Create a reverse order comparator.
		Comparator<Integer> comp = Collections.reverseOrder();

		// Sort list by using the comparator.
		Collections.sort(ll, comp);

		// Display the sorted elements.
		for (int i : ll) {
			System.out.print(i + " ");
		}
		System.out.println();

		// Shuffle list.
		Collections.shuffle(ll);

		// Display randomized list.
		for (int i : ll) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("min " + Collections.min(ll));
		System.out.println("max " + Collections.max(ll));
	}

}
