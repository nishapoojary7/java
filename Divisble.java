package program;

public class Divisble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The number which is divisible by 3 and 5");
		for( int i=1;i<100;i++)
		{
			if( i%3==0 && i%5==0)
				System.out.println(i+ ",");
		}
		

	}

}
