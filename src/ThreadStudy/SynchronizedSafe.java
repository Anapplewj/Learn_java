package ThreadStudy;

public class SynchronizedSafe {
    private static int count;

    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    increment3();
                }
            }).start();
        }
        while(Thread.activeCount()>1) Thread.yield();
        System.out.println(count);
    }

    private static synchronized void increment1() {//同步方法
        count++;
    }
    private static void increment2() {
        synchronized (SynchronizedSafe.class){//同步代码块
            count++;
        }
    }
    private static Object o=new Object();
    private static void increment3() { //同步代码块,使用new对象加锁
        synchronized (o){
            count++;
        }
    }

    private static void increment4(){
        synchronized (new Object()){
            count++;
        }
    }

}
