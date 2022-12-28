package program;

import java.util.Scanner;

class Userinfo {
	String userName;
	String password;
	String emailID;
	long phoneNo;
	Userinfo(String uName,String pWord ) {
		userName=uName;
		password=pWord;
		System.out.println("userinfo created with username=" +userName+ "and password=" +password);
	}
Userinfo(String uName, String eID,String pWord ) {
	userName=uName;
	emailID=eID;
	password=pWord;
	System.out.println("userinfo created with username=" +userName+  "password="+ pWord+ "emaiID=" +eID );
}
Userinfo(String uName, String eID,String pWord,long pNo ) {
	userName=uName;
	emailID=eID;
	password=pWord;
	phoneNo=pNo;
	System.out.println("userinfo created with username=" +userName+"password="+ pWord+ "emaiID=" +eID+ "phoneNO="+pNo);
}

void login(String uName,String pWord)
{
	System.out.println("login with name="+uName+"and password="+pWord);
}
void login(String uName,String eID,String pWord)
{
	System.out.println("login with email="+eID+"and password="+pWord);
}

void login(long pNo,String pWord)
{
	System.out.println("login with phoneNo="+pNo+"and password="+pWord);
}
}
public class login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter name");
		String name=userInput.next();
		System.out.println("enter email");
		String emailID=userInput.next();
		System.out.println("enter phoneNo");
		long phNo=userInput.nextLong();
		System.out.println("enter password");
		String passWord=userInput.next();
		System.out.println("<------------------->");
		System.out.println("demostrating constructor overloading");
		Userinfo u1=new Userinfo(name,passWord);
		Userinfo u2=new Userinfo(name,emailID,passWord);
		Userinfo u3=new Userinfo(name,emailID,passWord,phNo);
		System.out.println("-------------------");
		System.out.println("demostrating method overloading");
		u1.login(name, passWord);
		u1.login(phNo, passWord);
		u1.login(name,emailID, passWord);
	}
}


