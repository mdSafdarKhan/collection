package collection;

import java.util.Stack;

/**
 * To put an object on the top of the stack, call push( ). To remove and return
 * the top element, call pop( ). You can use peek( ) to return, but not remove,
 * the top object. An EmptyStackException is thrown if you call pop( ) or peek(
 * ) when the invoking stack is empty. The empty( ) method returns true if
 * nothing is on the stack. The search( ) method determines whether an object
 * exists on the stack and returns the number of pops that are required to bring
 * it to the top of the stack. Here is an example that creates a stack, pushes
 * several Integer objects onto it, and then pops them off again:
 * 
 * @author Safdar.Khan
 *
 */
public class P18_Stack {

	static void showPush(Stack<Integer> stack, int item) {
		stack.push(item);
		System.out.println("push(" + item + ")");
		System.out.println("stack " + stack);
	}
	
	static void showPop(Stack<Integer> stack) {
		System.out.print("pop -> ");
		int a = stack.pop();
		System.out.println(a);
		System.out.println("stack " + stack);
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		showPush(stack, 200);
		showPush(stack, 250);
		showPush(stack, 350);
		showPop(stack);
		showPop(stack);
		showPop(stack);
	}

}
