package lesson10;

public class Main {
	
// Task 1	
	public static void main(String[] args) {
//		for (int i = 0; i < 10; i++) {
//			System.out.println("I study Java");
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		}
// Task 2
		
		Thread t1 = new Thread(new MyRun("Hello world", 1000));
		Thread t2 = new Thread(new MyRun("Peace", 2000));
		t1.start();
		t2.start();
	}

}
