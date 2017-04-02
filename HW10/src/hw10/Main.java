package hw10;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
// Task 1
//		MyThread thread1 = new MyThread("I`m first thread");
//		MyThread thread2 = new MyThread("I`m second thread");
//		MyThread thread3 = new MyThread("3", thread1);
//		
//		try {
//			thread3.myRun(thread1);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		try {
//			thread3.myRun(thread2);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		thread1.start();
//		thread2.start();
//		thread3.start();
	
//Task 4
		String fileName = "file1.txt";

		Text text = new Text();
		String[] array = new String[3];
		try {
			array = text.readFile(fileName);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		try {
			text.writeFile(fileName, array);
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
		
	}

}
