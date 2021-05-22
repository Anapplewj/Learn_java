package Pra0521;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        System.out.println(ha(20));
    }

    private static int ha(int num){
        Queue<Integer> queue=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        queue.offer(num);
        while(!queue.isEmpty()){
            int temp=queue.poll();
            int num1=isSu(temp);
            //是素数
            if(num1==1){
                set.add(temp);
                break;
            }else{
                set.add(num1);
                queue.offer(temp/num1);
            }
        }
        return set.size();
    }

    private static int isSu(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return i;
            }
        }
        return 1;
    }
}
