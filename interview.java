package paul;

import java.util.Scanner;

public class interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String tech="";
		System.out.println("---------------congnizant-------------------");
		int expected=10;
		while(expected>0)
		{
			System.out.println("tell us what technologu you knew:");
			tech=scan.next();
			switch(tech)
			{
			case "java":case"spring":case"hibernate":case"jpa":System.out.println(tech+"web developer available so we recruite you");
			expected--;
			break;
			case"python":System.out.println("python testing role available, we recruite you");
			expected--;
			break;
			default:System.out.println("we don't have any roles for"+tech);
			}
		}
		scan.close();
	}

}
