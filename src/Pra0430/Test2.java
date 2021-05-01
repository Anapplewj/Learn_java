package Pra0430;

import java.util.ArrayList;
import java.util.Scanner;

//判断扑克牌的大小
//个子,对子,顺子,炸弹,和对王
//比较大小,将输入的东西进行排序
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            ArrayList<String> arr1=new ArrayList<>();
            ArrayList<String> arr2=new ArrayList<>();
            boolean two=false;
            int begin=0;
            String input2=input;
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(ch=='-'){
                    two=true;
                    arr1.add(input.substring(begin,i));
                    begin+=1;
                }
                if(ch==' '){
                    if(!two){
                        arr1.add(input.substring(begin,i));
                    }else{
                        arr2.add(input.substring(begin,i));
                    }
                    begin+=1;
                }
                input=input2;
            }
            for(String x:arr1){
                System.out.print(x);
            }
            System.out.println();
            for(String x:arr2){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
