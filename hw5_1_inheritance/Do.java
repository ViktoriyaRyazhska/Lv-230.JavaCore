package hw5_1;

public class Do {
	public static void main(String[] args) {
        Bird[] arr = new Bird[4];
        arr[0] = new Chicken("have feathers","може в≥дкладати €йц€");
        arr[1] = new Eagle("have feathers","може в≥дкладати €йц€");
        arr[2] = new Penguin("no feathers","може в≥дкладати €йц€");
        arr[3] = new Swallow("have feathers","може в≥дкладати €йц€");

        for(Bird bird:arr){
            System.out.print(bird+" ");
            bird.fly();
        }
    }
}
