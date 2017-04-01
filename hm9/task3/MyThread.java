package temp.hm9.task3;

/**
 * Created by forest on 31.03.2017.
 */
public class MyThread extends Thread{
    private String text;
    private Thread thread;
    private int count;

    public MyThread(String text,int count, Thread thread) {
        this.text = text;
        this.thread = thread;
        this.count = count;
    }
    public MyThread(String text, int count) {
        this.text = text;
        this.count = count;
    }
    public MyThread(Thread thread) {
        this.thread = thread;
    }

    public String getText() {
        return text;
    }

    public Thread getThread() {
        return thread;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        if(getThread() != null){
            getThread().start();
        }
        for(int i=0; i<getCount(); i++){
            System.out.println(getText());
        }
    }
}
