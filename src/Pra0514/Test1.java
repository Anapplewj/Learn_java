package Pra0514;
//两个字符串的编辑距离
//未完
import java.util.*;

public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            if(str1==null||str2==null||str1.length()==0||str2.length()==0){
                System.out.println(-1);
                continue;
            }
            if(str1.length()>=str2.length()){
                System.out.println(get(str1,str2));
            }else{
                System.out.println(get(str2,str1));
            }
        }
    }

    private static int get(String str1,String str2){
        int len1=str1.length();
        for(int i=str2.length();i>0;i--){
            String temp=str2.substring(0,i);
            if(str1.contains(temp)){
                return len1-temp.length();
            }
        }
        return len1;
    }
}