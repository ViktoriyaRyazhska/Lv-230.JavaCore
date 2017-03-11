package Package1;

public class ActionOverProduct {

	private ActionOverProduct() {
	}

	public static void print() {
		System.out.println("Method action over product");
	}

	ActionOverProduct instance = new ActionOverProduct();

	// 4.3. Display the name and quantity of the most expensive item.
	public static void MoreExpensive(Product pr, Product pr1, Product pr2, Product pr3) {

		if ((pr.getPrice() > pr1.getPrice()) && (pr.getPrice() > pr2.getPrice()) && (pr.getPrice() > pr3.getPrice())) {
			System.out.println(pr);
		} else if ((pr1.getPrice() > pr.getPrice()) && (pr1.getPrice() > pr2.getPrice())
				&& (pr1.getPrice() > pr3.getPrice())) {
			System.out.println(pr1);
		} else if ((pr3.getPrice() > pr.getPrice()) && (pr3.getPrice() > pr1.getPrice())
				&& (pr3.getPrice() > pr2.getPrice())) {
			System.out.println(pr3);
		} else if ((pr2.getPrice() > pr.getPrice()) && (pr2.getPrice() > pr1.getPrice())
				&& (pr2.getPrice() > pr3.getPrice())) {
			System.out.println(pr2);
		}
	};

	// 4.4. Display the name of the items, which has the biggest quantity.
	public static void BiggestQuality(Product pr, Product pr1, Product pr2, Product pr3) {

		if ((pr.getQuality() > pr1.getQuality()) && (pr.getQuality() > pr2.getQuality())
				&& (pr.getQuality() > pr3.getQuality())) {
			System.out.println(pr.getName());
		} else if ((pr1.getQuality() > pr.getQuality()) && (pr1.getQuality() > pr2.getQuality())
				&& (pr1.getQuality() > pr3.getQuality())) {
			System.out.println(pr1.getName());
		} else if ((pr3.getQuality() > pr.getQuality()) && (pr3.getQuality() > pr1.getQuality())
				&& (pr3.getQuality() > pr2.getQuality())) {
			System.out.println(pr3.getName());
		} else if ((pr2.getQuality() > pr.getQuality()) && (pr2.getQuality() > pr1.getQuality())
				&& (pr2.getQuality() > pr3.getQuality())) {
			System.out.println(pr2.getName());
		}
	};

}
