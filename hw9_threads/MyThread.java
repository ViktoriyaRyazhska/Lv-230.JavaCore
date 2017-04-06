package hw9;

public class MyThread  extends Thread {
		
		private String message;
		
		public MyThread(String message) {
			this.message = message;
		}

		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println(message);
			}
		}

	}

