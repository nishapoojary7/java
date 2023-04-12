package practice;

import java.util.Scanner;

public class Area {
	double length;
	double breadth;
	Area(double l,double b)
	{
		length=l;
		breadth=b;
	}
	double returnaArea(double length,double breadth) {
		return(length*breadth);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter the length");
		double length=userInput.nextDouble();
		System.out.println("enter the breadth");
		double breadth=userInput.nextDouble();
		Area a=new Area(length,breadth);
		double Area=a.returnaArea(length, breadth);
		System.out.println("area of the rectangle="+Area);
	}

}
