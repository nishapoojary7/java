package practice;

import java.util.Scanner;

public class divisibleno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("the no which is divisible by 5");
		for(int i=1;i<=100;i++)
		{
			if(i%5==0)
			{
				System.out.println(i+"");
			}
		}
				

	}

}
