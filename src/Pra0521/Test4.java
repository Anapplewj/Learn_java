package Pra0521;

import java.util.*;

public class Test4 {
    private static Queue<Integer> queue=new LinkedList<>();
    private static Set<Integer> set=new HashSet<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            //判断一个数是否有是一个素数,如果是,就将其加入到列表中,如果不是,就
            //求出它的两个素数,加入到
            queue=new LinkedList<>();
            set=new HashSet<>();
            queue.offer(num);
            while(!queue.isEmpty()){
                int temp=queue.poll();
                isSu(temp);
            }
            System.out.println(set.size());
        }
    }

    private static void isSu(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                queue.offer(i);
                queue.offer(num/i);
                return;
            }
        }
        set.add(num);
    }
}
