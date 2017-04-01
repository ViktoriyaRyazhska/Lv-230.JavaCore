package package9;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {

		// 1. Run three threads and output there different messages for 5 times.
		// The third thread supposed to start after finishing working of the two
		// previous threads.
		Thread t1 = new MyThread(5, "Message from first stream");
		Thread t2 = new MyThread(5, "Message from second stream");
		Thread t3 = new MyThread(5, "Message from third stream");
		t1.start();

		// 2.Cause a deadlock. Organize the expectations of ending a thread in
		// main(), and make the end of the method main() in this thread.
		synchronized (t1) {
			if (t1.isAlive() == false) {
				t1.join();
			}
			Thread.yield();
		}

		t2.start();
		synchronized (t2) {
			if (!t2.isAlive()) {
				t2.join();
			}
		}

		t3.start();

		synchronized (t3) {
			if (t3.isAlive() == false) {
				t3.join();
			}
		}

		// 3.Create a thread «one», which would start the thread «two», which
		// has
		// to output its number («Thread number two») 3 times and create thread
		// «three», which would to output message «Thread number three» 5 times.
		Thread threadOne = new ThreadOne(3);
		threadOne.start();
		synchronized (threadOne) {
			if (!threadOne.isAlive()) {
				threadOne.join();
			}

			// 4.Create file1.txt file with a text about your career.
			// Read context from file into array of strings. Each array item
			// contains one line from file.
			// Write in to the file2.txt
			// 1) number of lines in file1.txt.
			// 2) the longest line in file1.txt.
			// 3) your name and birthday date.

			String textFile = "career.txt";

			FileReader fr = null;
			BufferedReader br = null;
			String aboutCareer = "I originally became interested in programming during my 11th  form when  informatica have been introduced at school program.\n";
			aboutCareer = aboutCareer.concat("In those times I am interested in mathematics, physics and english either.\n");
			aboutCareer = aboutCareer.concat("For those reasons I have been chosen programming for my future profession inspite of the most difficult direction.\n");
			aboutCareer = aboutCareer.concat("Learning was really challenging and exciting at the same time\n");
			aboutCareer = aboutCareer.concat("I have combined study with work.\n");
			aboutCareer = aboutCareer.concat("First, I worked operator in account department.\n");
			aboutCareer = aboutCareer.concat("As a future programmer I have made a program in VisualBasic for Excel application to make my routine accounting work more easily.\n");
			aboutCareer = aboutCareer.concat("Using this program I inputted datas once recieved all needed reports.\n");
			aboutCareer = aboutCareer.concat("On protecting diploma I have been recieved the highest level with opinion of  my work could be divided on several diplomas.\n");
			aboutCareer = aboutCareer.concat("After graduating university at was a time when I work as economist and financial worker but every time it have been made AWP for my working place by myself.\n");
			aboutCareer = aboutCareer.concat("Nowadays I working as programmer and, as one employee have said:'work is my hobby', I can confirm that it my working hobby too.\n");
			aboutCareer = aboutCareer.concat("Java language is my old dream which I would like become true.");
			FileWriter fw = new FileWriter(textFile);
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Write data to file: " + textFile);
			bw.write(aboutCareer);
			bw.close();

			fr = new FileReader(textFile);
			br = new BufferedReader(fr);
			String txtLineFromFile = null;
			List<String> ArrayOfLines = new ArrayList<String>();

			while ((txtLineFromFile = br.readLine()) != null) {
				ArrayOfLines.add(txtLineFromFile);
			}
			System.out.println(ArrayOfLines.toString());

			String txtFile2 = "career2.txt";
			String LongestLine = "";

			FileWriter fw1 = new FileWriter(txtFile2);

			for (int i = 0; i < ArrayOfLines.size(); i++) {
				if (ArrayOfLines.get(i).length() > LongestLine.length()) {
					LongestLine = ArrayOfLines.get(i);
				}
			}

			BufferedWriter bw1 = new BufferedWriter(fw1);

			bw1.write("number of lines in career.txt:" + ArrayOfLines.size() + "\n");
			bw1.write("the longest line in career.txt:" + LongestLine + "\n");
			bw1.write("My name is Nataliia. My date of birth on 16.02.1980.\n");
			bw1.close();

		}
	}
}
