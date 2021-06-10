package Pra0603;

public class MyBlockingQueue<E> {

    private Object[] elements;
    private int putIndex;//存放元素的索引
    private int takeIndex;//取元素的索引
    private int size; //当前存放的数量
    public MyBlockingQueue(int capacity){
        elements=new Object[capacity];
    }
    public synchronized void put(E e){
        try {
            while(size==elements.length){
                this.wait();
            }
            elements[putIndex]=e;
            size++;
            putIndex=(putIndex+1)%elements.length;
            notifyAll();
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }

    //取元素
    public synchronized E take(){
        try {
            while(size==0){
                wait();
            }
            E e=(E)elements[takeIndex];
            size--;
            takeIndex=(takeIndex+1)%elements.length;
            notifyAll();
            return e;
        } catch (InterruptedException e1) {
            e1.printStackTrace();
            throw new RuntimeException("被中断了",e1);
        }
    }

    public static void main(String[] args) {
        MyBlockingQueue<Integer> myBlockingQueue=new MyBlockingQueue<>(10);
        //生产者存放元素
        //消费者取元素
        for(int i=0;i<5;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        myBlockingQueue.put(3);
                        System.out.println("生产了三个面包"+Thread.currentThread().getName());
                        try {
                            Thread.sleep(300);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            },"shen["+i+"]").start();
        }

        for(int i=0;i<5;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        Integer n=myBlockingQueue.take();
                        System.out.println("消费者,消费了: "+n);
                    }
                }
            }).start();
        }
    }
}
