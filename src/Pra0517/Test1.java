package Pra0517;
//每次都是输入的处理,这也太烦了吧!!,做了个寂寞.
//还需加油,树根
import java.util.*;
public class Test1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String input="";
        while(sc.hasNext()){
            input+=sc.next();
        }
        String[] arr=input.split(" ");
        for(int j=0;j<arr.length;j++){
            String str=arr[j];
            while(str.length()>1){
                Long result=0l;
                for(int i=0;i<str.length();i++){
                    char ch=str.charAt(i);
                    if(ch>='A'&&ch<='F'){
                        result=result+10+(ch-'A');
                    }else {
                        result+=Integer.parseInt(ch+"");
                    }
                }
                if(result<10){
                    System.out.println(result);
                    break;
                }
                str=result+"";
            }
        }
    }
}