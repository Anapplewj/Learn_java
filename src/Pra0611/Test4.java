package Pra0611;

import java.util.*;

public class Test4{
    private static boolean isDigit(Character ch){
        if(ch>='0'&&ch<='9'){
            return true;
        }
        return false;
    }

    private static boolean isUpper(Character ch){
        if(ch>='A'&&ch<='Z'){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String str2="22233344455566677778889999";
        while(sc.hasNextLine()) {
            int n = Integer.parseInt(sc.nextLine());
            Set<String> set = new HashSet<>();
            for(int i=0;i<n;i++){
                String input=sc.nextLine();
                StringBuilder str=new StringBuilder();
                for(int j=0;j<input.length();j++){
                    char ch=input.charAt(j);
                    if (isDigit(ch)){
                        if(str.length()==3){
                            str.append("-");
                        }
                        str.append(ch);
                    }else if (isUpper(ch)){
                        if(str.length()==3){
                            str.append("-");
                        }
                        int index=str1.indexOf(ch);
                        str.append(str2.charAt(index));
                    }else if(ch=='-'&&str.length()==3){
                        str.append(ch);
                    }
                }
                set.add(str.toString());
            }//end for
            List<String> list=new ArrayList<>();
            for(String x:set){
                list.add(x);
            }
            Collections.sort(list);
            for(String x:list){
                System.out.println(x);
            }
        }
    }
}
