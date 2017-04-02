package hw10;

public class MyThread extends Thread{

	private String message;
	private Thread thread;
	private int count;

	public MyThread(String message, Thread thread) {
		this.message = message;
		this.thread = thread;
		thread.start();
		
	}
	
	public MyThread(String message) {
		this.message = message;
	}

	public MyThread(String message, int count) {
		this.message = message;
		this.count = count;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}

	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
