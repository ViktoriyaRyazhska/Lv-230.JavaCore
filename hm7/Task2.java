package temp.hm7;

public class Task2 {
    public static void main(String[] args) {
        String s = "As its name   states, EETS was begun  as a 'club', and    it retains   certain   features of  that even now. ";
        s = s.replaceAll("\\s+", " ");
        System.out.println(s);
    }
}
