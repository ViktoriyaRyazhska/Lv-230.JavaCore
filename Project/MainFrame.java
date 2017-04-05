package softserve.javacore.project;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainFrame {
	JFrame f;

	MainFrame() {
		f = new JFrame();

		JButton bLoad = new JButton("load");
		bLoad.setBounds(30, 50, 100, 40);
		bLoad.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Thread tLoad = new ThredLoading();
				tLoad.start();
			}
		});

		JButton bPrint = new JButton("print");
		bPrint.setBounds(135, 50, 100, 40);
		bPrint.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				PreviousePrint();

			}
		});

		JButton bCalc = new JButton("calc");
		bCalc.setBounds(240, 50, 100, 40);
		FormCalc formCalc = new FormCalc();

		bCalc.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				formCalc.setVisible();
			}

		});

		f.add(bLoad);
		f.add(bPrint);
		f.add(bCalc);

		f.setSize(400, 200);
		f.setLayout(null);
		f.setVisible(true);
	}

	public void PreviousePrint() {
		List<CalculationPercent> ManagerList = new ArrayList<CalculationPercent>();
		String txtFile;

		txtFile = "Manager1.txt";
		LoadDataOfManager(txtFile, ManagerList);

		txtFile = "Manager2.txt";
		LoadDataOfManager(txtFile, ManagerList);

		txtFile = "Manager3.txt";
		LoadDataOfManager(txtFile, ManagerList);

		txtFile = "Manager4.txt";
		LoadDataOfManager(txtFile, ManagerList);

		ManagerList.sort(Manager.getRegionComparator());

		for (int i = 0; i < ManagerList.size(); i++) {

			System.out.println(ManagerList.get(i) + ", rating " + ManagerList.get(i).calculatePercent());
		}

	}

	public List<CalculationPercent> LoadDataOfManager(String txtFile, List<CalculationPercent> ManagerList)
			throws NumberFormatException {
		String[] masLine;

		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(txtFile);
			br = new BufferedReader(fr);
			String txtLineFromFile = null;

			while ((txtLineFromFile = br.readLine()) != null) {
				masLine = VerifyWordsInString.GetWords(txtLineFromFile);

				if (masLine[3].equals("New")) {
					ManagerList.add(new NewStage(masLine[0], CheckRegion(masLine[1].toString()), masLine[2],
							Double.parseDouble(masLine[4].toString())));

				} else if (masLine[3].equals("Start")) {

					ManagerList.add(new StartStage(masLine[0], CheckRegion(masLine[1].toString()), masLine[2],
							Double.parseDouble(masLine[4].toString())));

				} else if (masLine[3].equals("End")) {

					ManagerList.add(new EndStage(masLine[0], CheckRegion(masLine[1].toString()), masLine[2],
							Double.parseDouble(masLine[4].toString())));

				}
			}

		} catch (IOException e) {
		}

		return ManagerList;
	}

	public BisnecRegion CheckRegion(String region) {
		BisnecRegion br = BisnecRegion.Lviv;
		switch (region) {
		case "Dnipropetrovsk":
			br = BisnecRegion.Dnipropetrovsk;
			break;
		case "Lviv":
			br = BisnecRegion.Lviv;
			break;
		case "Odesa":
			br = BisnecRegion.Odesa;
			break;
		case "Kharkiv":
			br = BisnecRegion.Kharkiv;
			break;
		default:
			break;
		}

		return br;
	}
}