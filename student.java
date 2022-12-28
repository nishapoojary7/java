package program;

import java.util.Scanner;

public class student {
	String usn;
	String name;
	String branch;
	long phoneNo;
	student(String u,String n,String b,long ph)
	{
		usn=u;
		name=n;
		branch=b;
		phoneNo=ph;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String u;
String n;
String b;
long ph;
System.out.println("enter the number of students");
Scanner userInput=new Scanner(System.in);
int studentNo=userInput.nextInt();
student s[]= new student[studentNo];
for(int i=0;i<studentNo;i++) {
	System.out.println("enter USN" +(i+1));
u=userInput.next();
System.out.println("enter name" +(i+1));
n=userInput.next();
System.out.println("enter branch" +(i+1));
b=userInput.next();
System.out.println("enter phoneNo" +(i+1));
ph=userInput.nextLong();
s[i]= new student(u,n,b,ph);
	}
System.out.println("---------STUDENT DETAILS------------");
System.out.println("usn" + "\t\t" + "name" + "\t\t" + "branch" + "\t\t" + "phoneNo" + "\t\t");
for(int i=0;i<studentNo;i++)
{
	System.out.println(s[i].usn + "\t\t" + s[i].name + "\t\t" + s[i].branch + "\t\t" + s[i].phoneNo + "\t\t");

}

	}
}
	


	


		

	


