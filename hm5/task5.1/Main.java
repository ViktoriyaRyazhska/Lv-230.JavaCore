
public class Main {

	

	public static void main(String[] args) {
		Bird[] array = new Bird[5];
		array[0] = new Penguin("have not feathers", "can lay eggs");
		array[1] = new Kiwi("have not feathers", "can lay eggs");
		array[2] = new Chicken("have not feathers", "can lay eggs");
		array[3] = new Eagle("have feathers", "can lay eggs");
		array[4] = new Swallow("have feathers", "can lay eggs");
	
for(Bird a:array){
	System.out.println(a);
	a.fly();
}
	
	}

}
