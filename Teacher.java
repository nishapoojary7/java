package abtractDemo;

public class Teacher implements Resume {
		String name;
		String staffID;
		double experience;
		String qualification;
		 long phoneNo;
		 String designation;
		 Teacher(String n,String sID,long phNo,double e,String d,String q)
		{
		this.name=n;
		this.staffID=sID;
		this.phoneNo=phNo;
		this.experience=e;
		this.designation=d;
		this.qualification=q;
		}
		@Override
		public void biodata() {
			// TODO Auto-generated method stub
			System.out.println("the name"+this.name);
			System.out.println("the staffID"+this.staffID);
			System.out.println("the phoneNo"+this.phoneNo);
			System.out.println("the experience"+this.experience);
			System.out.println("the designation"+this.designation);
			System.out.println("the qualification"+this.qualification);
		}

}
