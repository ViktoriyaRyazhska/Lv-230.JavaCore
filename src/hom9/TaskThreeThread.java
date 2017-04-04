package hom9;

public class TaskThreeThread implements Runnable {

	@Override
	public void run() {
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread number two");
				}
				Thread thread3 = new Thread(new Runnable() {

					@Override
					public void run() {
						for (int i = 0; i < 5; i++) {
							System.out.println("Thread number three");
						}
					}
				});
				thread3.start();
			}
		});
		thread2.start();

	}

}
