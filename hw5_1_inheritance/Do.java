package hw5_1;

public class Do {
	public static void main(String[] args) {
        Bird[] arr = new Bird[4];
        arr[0] = new Chicken("have feathers","���� ��������� ����");
        arr[1] = new Eagle("have feathers","���� ��������� ����");
        arr[2] = new Penguin("no feathers","���� ��������� ����");
        arr[3] = new Swallow("have feathers","���� ��������� ����");

        for(Bird bird:arr){
            System.out.print(bird+" ");
            bird.fly();
        }
    }
}
