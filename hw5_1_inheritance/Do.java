package hw5_1;

public class Do {
	public static void main(String[] args) {
        Bird[] arr = new Bird[4];
        arr[0] = new Chicken("have feathers","can lay eggs");
        arr[1] = new Eagle("have feathers","can lay eggs");
        arr[2] = new Penguin("no feathers","can lay eggs");
        arr[3] = new Swallow("have feathers","can lay eggs");

        for(Bird bird:arr){
            System.out.print(bird+" ");
            bird.fly();
        }
    }
}
