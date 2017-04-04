package homework9MultithreadingIOStreamsTask1;

public class HomeWork9Task1Main {

	public static void main(String[] args) {
		
// 1) Run three threads and output there different messages for 5 times.
// The third thread supposed to start after finishing working of the two previous threads.

		Thread message1Output = new Task1Threads("Thread N1 message!");
		Thread message2Output = new Task1Threads("Thread N2 message!");
		Thread message3Output = new Task1Threads("Thread N3 message!");
		
		try {
			message1Output.start();
			message2Output.start();
			message1Output.join();
			message2Output.join();
			message3Output.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}