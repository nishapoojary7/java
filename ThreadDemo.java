package program;

import java.util.Random;

class SquareThread implements Runnable {
int x;
SquareThread(int x)
{
	this.x=x;
}
@Override
public void run() {
	// TODO Auto-generated method stub
	System.out.println("thread name=SquareThread and Squareis"+x+"is:"+x*x);
	}	
}

class CubeThread implements Runnable {
	int x;
	CubeThread(int x) {
		this.x=x;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("thread name:cube thread and cube of"+x+"is"+x*x*x);	
	}
	}
class RandomThread  implements Runnable {
	Random r;
	Thread t2,t3;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int num;
		r=new Random();
		try {
			while(true)
			{
				num=r.nextInt(100);
				System.out.println("main thread generated no, is"+num);
				t2=new Thread(new SquareThread(num));
				t2.start();
				t3=new Thread(new SquareThread(num));
				t3.start();
				Thread.sleep(1000);
				System.out.println("-----------");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
				
public class ThreadDemo {

	public static void main(String[] args) {
		RandomThread thread_obj = new RandomThread();
		Thread t1 = new Thread(thread_obj);
		t1.start();
	}
}

	
		
	
