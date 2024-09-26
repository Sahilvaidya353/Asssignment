package Assignment;
import java.util.Scanner;
public class Voting {

private int age;
private String name;
private String gender;

Scanner sc=new Scanner(System.in); 

public void accept() {
	System.out.print("Enter name: ");
    name = sc.next();
    System.out.print("Enter gender");
    gender = sc.next();
    System.out.print("Enter the age: ");
    age = sc.nextInt();
}
public void eligibile() {
	if(age>18 && age<100) {
		System.out.println("Person is eligible to vote age is"+age);
	}
	else if(age!=18){
		System.out.println("person is not eligible to vote");
	}
	else {
		System.out.println("Person is not eligible to vote");
	}
}
public void display() {
	System.out.println("Name of the person "+name);
	System.out.println("Gender of person "+gender);
	System.out.println("Enter the age of "+age);
	
}
}


