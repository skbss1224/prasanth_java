package prasanth;

import java.util.Scanner;

public class bitwise_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//bitwise operator
		//and,or,xor,leftswift,right swift
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the A value");
		int a=scan.nextInt();
		System.out.println("enter the B value");
		int b=scan.nextInt();
		int c=a&b;
		System.out.println("and operator:"+c);
		int d=a|b;
		System.out.println("or operator"+d);
		int e=a^b;
		System.out.println("xor operator"+e);
		
		
	}

}
