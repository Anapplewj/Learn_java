package Pra0521;

import java.math.BigDecimal;
import java.util.Scanner;

//BigDecimal的使用
public class Test6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            BigDecimal num1=sc.nextBigDecimal();
            BigDecimal num2=sc.nextBigDecimal();
            BigDecimal len=new BigDecimal("6.28").multiply(num2);
            System.out.println(num1.compareTo(len)==1?"No":"Yes");
        }
    }
}
