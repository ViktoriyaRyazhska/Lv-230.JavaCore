package softserve.javacore.project;

import java.awt.*;
import javax.swing.*;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class FormCalc extends JFrame {
	JPanel windowContent;
	JTextField displayField;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton buttonMunic;
	JButton buttonEqual;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton buttonUM;
	JButton buttonDelX;
	JButton button0;
	JButton buttonPoint;
	JButton buttonPlus;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton buttonDel;
	JButton buttonPr;
	JFrame frame;

	FormCalc() {

		frame = new JFrame("GridBagLayoutTest");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container container = frame.getContentPane();

		container.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		container.setLayout(new GridBagLayout());
		GridBagConstraints constraints = new GridBagConstraints();

		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridy = 0;
		constraints.weightx = 0.5;
		constraints.gridwidth = 6;

		displayField = new JTextField(30);
		constraints.weighty = 1.1;
		constraints.gridx = 0;
		constraints.ipady = 50;
		constraints.anchor = GridBagConstraints.PAGE_START;
		container.add(displayField, constraints);

		button7 = new JButton("7");
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridwidth = 1;
		constraints.ipady = 8;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 1;
		container.add(button7, constraints);

		button8 = new JButton("8");
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 2;
		constraints.gridy = 1;
		container.add(button8, constraints);

		button9 = new JButton("9");
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 3;
		constraints.gridy = 1;
		container.add(button9, constraints);

		buttonDel = new JButton("/");
		constraints.weighty = 1.0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 4;
		constraints.gridy = 1;
		container.add(buttonDel, constraints);

		buttonPr = new JButton("%");
		constraints.weighty = 1.0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 5;
		constraints.gridy = 1;
		container.add(buttonPr, constraints);

		button4 = new JButton("4");
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridwidth = 1;
		constraints.ipady = 8;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 2;
		container.add(button4, constraints);

		button5 = new JButton("5");
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 2;
		constraints.gridy = 2;
		container.add(button5, constraints);

		button6 = new JButton("6");
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 3;
		constraints.gridy = 2;
		container.add(button6, constraints);

		buttonUM = new JButton("*");
		constraints.weighty = 1.0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 4;
		constraints.gridy = 2;
		container.add(buttonUM, constraints);

		buttonDelX = new JButton("1/x");
		constraints.weighty = 1.0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 5;
		constraints.gridy = 2;
		container.add(buttonDelX, constraints);

		button1 = new JButton("1");
		constraints.fill = GridBagConstraints.HORIZONTAL;
		constraints.gridwidth = 1;
		constraints.ipady = 8;
		constraints.insets = new Insets(2, 2, 2, 2);
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 3;
		container.add(button1, constraints);

		button2 = new JButton("2");
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 2;
		constraints.gridy = 3;
		container.add(button2, constraints);

		button3 = new JButton("3");
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 3;
		constraints.gridy = 3;
		container.add(button3, constraints);

		buttonMunic = new JButton("-");
		constraints.weighty = 1.0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 4;
		constraints.gridy = 3;
		container.add(buttonMunic, constraints);

		button0 = new JButton("0");
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 1;
		constraints.gridy = 4;
		constraints.gridwidth = 2;
		container.add(button0, constraints);

		buttonPoint = new JButton(".");
		constraints.weighty = 1.0;
		constraints.gridwidth = 1;
		constraints.gridheight = 1;
		constraints.gridwidth = 1;
		constraints.gridx = 3;
		constraints.gridy = 4;
		container.add(buttonPoint, constraints);

		buttonPlus = new JButton("+");
		constraints.weighty = 1.0;
		constraints.gridwidth = 1;
		constraints.gridheight = 2;
		constraints.gridwidth = 1;
		constraints.gridx = 4;
		constraints.gridy = 4;
		container.add(buttonPlus, constraints);

		buttonEqual = new JButton("=");
		constraints.gridwidth = 4;
		constraints.gridheight = 5;
		constraints.gridx = 5;
		constraints.gridy = 3;
		constraints.fill = GridBagConstraints.BOTH;
		container.add(buttonEqual, constraints);

		button0.addFocusListener(new CustomListener(this));
		button1.addFocusListener(new CustomListener(this));
		button2.addFocusListener(new CustomListener(this));
		button3.addFocusListener(new CustomListener(this));
		button4.addFocusListener(new CustomListener(this));
		button5.addFocusListener(new CustomListener(this));
		button6.addFocusListener(new CustomListener(this));
		button7.addFocusListener(new CustomListener(this));
		button8.addFocusListener(new CustomListener(this));
		button9.addFocusListener(new CustomListener(this));
		CalculatorEngine calcEngine = new CalculatorEngine(this);
		button0.addActionListener(calcEngine);
		button1.addActionListener(calcEngine);
		button2.addActionListener(calcEngine);
		button3.addActionListener(calcEngine);
		button4.addActionListener(calcEngine);
		button5.addActionListener(calcEngine);
		button6.addActionListener(calcEngine);
		button7.addActionListener(calcEngine);
		button8.addActionListener(calcEngine);
		button9.addActionListener(calcEngine);
		buttonMunic.addActionListener(calcEngine);
		buttonEqual.addActionListener(calcEngine);
		buttonPlus.addActionListener(calcEngine);
		buttonDel.addActionListener(calcEngine);
		buttonUM.addActionListener(calcEngine);

		frame.pack();
		frame.setSize(275, 280);

	}

	public void setVisible() {
		frame.setVisible(true);
	}

}
