package hw9;


public class Work_threads {

	final static Object deadlock = new Object();

    public static void main(String[] args) throws InterruptedException  {
    	
    	//task1
    	
    	
    	Thread t1 = new MyThread("Thread1 message");
		Thread t2 = new MyThread("Thread2 message");
		Thread t3 = new MyThread("Thread3 message");
		
		try {
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			t3.start();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	 
		
		//task 3
        Thread thread3 = new MyThread2("Thread number three", 5);
		Thread thread2 = new MyThread2(thread3, "Thread number two", 3);
		Thread thread1 = new MyThread2(thread2);
		thread1.start();
    	
    	
    	//task2
		
		
		
        synchronized (deadlock) {
            Thread t = new Thread() {
            public void run() {
            synchronized (deadlock) {
            for (int i = 0; i < 5; i++) {
                System.out.println("deadlock");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                 e.printStackTrace();
            }
            }
            }
            }
            };
            t.start();
            t.join();
        }
        System.out.println("deadlock");
        
        
     
		
		
		
		
		//task4
		
		
		
    
    }
	
}
