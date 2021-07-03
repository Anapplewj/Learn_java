package Pra0626.TestPriorityQueue;

import java.util.PriorityQueue;
//实现Comparable接口,重写compareTo方法
class HomeWork implements Comparable<HomeWork>{
    String name;
    int time;
    int interest;

    public HomeWork(String name, int time, int interest) {
        this.name = name;
        this.time = time;
        this.interest = interest;
    }
    @Override
    public int compareTo(HomeWork o){
        return this.time-o.time;
    }

    @Override
    public String toString() {
        return "HomeWork{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", interest=" + interest +
                '}';
    }
}
public class Test1 {
    public static void main(String[] args) {
        PriorityQueue<HomeWork> queue=new PriorityQueue<>();
        queue.offer(new HomeWork("语文",10,20));
        queue.offer(new HomeWork("数学",20,100));
        queue.offer(new HomeWork("化学",3,20));
        System.out.println(queue.peek());
        //插入的元素可以比较大小,默认是升序的.
//        PriorityQueue<Integer> queue=new PriorityQueue<>();
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(-1);
//        queue.offer(10);
//        System.out.println(queue.peek());
    }
}
