package hom9;

public class Deadlock implements Runnable {

	private String dead;

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (dead) {
				System.out.println(dead + "lock");
			}

		}
	}
}
