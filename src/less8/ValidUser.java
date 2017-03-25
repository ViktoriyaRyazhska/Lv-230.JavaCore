package less8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidUser {

	public String validUserName(String name) {
		Pattern pattern = Pattern.compile("[\\w]{2,14}");
		Matcher m = pattern.matcher(name);
		if (m.matches()) {
			return "Mathes";
		}
		return "Error";
	}
}
