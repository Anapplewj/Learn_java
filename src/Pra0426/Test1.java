package Pra0426;

import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String input=in.nextLine();
            String[] arr=input.split(" ");
            System.out.println(arr.length);
            for(String x:arr){
                System.out.println(x);
            }
        }
    }
}