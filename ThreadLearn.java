import java.util.*;

class ChildThread extends Thread{
	/*	public void start() {
		run();
	}*/
	public void run() {
		System.out.println("Hi");
		for(int i=0;i<5;i++) {
			System.out.println("Child Thread "+i);
		}
		//super.run();
	}
}

public class ThreadLearn {//extends ChildThread{
	
	public static void main(String[] args) {
		ChildThread ct = new ChildThread();
		ct.start();
		/*ThreadLearn tl = new ThreadLearn ();
		tl.start();*/
	}
	/*public void run() {
		System.out.println("Hello");
	}*/
}




/*
class ChildThread extends Thread{
	//ChildThread ct = new ChildThread();
	public void start() {
		run();
	}
	
	public void run() {
		System.out.println("Hi");
		//for(int i=0;i<5;i++) {
		//	System.out.println("Child Thread "+i);
		//}
		//super.run();
	}
}

public class ThreadLearn extends ChildThread {
	
	public static void main(String[] args) {// throws ArithmeticException {
	//	ChildThread ct = new ChildThread();
		ThreadLearn tl = new ThreadLearn ();
		tl.start();
		//ct.run();
		//ct.start();
	
	/*	
		//Stack print stack trace to trace the stack
		//Single Stack
		try {
			System.out.println(5/0);
		}
		catch (Exception e) {
			e.printStackTrace();		}
	
	}

	public void run() {
		//super.run();
		System.out.println("Hello");
	}
}
*/