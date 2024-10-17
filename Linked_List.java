package Assignment;

public class Linked_List {
	  Node head;

	    public void append(int data) {
	        Node n= new Node(data);
	        if (head == null) {
	            head = n;
	            return;
	        }
	        Node last = head;
	        while (last.next != null) {
	            last = last.next;
	        }
	        last.next = n;
	    }

	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    public static Linked_List createFromNumber(int number) {
	        Linked_List linkedList = new Linked_List();
	        String numStr = Integer.toString(number); 

	        for (char digit : numStr.toCharArray()) {
	            linkedList.append(Character.getNumericValue(digit)); 
	        }

	        return linkedList;
}
}
