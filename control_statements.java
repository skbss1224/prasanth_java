package prasanth;

import java.util.Scanner;

public class control_statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
//		System.out.println("enter the age:");
//		int age=scan.nextInt();
//		if(age>=18)
//		{
//			System.out.println("you ellible for blood doante");
//		}
//		else
//		{
//			System.out.println("you are not elligible");
//		}
		System.out.println("enter the nationality:");
		String nationality=scan.nextLine();
		if(nationality.equals("indian"))
		{
			System.out.println("enter your age:");
			int age=scan.nextInt();
			if(age>=18)
			{
				System.out.println("you are elligible for voter id");
			}
			else
			{
				System.out.println("you are not ellible");
			}
		}
		else 
		{
			System.out.println("you are not a indian");
		}
		
	}

}
