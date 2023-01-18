package abtractDemo;

public class Student implements Resume {
String name;
String usn;
double result;
String diciplain;
 long phoneNo;
 Student(String n,String u,long phNo,double r,String d)
{
this.name=n;
this.usn=u;
this.phoneNo=phNo;
this.result=r;
this.diciplain=d;
}
@Override
public void biodata() {
	// TODO Auto-generated method stubs
	System.out.println("the name"+this.name);
	System.out.println("the usn"+this.usn);
	System.out.println("the phoneNo"+this.phoneNo);
	System.out.println("the result"+this.result);
	System.out.println("the diciplain"+this.diciplain);	
}
}
