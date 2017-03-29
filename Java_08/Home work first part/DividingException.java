package package8;

public class DividingException extends Exception {
	private double var1;
	private double var2;

	public DividingException(String txt, double var1, double var2) {
		super(txt);
		this.var1 = var1;
		this.var2 = var2;
	}

	public String getResult() {
		return "Details:input1=" + var1 + "; input2=" + var2;
	}

}
