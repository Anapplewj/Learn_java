package Pra0528;

import java.util.*;
//首先得明确,如果遇到双引号,说明里面遇到空格或者,都是需要处理的.
//并且处理完成之后,遇到下一个双引号,就截止,设标签为false
//如果没有双引号,那么遇到空格就换新的去拼接.
public class Test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String input=sc.nextLine();
            String name=sc.nextLine();
            boolean flag=false;
            Set<String> set=new HashSet<>();
            StringBuilder str=new StringBuilder();
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(ch=='\"'&&!flag){
                    flag=true;
                    continue;
                }else if(ch=='\"'&&flag){
                    flag=false;
                    set.add(str.toString());
                    str=new StringBuilder();
                    continue;
                }
                if(ch==','&&!flag){
                    set.add(str.toString());
                    str=new StringBuilder();
                }else{
                    str.append(ch);
                }
            }
            if(set.contains(name)){
                System.out.println("Ignore");
            }else{
                System.out.println("Important!");
            }
        }
    }
}
