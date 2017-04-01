package temp.hm9.task1;

public class MyThread extends Thread {
    private String text;

    public MyThread(String text) {
        this.text = text;
        this.start();
    }

    public String getText() {
        return text;
    }

    @Override
    public void run() {
        for(int i=0; i<10000; i++){
            System.out.println(getText());
        }
    }
}
