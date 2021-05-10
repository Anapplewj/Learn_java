package Pra0507;

import java.util.Scanner;

//超长整数的加法
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            StringBuilder num1=new StringBuilder(sc.nextLine());
            StringBuilder num2=new StringBuilder(sc.nextLine());
            StringBuilder temp=(num1.length()>=num2.length())?num1:num2;
            num2=(num1.length()<num2.length())?num1:num2;
            num1=temp;
            StringBuilder result=new StringBuilder();
            int flag=0;
            int j=num2.length()-1;
            for(int i=num1.length()-1;i>=0;i--){
                int cur1=Integer.parseInt(num1.charAt(i)+"");
                int cur2=0;
                if(j>=0){
                    cur2=Integer.parseInt(num2.charAt(j)+"");
                    j--;
                }
                int nums=cur1+cur2+flag;
                if(nums<10){
                    result.append(nums);
                    flag=0;
                    continue;
                }
                flag=nums/10;
                result.append(nums%10);
            }
            if(result.charAt(result.length()-1)=='0'){
                result.append("1");
            }
            System.out.println(result.reverse().toString());
        }
    }
}
