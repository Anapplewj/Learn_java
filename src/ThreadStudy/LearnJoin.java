package ThreadStudy;

public class LearnJoin {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    System.out.println("t start");
                    Thread.sleep(5000);
                    System.out.println("t end");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        t.start();
        t.join(2000);
        System.out.println("main");
    }
}
