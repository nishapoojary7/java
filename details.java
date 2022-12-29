package program;

import java.util.Scanner;

class Staff
{
	String staffID;
	String name;
	double salary;
	long phoneNo;
	void readStaffDetails()
	{
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter the staff id:");
		staffID=userInput.next();
		System.out.println(" enter the staff name:");
		name=userInput.next();
		System.out.println(" enter the salary:");
		salary=userInput.nextDouble();
		System.out.println(" enter the phoneNo:");
		phoneNo=userInput.nextLong();
	}
	void displayStaffDetails()
	{
		System.out.println("staffID is:" +staffID);
		System.out.println(" staff name is:" +name);
		System.out.println("salary is:" +salary);
		System.out.println("phoneNo is:" +phoneNo);
	}
}
class Teaching extends Staff
{
	String domain;
	int noOfPublication;
	void readStaffdetails() {
		System.out.println("<----------the teacing staff details------->");
		super.readStaffDetails();
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter the domain:");
		domain = userInput.next();
		System.out.println("enter the no. of publication");
		noOfPublication = userInput.nextInt();
	}
	void displayStaffDetails() {
		System.out.println("<----------enter the teacing staff details------->");
		super.displayStaffDetails();
		System.out.println("domain is:" +domain);
		System.out.println("the no. of publication is:" +noOfPublication);
	}
}
class Technical extends Staff
{
	String[] skills= new String[5];
	int noOfskills;
	void readStaffDetails() {
		System.out.println("<----------the technical  staff details------->");
		super.readStaffDetails();
		Scanner userInput=new Scanner(System.in);
		System.out.println("the no. of skills:");
		noOfskills = userInput.nextInt();
		System.out.println("enter the skills");
		for(int i=0;i<noOfskills;i++) {
		skills[i]=userInput.next();
	}
	}
	void displayStffdetails() {
		System.out.println("<----------enter the technical staff details------->");
		super.displayStaffDetails();
		System.out.println("the skills  is:");
		for(int i=0;i<noOfskills;i++)
		{
			System.out.println(skills[i]);
		}
	}	
		}
	class Contract extends Staff
	{
        int period;
void readStaffdetails() {
	System.out.println("<----------enter the teacing staff details------->");
	super.readStaffDetails();
	Scanner userInput=new Scanner(System.in);
	System.out.println("enter the period");
	 period = userInput.nextInt();
}
void displayStaffdetails() {
	System.out.println("<-------enter the technical staff details------->");
	super.displayStaffDetails();
	System.out.println("the contract period is:" + period);
}
	}
public class details {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teaching t=new Teaching();
Technical te=new Technical();
Contract c=new Contract();
t.readStaffdetails();
te.readStaffDetails();
c.readStaffDetails();
t.displayStaffDetails();
te.displayStaffDetails();
c.displayStaffDetails();
	}
}
