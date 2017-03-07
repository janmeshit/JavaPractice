package edu.umb.cs.cs680;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i= 0;i<10;i++){
			System.out.println("Child Thread");
		}
		
	}
	
}
public class ThreadDemo1 {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		
		//there is no strat method in runnable
		//there is no run method defined in thread
		//so we have to connect this two thing
		Thread t1 = new Thread(r1);
		t1.start();
		for(int i= 0;i<10;i++){
			System.out.println("Parent Thread");
		}
		
	}
	
	
	
	

}
