package ThreadStudy;

public class SynchronizedTest {
    private int count;

    public static void main(String[] args) {
        SynchronizedTest test=new SynchronizedTest();
        for(int i=0;i<10;i++){
            final int k=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    test.count++;
                    for(int j=0;j<1000;j++){
                        if(k>0){
                            synchronized (SynchronizedTest.class) {
                                test.increment();
                            }
                        }else{
                                test.increment();
                            }
                    }
                }
            }).start();
        }
        while(Thread.activeCount()>1) Thread.yield();
        System.out.println(test.count);
    }

    private void increment(){
//        synchronized(this){
            count++;
        }
//    }
}
