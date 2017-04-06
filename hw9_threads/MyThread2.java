package hw9;

public class MyThread2  extends Thread{
	
	private Thread thread;
	private String message;
	private int numberOfMessage;

	public Thread getThread() {
		return thread;
	}

	public void setThread(Thread thread) {
		this.thread = thread;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getNumberOfMessage() {
		return numberOfMessage;
	}

	public void setNumberOfMessage(int numberOfMessage) {
		this.numberOfMessage = numberOfMessage;
	}

	public MyThread2(Thread thread) {
		this.thread = thread;
	}

	public MyThread2(Thread thread, String message, int numberOfMessage) {
		this.thread = thread;
		this.message = message;
		this.numberOfMessage = numberOfMessage;
	}

	public MyThread2(String message, int numberOfMessage) {
		this.message = message;
		this.numberOfMessage = numberOfMessage;
	}
	
	@Override
	public void run() {
		if ((message) != null) {
			for (int i = 0; i < numberOfMessage; i++) {
				System.out.println(message);
			}
		}
		if ((thread) != null) {
			thread.start();
		}
	}

}
