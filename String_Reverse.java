package Assignment;

import java.util.Scanner;

public class String_Reverse {

	static class Stack {
		private char[] stack;
		private int top;

		public Stack(int size) {
			stack = new char[size];
			top = -1;
		}

		public boolean isEmpty() {
			return top == -1;
		}

		public boolean isFull() {
			return top == stack.length - 1;
		}

		public void push(char element) {
			if (isFull()) {
				System.out.println("Stack overflow!");
				return;
			}
			stack[++top] = element;
		}

		public char pop() {
			if (isEmpty()) {
				System.out.println("Stack underflow!");
				return '\0';
			}
			return stack[top--];
		}
	}

	public static String reverseString(String input) {
		Stack stack = new Stack(input.length());

		for (char c : input.toCharArray()) {
			stack.push(c);
		}

		StringBuilder reversed = new StringBuilder();
		while (!stack.isEmpty()) {
			reversed.append(stack.pop());
		}

		return reversed.toString();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		String reversed = reverseString(input);

		System.out.println("Reversed string: " + reversed);
	}
}
