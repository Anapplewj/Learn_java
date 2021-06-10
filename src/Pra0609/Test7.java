package Pra0609;

import java.util.*;

public class Test7{
    private static Set<Character> set;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            //处理输入
            int n1=sc.nextInt();
            List<String> list1=new ArrayList<>();
            for(int i=0;i<n1;i++){
                list1.add(sc.next());
            }
            Collections.sort(list1);
            String find=sc.next();
            int n2=sc.nextInt();
            //遍历数组,找到find的兄弟单词,将其放到一个顺序表中
            List<String> list=new ArrayList<>();
            set=new HashSet<>();
            for(int i=0;i<find.length();i++){
                set.add(find.charAt(i));
            }
            for(String x:list1){
                if(x.equals(find)){
                    continue;
                }else if(x.length()!=find.length()){
                    continue;
                }else if(function(x)){
                    list.add(x);
                }
            }
            System.out.printf("%d\t%s\n",list.size(),list.get(n2-1));
        }
    }

    private static boolean function(String x){
        for(int i=0;i<x.length();i++){
            if(!set.contains(x.charAt(i))){
                return false;
            }
        }
        return true;
    }
}