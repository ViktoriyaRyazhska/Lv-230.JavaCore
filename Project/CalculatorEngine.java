package softserve.javacore.project;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.xml.bind.ParseConversionEvent;

public class CalculatorEngine implements ActionListener {
	FormCalc parent;
	char selectedAction = ' '; // +,-,/,*
	double currentResult = 0;
	static boolean lastEqual = false;

	CalculatorEngine(FormCalc parent) {
		this.parent = parent;
	}

	public void actionPerformed(ActionEvent e) {

		JButton clickedButton = (JButton) e.getSource();
		String dispFieldText = parent.displayField.getText();

		double displayValue = 0;

		if (!"".equals(dispFieldText)) {
			try {
				displayValue = Double.parseDouble(dispFieldText);
			} catch (NumberFormatException e1) {
			  e1.getMessage();
			}

		}

		Object src = e.getSource();

		if (src == parent.buttonPlus) {
			selectedAction = '+';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonMunic) {
			selectedAction = '-';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonDel) {
			selectedAction = '/';
			currentResult = displayValue;
			parent.displayField.setText("");
		} else if (src == parent.buttonUM) {
			selectedAction = '*';
			currentResult = displayValue;
			parent.displayField.setText("");
		}

		else if (src == parent.buttonEqual) {
			lastEqual = true;
			if (selectedAction == '+') {
				currentResult += displayValue;
				parent.displayField.setText("" + currentResult);
			} else if (selectedAction == '-') {
				currentResult -= displayValue;
				parent.displayField.setText("" + currentResult);
			} else if (selectedAction == '/') {
				currentResult = currentResult / displayValue;
				parent.displayField.setText("" + currentResult);
			} else if (selectedAction == '*') {
				currentResult *= displayValue;
				parent.displayField.setText("" + currentResult);
			}
		} else {
			String clickedButtonLabel = clickedButton.getText();
			parent.displayField.setText(dispFieldText + clickedButtonLabel);
		}
	}
}
