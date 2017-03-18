package temp.task1;

/**
 * Created by forest on 18.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bird[] arrayOfBird = new Bird[4];
        arrayOfBird[0] = new Chicken("have feathers","can lay eggs");
        arrayOfBird[1] = new Eagle("have feathers","can lay eggs");
        arrayOfBird[2] = new Penguin("no feathers","can lay eggs");
        arrayOfBird[3] = new Swallow("have feathers","can lay eggs");

        for(Bird b:arrayOfBird){
            System.out.print(b+" ");
            b.fly();
        }
    }
}
