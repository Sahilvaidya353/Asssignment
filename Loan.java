package Assignment;
//Assignment 1: Validating Age and Income
//Write a program that checks if a person is eligible for a loan based on their age and income.
//Requirements:
//•    A person is eligible if their age is between 18 and 60 and their income is above $25,000.
//•    Use logical && to combine these conditions.
import java.util.Scanner;

public class Loan {
	private String name;
	private int age;
	private double income;
	
	
	Scanner sc=new Scanner(System.in);
	public void accept() 
	{
    System.out.print("Enter name :");
    name=sc.next();
    System.out.print("Enter age :");
    age=sc.nextInt();
    System.out.print("Enter income :");
    income=sc.nextInt();
	}
	public void eligibility()
	{
		if(age>18 && age<60 && income>25000)
		{
		System.out.println("Your are eligible for loan");
		System.out.println(age +" Age is Valid");
		System.out.println(income +" Valid Income");
		}
		else 
		{
		System.out.println("You are not eligible for loan");
		}
	}
	public void display()
	{
		System.out.println(" Name :"+name);
		System.out.println(" Age :"+age);
		System.out.println(" Income :"+income);
	}
	

}
