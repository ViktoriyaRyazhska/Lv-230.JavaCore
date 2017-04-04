package homework9MultithreadingIOStreamsTask1;

public class Task1Threads extends Thread {
	
	private String message;
	
	public Task1Threads(String message) {
		this.message = message;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(message);
		}
	}

}
