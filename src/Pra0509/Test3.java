package Pra0509;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Integer> queue=new LinkedList<>();
        while (in.hasNextInt()) {
            int num=in.nextInt();
            if(num!=0) {
                queue.offer(num);
            }else{
                break;
            }
        }
        ping(queue);
    }
        private static void ping(Queue<Integer> queue) {
            while (!queue.isEmpty()) {
                int empty = queue.poll();
                int drink = 0;
                int result = 0;
                while (empty != 0) {
                    if (empty > 3) {
                        drink += empty / 3;
                        empty %= 3;
                        empty += drink;
                        result += drink;
                        drink = 0;
                    } else {
                        break;
                    }
                }
                System.out.println(result + 1);
            }
        }
}
