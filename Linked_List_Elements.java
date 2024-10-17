package Assignment;

import java.util.HashSet;
import java.util.Scanner;

class Node1 {
    int data;
    Node next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Linked_List_Elements {
    Node root;

    public void append(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = n;
            return;
        }
        Node last = root;
        while (last.next != null) {
            last = last.next;
        }
        last.next = n;
    }

    public void display() {
        Node current = root;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Linked_List_Elements findUnion(Linked_List_Elements other) {
        Linked_List_Elements unionList = new Linked_List_Elements();
        HashSet<Integer> seen = new HashSet<>();

        Node current1 = this.root;
        while (current1 != null) {
            if (seen.add(current1.data)) {
                unionList.append(current1.data);
            }
            current1 = current1.next;
        }

        Node current2 = other.root;
        while (current2 != null) {
            if (seen.add(current2.data)) {
                unionList.append(current2.data);
            }
            current2 = current2.next;
        }

        return unionList;
    }

    public static Linked_List_Elements createLinkedList(Scanner scanner) {
        Linked_List_Elements linkedList = new Linked_List_Elements();
        System.out.println("Enter elements for the linked list (type 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            try {
                int num = Integer.parseInt(input);
                linkedList.append(num);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid integer.");
            }
        }
        return linkedList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Creating first linked list:");
        Linked_List_Elements list1 = createLinkedList(scanner);

        System.out.println("Creating second linked list:");
        Linked_List_Elements list2 = createLinkedList(scanner);

        System.out.println("First linked list:");
        list1.display();

        System.out.println("Second linked list:");
        list2.display();

        // Find and display union
        Linked_List_Elements unionList = list1.findUnion(list2);
        System.out.println("Union of the two linked lists:");
        unionList.display();

        scanner.close();
    }
}
