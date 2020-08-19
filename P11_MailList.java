package collection;

import java.util.ArrayList;

//a simple mailing list example
class Address {
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;

	public Address(String n, String s, String c, String st, String co) {
		name = n;
		street = s;
		city = c;
		state = st;
		code = co;
	}

	public String toString() {
		return name + "\n" + street + "\n" + city + " " + state + " " + code;
	}

}

public class P11_MailList {

	public static void main(String[] args) {
		ArrayList<Address> ml = new ArrayList<>();

		// add elements to the linked list
		ml.add(new Address("Farhan", "Barhampur", "Chapra", "Bihar", "841301"));
		ml.add(new Address("Irfan", "Ambur", "Vaniyambadi", "Tamil Nadu", "11111"));
		ml.add(new Address("Wasim", "Ashram", "South Delhi", "Delhi", "110025"));

		// display the mailing list
		for (Address add : ml) {
			System.out.println(add + "\n");
		}
		System.out.println();
	}

}
