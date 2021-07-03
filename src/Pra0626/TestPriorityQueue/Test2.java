package Pra0626.TestPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
//创建一个新的类，实现Comparator接口，比较另外的类的两个对象
//在这个新创建的类中,重写compare方法.
class HomeWork2{
    String name;
    int time;
    int interest;

    public HomeWork2(String name, int time, int interest) {
        this.name = name;
        this.time = time;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "HomeWork2{" +
                "name='" + name + '\'' +
                ", time=" + time +
                ", interest=" + interest +
                '}';
    }
}
class HomeWork2Comparator implements Comparator<HomeWork2>{
    @Override
    public int compare(HomeWork2 o1,HomeWork2 o2){
        return o1.time-o2.time;
    }
}

public class Test2 {
    public static void main(String[] args) {
        PriorityQueue<HomeWork2> queue=new PriorityQueue<>(new HomeWork2Comparator());
        queue.offer(new HomeWork2("语文",10,20));
        queue.offer(new HomeWork2("数学",20,100));
        queue.offer(new HomeWork2("化学",3,20));
        System.out.println(queue.peek());
    }
}
