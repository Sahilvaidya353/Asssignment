package Assignment;

import java.util.Scanner;

public class Assignement_5 {

	private String bachelorDegree;
	private String criminalCase;
	
	public void accpet()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("You Have Bachlore's Degree(Yes/No) : ");
		bachelorDegree=sc.next();
		
		System.out.print("Criminal Case on You : ");
		criminalCase=sc.next();
	}
	
	public void display()
	{
		System.out.println("Bachelor's Degree    : "+bachelorDegree);
		System.out.println("Criminal Case on You : "+criminalCase);
	}
	
	public void check()
	{
		if(bachelorDegree.equalsIgnoreCase("yes") && criminalCase.equalsIgnoreCase("no"))
		{
			System.out.println("You Are Eligible for Job");
		}
		else
		{
			System.out.println("You Are Not Eligible for Job");
		}
		
	}

}

