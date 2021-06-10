package Pra0609;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                String str=sc.next();
                print(str);
            }
        }
    }

    private static void print(String str){
        int left=0;
        int right=0;
        List<String> list=new ArrayList<>();
        StringBuilder row=new StringBuilder();
        for(int j=0;j<str.length();j++){
            char ch=str.charAt(j);
            if(ch=='['){
                left++;
                row.append(ch);
            }else if(ch==']'){
                right++;
                row.append(ch);
            }
            if(left==right&&left!=0&&right!=0){
                row.delete(0,1);
                row.delete(row.length()-1,row.length());
                list.add(row.toString());
                left=0;
                right=0;
                row=new StringBuilder();
            }
        }
        for(String x:list){
            System.out.print(x);
        }
        System.out.println();
    }
}
