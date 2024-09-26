package Assignment;
import java.util.Scanner;
public class Assignement_7 {
	private int temp;
	private String rain;
	
	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter The Temprature : ");
		temp = sc.nextInt();
		
		System.out.print("There is Raining Outside(yes/no) : ");
		rain=sc.next();
	}
	
	public void display()
	{
		System.out.println("Temperature     : "+temp);
		System.out.println("Raining Outside : "+rain);
	}
	
	public void check()
	{
		if(rain.equalsIgnoreCase("no")&& temp >=20 && temp<=30)
		{
			System.out.println("It's Safe to go Outside");
		}
		else
		{
			System.out.println("It's Not Safe to go Outside");
		}
			
	}
}


