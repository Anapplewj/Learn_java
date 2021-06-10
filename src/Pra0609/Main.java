// write your code here
import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str1=sc.next();
            String str2=sc.next();
            if(result(str1,str2)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }

    private static boolean result(String str1,String str2){
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<str1.length();i++){
            char ch=str1.charAt(i);
            int value=map1.getOrDefault(ch,0);
            map1.put(ch,value+1);
        }
        for(int i=0;i<str2.length();i++){
            char ch=str2.charAt(i);
            int value=map2.getOrDefault(ch,0);
            map2.put(ch,value+1);
        }
        if(map2.size()>map1.size()){
            return false;
        }
        //遍历map2,判断map2的value是否都小于等于map1的value
        for(Character x:map2.keySet()){
            int value2=map2.get(x);
            if(map1.getOrDefault(x,0)<value2){
                return false;
            }
        }
        return true;
    }
}