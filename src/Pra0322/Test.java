package Pra0322;

import java.util.ArrayList;
import java.util.PriorityQueue;
class Person implements Comparable<Person>{
    String name;
    int face;

    public Person(String name, int face) {
        this.name = name;
        this.face = face;
    }

    @Override
    public int compareTo(Person o) {
        return this.face-o.face;
    }
}
public class Test {
    public static void main(String[] args) {
        PriorityQueue<Person> queue4=new PriorityQueue<>();
        queue4.offer(new Person("白敬亭",100));
        queue4.offer(new Person("甜甜龙",101));
        queue4.offer(new Person("岳云鹏",20));
        System.out.println(queue4.poll().name);
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(4);
        list.add(3);
        list.add(9);
        list.add(2);
        PriorityQueue<Integer> queue2=new PriorityQueue<>(list);
        System.out.println(queue2.peek());
        System.out.println(queue2.size());
        //默认情况下PriorityQueue的底层容量为11
        PriorityQueue<Integer> queue3=new PriorityQueue<>();
        queue3.offer(10);
        queue3.offer(2);
        queue3.offer(13);
        queue3.offer(4);
        System.out.println(queue3.peek());
        System.out.println(queue3.size());

    }
}
