package Pra0323;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.CompareGenerator;

import java.util.Comparator;
import java.util.PriorityQueue;
//实现Comparable接口
//class HomeWork implements Comparable<HomeWork>{
//    String name;
//    int time;    //交作业的时间
//    int interest; //对作业的感兴趣程度
//
//    public HomeWork(String name, int time,int interest) {
//        this.name = name;
//        this.time = time;
//        this.interest=interest;
//    }
//
//    @Override
//    public int compareTo(HomeWork o) {
//        return o.time-this.time;//将时间的大小作为比较的优先级
//        //return this.interest-o.interest;将感兴趣的程度作为比较的优先级
//    }
//}
class HomeWork{
    String name;
    int time;
    int interest;

    public HomeWork(String name, int time, int interest) {
        this.name = name;
        this.time = time;
        this.interest = interest;
    }
}
class HomeWorkComparator implements Comparator<HomeWork>{
    @Override
    public int compare(HomeWork o1, HomeWork o2) {
        return o1.time-o2.time;
        //return o1.interest-o2.interest;
    }
}
public class Test {
    public static void main(String[] args) {
        PriorityQueue<HomeWork> queue=new PriorityQueue<>(new HomeWorkComparator());
        queue.offer(new HomeWork("语文",10,0));
        queue.offer(new HomeWork("数学",13,5));
        queue.offer(new HomeWork("数据结构",16,100));
        System.out.println(queue.peek().name);
//        PriorityQueue<Integer> queue=new PriorityQueue<>();
//        queue.offer(2);
//        queue.offer(4);
//        queue.offer(1);
//        queue.offer(3);
//        System.out.println(queue.peek());
    }
}
