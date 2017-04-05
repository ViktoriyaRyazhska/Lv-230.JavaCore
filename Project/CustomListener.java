package softserve.javacore.project;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class CustomListener implements FocusListener {
	FormCalc parent;

	CustomListener(FormCalc parent) {
		this.parent = parent;
	}

	public void focusGained(FocusEvent e) {
		if (CalculatorEngine.lastEqual == true) {
			parent.displayField.setText("");
			CalculatorEngine.lastEqual = false;
		}
	}

	public void focusLost(FocusEvent e) {

	}

}
