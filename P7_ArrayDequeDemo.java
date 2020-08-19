package collection;

import java.util.ArrayDeque;

//demonstrate array dequeue
public class P7_ArrayDequeDemo {

	public static void main(String[] args) {
		// create an array dequeue
		ArrayDeque<String> adq = new ArrayDeque<>();

		// use an ArrayDequeue like a stack
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		System.out.println("poping the stack");
		while (adq.peek() != null) {
			System.out.println(adq.pop());
		}
	}

}
