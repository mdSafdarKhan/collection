package collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * One important point: Like the map classes, Hashtable does not directly
 * support iterators. Thus, the preceding program uses an enumeration to display
 * the contents of balance. However, you can obtain set-views of the hash table,
 * which permits the use of iterators. To do so, you simply use one of the
 * collection-view methods defined by Map, suchas entrySet( ) or keySet( ).
 * 
 * @author Safdar.Khan
 *
 */
public class P19_HTDemo {

	public static void main(String[] args) {
		Hashtable<String, Double> balance = new Hashtable<>();
		balance.put("John Doe", 3434.34);
		balance.put("Tom Smith", 123.22);
		balance.put("Jane Baker", 1378.00);
		balance.put("Tod Hall", 99.22);
		balance.put("Ralph Smith", -19.08);

		Double bal;
		Enumeration<String> names = balance.keys();

		while (names.hasMoreElements()) {
			String name = names.nextElement();
			bal = balance.get(name);
			System.out.println(name + " : " + bal);
		}

		bal = balance.get("John Doe");
		balance.put("John Doe", bal + 1000);
		System.out.println("john doe's new balance " + balance.get("John Doe"));
	}

}
