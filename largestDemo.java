package program;

import java.util.Scanner;

public class largestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,large;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		n1=sc.nextInt();
		System.out.println("enter the second number");
		n2=sc.nextInt();
		if(n1>n2 ) {
			large=n1;
		}
		else {
			large=n2;
		}
		System.out.println("Largest of two numbers:"+large);
	}
}
