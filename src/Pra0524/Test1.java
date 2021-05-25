package Pra0524;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//未完成,分解因子
//分解因子,将一个整数分解成若干素数的乘积
public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            int tmp = num;
            System.out.print(num + "=");
            StringBuilder str=new StringBuilder();
            int left=2;
            int right=tmp;
            while(left<right){
                if(tmp%left==0){
                    str.append(left+"*");
                    tmp/=left;
                    left=2;
                }else{
                    left++;
                }
            }
            if(str.length()==0){
                System.out.println(num);
                continue;
            }
            str.delete(str.length()-1,str.length());
            System.out.println(str);
        }
    }
}
