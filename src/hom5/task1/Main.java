package hom5.task1;

public class Main {

	public static void main(String[] args) {

		Bird[] birds = new Bird[4];
		birds[0] = new Swallow(true, true);
		birds[1] = new Eagle(true, false);
		birds[2] = new Kiwi(true, false);
		birds[3] = new Penguin(false, false);

		for (Bird b : birds) {
			System.out.println(b);
		}
	}

}
