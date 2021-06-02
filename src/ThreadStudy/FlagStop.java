package ThreadStudy;

public class FlagStop {
    private static volatile boolean isStop;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (!isStop) {
                        System.out.println("转账....");
                        Thread.sleep(1000);
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }).start();
        //停止转账
        Thread.sleep(3000);
        isStop=true;
    }
}
