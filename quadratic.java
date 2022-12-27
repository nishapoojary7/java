package program;

import java.util.Scanner;

public class quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner userInput=new Scanner(System.in);
System.out.println("enter the value of a");
double a=userInput.nextDouble();
System.out.println("enter the value of b");
double b=userInput.nextDouble();
System.out.println("enter the value of c");
double c=userInput.nextDouble();
if(a==0)
{
	System.out.println(" the roots cannot be calculated");
}
else
{
	double d=Math.sqrt((b*b)-(4*a*c));

if(d>0) {
System.out.println("the roots are real and different");
double r1=(-b+d)/(2*a);
double r2=(-b-d)/(2*a);
System.out.println("the roots are r1:"+r1 +"and root r2:" +r2);
}
else if(d==0) {
	System.out.println("the roots are same");
	double r1=(-b+d)/(2*a);
	double r2=(-b-d)/(2*a);
	System.out.println("the roots r1:"+r1 +"and root r2:" +r2);
	}
else
{
	System.out.println("the roots are not real");
}
}
	}
}	






