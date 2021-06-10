package ThreadStudy;

import java.util.concurrent.*;

public class TreadPoolTest {
    private Object NullPointerException;

    public static void main(String[] args) {
        ThreadPoolExecutor pool=new ThreadPoolExecutor(
                4,
                10,
                60,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return new Thread(r);
                    }
                },
                new ThreadPoolExecutor.CallerRunsPolicy()
//                new ThreadPoolExecutor.AbortPolicy()
//                new ThreadPoolExecutor.DiscardPolicy()
//                new ThreadPoolExecutor.DiscardOldestPolicy()
        );
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });
        ExecutorService single=Executors.newSingleThreadExecutor();
        ExecutorService fixed=Executors.newFixedThreadPool(4);
        ExecutorService catched=Executors.newCachedThreadPool();
        ScheduledExecutorService scheduled=Executors.newScheduledThreadPool(4);
    }

}
