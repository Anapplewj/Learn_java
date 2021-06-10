package ThreadStudy;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
    public static void main(String[] args) throws InterruptedException {
        Semaphore s=new Semaphore(0);
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(2);
                    }finally {
                        //线程执行完毕,不管是正常执行完毕还是异常执行完毕
                        // 都颁发一个许可证
                        s.release();
                    }
                }
            }).start();
        }
        s.acquire(10);//等待,获取到10个许可证,如果获取不到,就进入等待状态
        System.out.println(1);
    }
}
