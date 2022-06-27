package prasanth;

import java.util.Scanner;

public class increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=5,b=10;
//		System.out.println(a++);
//		System.out.println(a);
//		System.out.println(a--);//pre degrement
//		System.out.println(a);
//		System.out.println(a++ + ++a + a++ + ++a);
						//(5+7+7+9)
//		System.out.println(a+++ a);
						//11
		
//		System.out.println(a++ + b++ + (++a - ++b));
						//(5+10+(7-12))
						//(15+(-5))
		Scanner hi=new Scanner(System.in);
		System.out.println("enter the tamil value:");
		int tamil=hi.nextInt();
		System.out.println("enter the english value:");
		int english=hi.nextInt();
		System.out.println("enter the maths value:");
		int maths=hi.nextInt();
		System.out.println("enter the science value:");
		int science=hi.nextInt();
		System.out.println("enter the social value:");
		int social=hi.nextInt();
		if(tamil==english) {
			System.out.println("tamil and english mark is equal");
		}
		else if(english==maths) {
			System.out.println("english and maths mark is equal");
		}
		else if(maths==science) {
			System.out.println("maths and science mark is equal");
		}
		else if(science==social) {
			System.out.println("science and social mark is equal");
		}
		else if(tamil<english) {
			System.out.println("english mark is big");
		}
		else if(english<maths) {
			System.out.println("maths mark is big");
		}
		else if(maths<science) {
			System.out.println("science mark is big");
		}
		else if(science<social) {
			System.out.println("social mark is big");
		}
		else {
			System.out.println("none of these");
		}
		
		
		
		

	}

}
