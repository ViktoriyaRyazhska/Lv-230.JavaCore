package less10;

public class Hello implements Runnable {
	private String s;
	private int sleap;

	public Hello(String s, int sleap) {
		super();
		this.s = s;
		this.sleap = sleap;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(s);
			try {
				Thread.sleep(sleap);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}
