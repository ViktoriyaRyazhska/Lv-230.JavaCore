package hom4;

public class DayOfMonth {

	public void dayInMonth(int month) {
		int[] arrayMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 0; i < arrayMonth.length; i++) {
			if (month == i + 1) {
				System.out.println("Day of month: " + arrayMonth[i]);
			} else if (month >= 13) {
				System.out.println("Error, you entered faill number of month");
				break;
			}
		}
	}

}
