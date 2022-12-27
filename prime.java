package program;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean isprime=true;
System.out.println("enter a number");
Scanner userInput=new Scanner(System.in);
int num=userInput.nextInt();
for(int i=2;i<=num/2;i++)
{
	if(num%i==0)
	{
		isprime=false;
		break;
	
	
	}
}

	if(isprime)
	{
		System.out.println("prime number");
	}
	else
	{
		System.out.println("not a prime number");
	}
	}
}

	


