package Pra0514;

import java.util.*;
//MP3音乐列表
public class Test3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            int n=Integer.parseInt(sc.nextLine());
            String input=sc.nextLine();
            char[] options=input.toCharArray();
            int biao=1;
            if(n<=4){
                for(int i=0;i<options.length;i++){
                    char ch=options[i];
                    if(biao==1&&ch=='U'){
                        biao=n;
                    }else if(biao==n&&ch=='D'){
                        biao=1;
                    }else if(ch=='U'){
                        biao-=1;
                    }else if(ch=='D'){
                        biao+=1;
                    }
                }
                for(int i=1;i<=n;i++){
                    if(i!=n){
                        System.out.print(i+" ");
                    }else{
                        System.out.println(i);
                    }
                }
                System.out.println(biao);
            }else {
                //表示起始位置
                int first=1;
                for(int i=0;i<options.length;i++){
                    char ch=options[i];
                    if(first==1&&biao==1&&ch=='U'){
                        first=n-3;
                        biao=n;
                    }else if(first==n-3&&biao==n&&ch=='D'){
                        first=1;
                        biao=1;
                    }else if(first!=1&&first==biao&&ch=='U'){
                        first-=1;
                        biao-=1;
                    }else if(first!=n-3&&(first+3==biao)&&ch=='D'){
                        first+=1;
                        biao+=1;
                    }else if(ch=='U'){
                        biao--;
                    }else if(ch=='D'){
                        biao++;
                    }
                }
                for(int i=first;i<=first+3;i++){
                    if(i!=first+3){
                        System.out.print(i+" ");
                    }else{
                        System.out.println(i);
                    }
                }
                System.out.println(biao);
            }
        }
    }
}