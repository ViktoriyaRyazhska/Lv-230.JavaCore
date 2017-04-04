package hom9;

public class MyThread implements Runnable {
	private String mess;

	public MyThread(String mess) {
		super();
		this.mess = mess;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 3; i++) {
			System.out.println(mess);
		}
	}

}
