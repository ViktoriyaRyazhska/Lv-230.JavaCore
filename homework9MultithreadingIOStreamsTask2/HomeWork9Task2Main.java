package homework9MultithreadingIOStreamsTask2;

public class HomeWork9Task2Main {

	public static void main(String[] args) {
		
// 2)Cause a deadlock. Organize the expectations of ending a thread in main(),
// and make the end of the method main() in this thread.
		
		final Object firstResourse = new Object();
		final Object secondResourse = new Object();

		Thread deadlockThread = new Thread() {
			public void run() {
				synchronized (secondResourse) {
					System.out.println("deadlockThread locked secondResourse");
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
					synchronized (firstResourse) {
						System.out.println("deadlockThread locked firstResourse");
					}
				}
			}
		};
		deadlockThread.start();

		synchronized (firstResourse) {
			System.out.println("Thread main locked firstResourse");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
			synchronized (secondResourse) {
				System.out.println("Thread main locked secondResourse");
			}
		}
		
	System.out.println("End");	
	}
}