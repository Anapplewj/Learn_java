package Pra0609;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            String[] arr=new String[str1.length()*str2.length()];
            Set<String> set=new HashSet<>();
            int size=0;
            for(int i=0;i<str1.length();i++){
                char ch1=str1.charAt(i);
                for(int j=0;j<str2.length();j++){
                    char ch2=str2.charAt(j);
                    arr[size]=(ch1+"")+(ch2+"");
                    if((!set.isEmpty())&&set.contains(arr[size])){
                        arr[size]="same";
                    }else{
                        set.add(arr[size]);
                    }
                    size++;
                }
            }
            for(int i=0;i<arr.length;i++){
                if(i==arr.length-1){
                    System.out.println(arr[i]);
                }else{
                    System.out.print(arr[i]+"+");
                }
            }
        }
    }
}
