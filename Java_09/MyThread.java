package package9;

public class MyThread extends Thread {
	private int ammount;
	private String message;

	public MyThread(int ammount, String message) {

		this.ammount = ammount;
		this.message = message;
	}

	@Override
	public void run() {
		for (int i = 0; i < this.ammount; i++) {
			synchronized (this) {
				System.out.println(this.message);
			}
		}
	}
}
