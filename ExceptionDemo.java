package program;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=0;
		Scanner sc=new Scanner(System.in);
				try {
					System.out.println("enter the values of a and b");
					a=sc.nextInt();
					b=sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("invalid input");
				}
				try {
					float result=a/b;
					System.out.println("result is:"+result);
				}catch(ArithmeticException e) {
					System.out.println("exception occured"+e);
				}
				System.out.println("thank you");
	}
}
					
					
		
		