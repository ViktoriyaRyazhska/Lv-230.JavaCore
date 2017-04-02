package hw10;

public class MyThread extends Thread{

	private String message;
	private Thread thread;
	
	
	
	public MyThread(String message, Thread thread) {
		super();
		this.message = message;
		this.thread = thread;
		
	}

	
	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(message);
		}
	}

	public MyThread(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public void myRun(Thread th) throws InterruptedException {
		thread.join();
	}
	
	
	
}
