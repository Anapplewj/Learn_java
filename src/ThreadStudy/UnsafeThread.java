package ThreadStudy;

public class UnsafeThread {
    private static int count;//堆,线程共享的区域

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<1000;j++){
                        count++;//线程栈,线程私有的区域
                    }
                }
            }).start();
        }
        //等待所有子线程打印完毕,再打印
        while(Thread.activeCount()>1) Thread.yield();
        System.out.println(count);
    }
}
