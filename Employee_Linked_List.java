package Assignment;

public class Employee_Linked_List {
	private EmployeeNode root;
	
	 public Employee_Linked_List() {
	        root = null;
	    }

	    public void addEmployee(int empId, String name, double salary, String email) {
	        if (findEmployee(empId) != null) {
	            System.out.println("Employee ID must be unique");
	            return;
	        }

	        EmployeeNode n = new EmployeeNode(empId, name, salary, email);
	        n.next = root; 
	        root = n;
	        System.out.println("Employee registered successfully");
	    }


	    public EmployeeNode findEmployee(int empId) {
	        EmployeeNode current = root;
	        while (current != null) {
	            if (current.empId == empId) {
	                return current;
	            }
	            current = current.next;
	        }
	        return null; 
	    }

	    public void displayAllEmployees() {
	        EmployeeNode e = root;
	        if (e == null) {
	            System.out.println("No employees found");
	            return;
	        }

	        System.out.println("Employee List:");
	        while (e != null) {
	            System.out.printf("ID: , Name: , Salary: , Email: ",
	                    e.empId, e.name, e.salary, e.email);
	                    e = e.next;
	        }
	    }
}
