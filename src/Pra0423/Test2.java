package Pra0423;
//错误的
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextByte()){
            byte a=sc.nextByte();
            boolean isFu=false;
            if(a<0){
                isFu=true;
                a=(byte)(-a);
            }
            StringBuilder str=new StringBuilder();
            for(int i=0;i<32;i++){
                str.append(((a>>i)&1));
            }
            str.reverse();
            System.out.println(str);
            int count=0;
            int nums=0;
            for(int i=0;i<str.length();i++){
                char ch=str.charAt(i);
                if(ch=='1'&& i<str.length()){
                    nums++;
                    if(nums>count){
                        count=nums;
                    }
                }else{
                    nums=0;
                }
            }
            if(isFu&&a==127){
                count++;
            }
            System.out.println(count);
        }
    }
}
