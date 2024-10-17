package Assignment;

import java.util.Scanner;

public class Linked_List_Main {

	public static void main(String[] args) {
	     Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        Linked_List linkedList = Linked_List.createFromNumber(number);

	        System.out.println("Linked list created from the digits of the number:");
	        linkedList.display();

	}

}
