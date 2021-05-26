package Pra0526;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            System.out.print(num + "=");
            for (int i = 2; i>1&&i*i <=num;i++ ) {
                while (num % i == 0) {
                    System.out.print(i + "*");
                    num /= i;
                }
            }
            if(num>1){
                System.out.println(num);
            }
        }
    }
}
