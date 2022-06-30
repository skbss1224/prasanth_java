package prasanth;

import java.util.Scanner;

public class bus_ticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the place:");
		String place=scan.nextLine();
		if(place.equals("chennai")) {
			System.out.println("you are selected"+place);
		
			System.out.println("enter the bus type:");
			String type=scan.nextLine();
			if(type.equals("ordinary"))
			{
				System.out.println("you are selected"+type);
			
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=250)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				}
			else if(type.equals("delux")) {
				System.out.println("you are selected"+type);
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=350)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				
			}
			else if(type.equals("superdelux")) {
				System.out.println("you are selected"+type);
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=450)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				
			}
			else if(type.equals("sleeper")) {
				System.out.println("you are selected"+type);
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=550)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				
			}
			else {
				System.out.println("not available"+type);
			}
			}
		else if(place.equals("coimbatore")) {
			System.out.println("you are selected"+place);
		
			System.out.println("enter the bus type:");
			String type=scan.nextLine();
			if(type.equals("ordinary"))
			{
				System.out.println("you are selected"+type);
			
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=150)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				}
			else if(type.equals("delux")) {
				System.out.println("you are selected"+type);
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=250)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				
			}
			else if(type.equals("superdelux")) {
				System.out.println("you are selected"+type);
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=350)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				
			}
			else if(type.equals("sleeper")) {
				System.out.println("you are selected"+type);
				System.out.println("enter the amount:");
				int amount=scan.nextInt();
				if(amount>=450)	
				{
					System.out.println("you are selected"+type);
				}
				else
				{
					System.out.println("insuffiecient amount");
				}
				
			}
			else {
				System.out.println("not available"+type);
			}
			}
		else {
			System.out.println("only 2 places available chennai and coimbatore");
		}
		}
	

}
