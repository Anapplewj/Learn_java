package Pra0416;

import java.util.Scanner;
//下面结果有问题，先暂时记录下来，过几天再进行纠错
//将一个十进制数,转换成一个n进制数
public class Solution2 {
    public static StringBuilder str=new StringBuilder();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            double num=sc.nextDouble();
            int jinzhi=sc.nextInt();
            str=new StringBuilder();
            healp1(num,jinzhi);
            System.out.println(str);
        }
    }
    private static void healp1(double num,int jinzhi){
        if(jinzhi<=0||num<jinzhi-1){
            return;
        }
        if(num==jinzhi){
            if(jinzhi>=10){
                str.append((char) ('A'+ (jinzhi - 11)));
            }
        }else {
            int result = (int) num % jinzhi;
            healp1(num / jinzhi, jinzhi);
            if (result >= 10 && result <= 16) {
                str.append((char) ('A' + (result - 11)));
            } else {
                str.append(result);
            }
        }
    }
}
