package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The program begins by creating a hash map and then adds the mapping of names
 * to balances. Next, the contents of the map are displayed by using a set-view,
 * obtained by calling entrySet( ). The keys and values are displayed by calling
 * the getKey( ) and getValue( ) methods that are defined by Map.Entry. Pay
 * close attention to how the deposit is made into John Doe’s account. The put(
 * ) method automatically replaces any preexisting value that is associated with
 * the specified key with the new value. Thus, after John Doe’s account is
 * updated, the hash map will still contain just one "John Doe" account.
 * 
 * @author Safdar.Khan
 *
 */
public class P12_HashMapDemo {

	public static void main(String[] args) {
		// Create a hash map.
		HashMap<String, Double> hm = new HashMap<>();

		// Put elements to the map
		hm.put("John Doe", new Double(3434.34));
		hm.put("Tom Smith", new Double(123.22));
		hm.put("Jane Baker", new Double(1378.00));
		hm.put("Tod Hall", new Double(99.22));
		hm.put("Ralph Smith", new Double(-19.08));

		// Get a set of the entries.
		Set<Map.Entry<String, Double>> set = hm.entrySet();

		// Display the set.
		for (Map.Entry<String, Double> entry : set) {
			System.out.print(entry.getKey() + " ");
			System.out.println(entry.getValue());
		}

		// Deposit 1000 into John Doe's account.
		double balance = hm.get("John Doe");
		hm.put("John Doe", balance + 1000);

		System.out.println("john doe's new balance " + hm.get("John Doe"));
	}

}
