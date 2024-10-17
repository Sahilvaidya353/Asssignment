package Assignment;

public class Employee_Linked_List_Main {

	public static void main(String[] args) {
		Employee_Linked_List obj = new Employee_Linked_List();
		
		obj.addEmployee(012, "Sahil", 80000, "sahilvaidya@gmail.com");
        obj.addEmployee(109, "yash ", 65000.0, "yash@example.com");
        obj.addEmployee(234, "Siddhant", 60000, "Siddhant@gmail.com");
     
        obj.displayAllEmployees();

  
        EmployeeNode emp = obj.findEmployee(109);
        if (emp != null) {
            System.out.printf("Found Employee - ID: , Name: , Salary: , Email: ",
                    emp.empId, emp.name, emp.salary, emp.email);
        } else {
            System.out.println("Employee not found.");
        }
	}

}
