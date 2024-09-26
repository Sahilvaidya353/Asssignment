package Assignment;

import java.util.Scanner;

public class Assignement_6 {
	
	private int num;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the Number : ");
		num = sc.nextInt();
	}
	
	public void display()
	{
		System.out.println("Number : "+num);
	}

	public void check()
	{
		if(!(num>=10 && num<=20))
		{
			System.out.println(num +" is Not Between 10 to 20");
		}
		else
		{
			System.out.println(num +" is Between 10 to 20");
		}
	}
}



