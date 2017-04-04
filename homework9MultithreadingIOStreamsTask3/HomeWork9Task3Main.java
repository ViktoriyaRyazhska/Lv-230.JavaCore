package homework9MultithreadingIOStreamsTask3;

public class HomeWork9Task3Main {

	public static void main(String[] args) {
		
// 3) Create a thread «one», which would start the thread «two», which has to output its number («Thread number two») 3 times
// and create thread «three», which would to output message «Thread number three» 5 times.

//		
//		Thread two = new Thread() {
//			public void run() {
//				for (int i = 0; i < 3; i++) {
//					System.out.println("Thread number two");
//				}
//				Thread three = new Thread() {
//					public void run() {
//						for (int i = 0; i < 5; i++) {
//							System.out.println("Thread number three");
//						}
//					}
//				};
//				three.start();
//			}
//		};
//		Thread one = new Thread() {
//			public void run(){
//				two.start();
//			}
//		};
//		one.start();
		
		Thread threadThree = new Task3Threads("Thread 3", 5);
		Thread threadTwo = new Task3Threads(threadThree, "Thread 2", 3);
		Thread threadOne = new Task3Threads(threadTwo);
		threadOne.start();
	}
}