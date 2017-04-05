package softserve.javacore.project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThredLoading extends Thread {

	public ThredLoading() {

	}

	@Override
	public void run() {
		try {
			String txtFile = "Manager1.txt";
			String Work1 = "Manager1 Dnipropetrovsk Partner1 Start 2\n";
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner2 New 1\n");
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner3 Start 1\n");
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner4 Start 3\n");
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner5 New 4\n");
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner6 Start 5\n");
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner7 Start 5\n");
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner7  End 1\n");
			Work1 = Work1.concat("Manager1 Dnipropetrovsk Partner8 End 4\n");
			LoadingData(txtFile, Work1);
			System.out.println("-------------------------");
			System.out.println("work of Manager1 is loaded");
			System.out.println("-------------------------");
			sleep(10000);
			txtFile = "Manager2.txt";
			String Work2 = "Manager2 Lviv Partner1 Start 4.2\n";
			Work2 = Work2.concat("Manager2 Lviv Partner2 End 4.5\n");
			Work2 = Work2.concat("Manager2 Lviv Partner3 End 3\n");
			Work2 = Work2.concat("Manager2 Lviv Partner4 Start 4\n");
			Work2 = Work2.concat("Manager2 Lviv Partner5 New 3\n");
			Work2 = Work2.concat("Manager2 Lviv Partner6 End 2\n");
			Work2 = Work2.concat("Manager2 Lviv Partner7 Start 1\n");
			Work2 = Work2.concat("Manager2 Lviv Partner7 End 3\n");
			Work2 = Work2.concat("Manager2 Lviv Partner8 End 4\n");
			LoadingData(txtFile, Work2);
			System.out.println("-------------------------");
			System.out.println("work of Manager2 is loaded");
			System.out.println("-------------------------");
			sleep(10000);
			txtFile = "Manager3.txt";
			String Work3 = "Manager3 Kharkiv Partner1 Start 4\n";
			Work3 = Work3.concat("Manager3 Kharkiv Partner2 End 2\n");
			Work3 = Work3.concat("Manager3 Kharkiv Partner3 Start 1\n");
			Work3 = Work3.concat("Manager3 Kharkiv Partner4 Start 2\n");
			Work3 = Work3.concat("Manager3 Kharkiv Partner5 New 3\n");
			Work3 = Work3.concat("Manager3 Kharkiv Partner6 End 4\n");
			Work3 = Work3.concat("Manager3 Kharkiv Partner7 Start 2\n");
			Work3 = Work3.concat("Manager3 Kharkivk Partner7 Start 3\n");
			Work3 = Work3.concat("Manager3 Kharkiv Partner8 Start 4\n");
			LoadingData(txtFile, Work3);
			System.out.println("-------------------------");
			System.out.println("work of Manager3 is loaded");
			System.out.println("-------------------------");
			sleep(10000);
			txtFile = "Manager4.txt";
			String Work4 = "Manager4 Odesa Partner1 Start 1\n";
			Work4 = Work4.concat("Manager4 Odesa Partner2 New 2\n");
			Work4 = Work4.concat("Manager4 Odesa Partner3 New 3\n");
			Work4 = Work4.concat("Manager4 Odesa Partner4 New 4\n");
			Work4 = Work4.concat("Manager4 Odesa Partner5 New 2\n");
			Work4 = Work4.concat("Manager4 Odesa Partner6 New 3\n");
			Work4 = Work4.concat("Manager4 Odesa Partner7 Start 4\n");
			Work4 = Work4.concat("Manager4 Odesa Partner7 New 5\n");
			Work4 = Work4.concat("Manager4 Odesa Partner8 End 6\n");
			LoadingData(txtFile, Work4);
			System.out.println("-------------------------");
			System.out.println("work of Manager4 is loaded");
			System.out.println("-------------------------");

		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void LoadingData(String txtFile, String Work) throws IOException, InterruptedException {

		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw;

		try {
			fw = new FileWriter(txtFile);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(Work);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
