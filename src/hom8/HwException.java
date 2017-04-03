package hom8;

public class HwException {

	public double div(double numb1, double numb2) throws ArithmeticException {
		if (numb2 == 0) {
			throw new ArithmeticException();
		}
		return numb1 / numb2;

	}

	public void readNumber(int start, int end) throws MyException {
		if (start < 0 || start > 1 && end < 1 || end > 20) {
			throw new MyException("Pls enter integer digit from 0 to 20");
		}
		System.out.println("start: " + start);
		System.out.println("end: " + end);

	}
}
