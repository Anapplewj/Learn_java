package ThreadStudy;

public class ThreadAdv {
    public static void main(String[] args) throws InterruptedException {
//        long s1=System.nanoTime();
//        for(int i=0;i<8;i++){
//            test();
//        }
//        long e1=System.nanoTime();
//        System.out.printf("串行耗时: %s毫秒%n",(e1-s1)/1000/1000);

        long s2=System.nanoTime();
        for(int i=0;i<2;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<4;j++){
                        try {
                            test();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }
        //等待子线程执行完毕,再向下执行
        while(Thread.activeCount()>1) Thread.yield();
        long e2=System.nanoTime();
        System.out.printf("并行耗时: %s毫秒%n",(e2-s2)/1000/1000);

    }

    private static void test() throws InterruptedException {
        Thread.sleep(1000);
    }
}
