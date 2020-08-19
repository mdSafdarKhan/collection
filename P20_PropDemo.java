package collection;

import java.util.Properties;
import java.util.Set;

/**
 * One useful capability of the Properties class is that you can specify a
 * default property that will be returned if no value is associated with a
 * certain key. For example, a default value can be specified along with the key
 * in the getProperty( ) method—such as getProperty( "name" ,"default value").
 * If the "name" value is not found, then "default value" is returned. When you
 * construct a Properties object, you can pass another instance of Properties to
 * be used as the default properties for the new instance. In this case, if you
 * call getProperty("foo") on a given Properties object, and "foo" does not
 * exist, Java looks for "foo" in the default Properties object. This allows for
 * arbitrary nesting of levels of default properties.
 * 
 * @author Safdar.Khan
 *
 */
public class P20_PropDemo {

	public static void main(String[] args) {
		Properties capitals = new Properties();
		capitals.put("Illinois", "Springfield");
		capitals.put("Missouri", "Jefferson City");
		capitals.put("Washington", "Olympia");
		capitals.put("California", "Sacramento");
		capitals.put("Indiana", "Indianapolis");

		// Get a set-view of the keys.
		Set<?> states = capitals.keySet();
		// Show all of the states and capitals.
		for (Object name : states)
			System.out.println("The capital of " + name + " is " + capitals.getProperty((String) name) + ".");
		System.out.println();

		// Look for state not in list -- specify default.
		String str = capitals.getProperty("Florida", "Not Found");
		System.out.println("The capital of Florida is " + str + ".");
	}

}
