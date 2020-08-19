package collection;

import java.util.ArrayList;
import java.util.Spliterator;

/**
 * The following program provides a simple example of Spliterator. Notice that
 * the program demonstrates both tryAdvance( ) and forEachRemaining( ). Also
 * notice how these methods combine the actions of Iterator’s next( ) and
 * hasNext( ) methods into a single call.
 * 
 * @author Safdar.Khan
 *
 */
//A simple Spliterator demonstration.
public class P10_SpliteratorDemo {

	public static void main(String[] args) {
		// Create an array list for doubles.
		ArrayList<Double> al = new ArrayList<>();

		// Add values to the array list.
		al.add(1.0);
		al.add(2.0);
		al.add(3.0);
		al.add(4.0);
		al.add(5.0);

		// Use tryAdvance() to display contents of vals.
		System.out.print("Contents of vals:\n");
		Spliterator<Double> spl = al.spliterator();
		while (spl.tryAdvance(n -> System.out.print(n + " ")))
			;
		System.out.println();

		// Create new list that contains square roots.
		spl = al.spliterator();
		ArrayList<Double> sqrs = new ArrayList<>();
		while (spl.tryAdvance(n -> sqrs.add(Math.sqrt(n))))
			;

		// Use forEachRemaining() to display contents of sqrs.
		System.out.print("Contents of sqrs:\n");
		spl = sqrs.spliterator();
		spl.forEachRemaining(n -> System.out.print(n + " "));
		System.out.println();
	}

}
