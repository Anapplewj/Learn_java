package ThreadStudy;

public class NewThread {
    public static void main(String[] args) {
        Thread t=new Thread(){
            @Override
            public void run() {
                System.out.println("t run");
            }
        };
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println("r run");
            }
        };

        Thread tt=new Thread(r);
        Thread ttt=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                }
            }
        },"ttt");
        ttt.start();
    }
}
