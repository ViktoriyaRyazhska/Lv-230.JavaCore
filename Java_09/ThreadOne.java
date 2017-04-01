package package9;

public class ThreadOne extends Thread {
	private int number;

	public ThreadOne(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.number; i++) {
			synchronized (this) {
				System.out.println("Thread number two");
			}
		}
		Thread ThreadTwo = new MyThread(5, "Thread number three");
		ThreadTwo.start();
		synchronized (ThreadTwo) {
			if (!ThreadTwo.isAlive()) {
				try {
					ThreadTwo.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}