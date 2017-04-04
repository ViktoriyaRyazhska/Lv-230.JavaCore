package hom9;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		// Thread t1 = new Thread(new MyThread("Hello"));
		// Thread t2 = new Thread(new MyThread("Peace"));
		// Thread t3 = new Thread(new MyThread("World"));
		//
		// t1.start();
		// t1.join();
		// t2.start();
		// t2.join();
		// t3.start();
		// Thread dl2 = new Thread(new Deadlock());
		// Thread dl1 = new Thread(new Deadlock());
		// dl1.start();
		// dl2.start();
		Thread thread = new Thread(new TaskThreeThread());
		thread.start();
	}

}
