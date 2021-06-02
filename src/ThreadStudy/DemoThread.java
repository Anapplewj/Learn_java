package ThreadStudy;

public class DemoThread {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){

                }
            }
        },"t");
        t.setDaemon(true);
        t.start();
    }
}
