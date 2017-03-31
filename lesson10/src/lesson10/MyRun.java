package lesson10;

public class MyRun implements Runnable {
	String s;
	int time;

	public MyRun(String s, int time) {
		this.s = s;
		this.time = time;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(s);

			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
