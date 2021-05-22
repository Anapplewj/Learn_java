package Pra0521;

import java.util.*;

//电话号码的字母组合
public class Test7 {
    public static void main(String[] args) {

    }
    public List<String> letterCombinations(String digits) {
        List<String> list=new ArrayList<>();
        if(digits==null||digits.length()==0){
            return list;
        }
        Map<Character,String> map=new HashMap<>();
        map.put('1',"");
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(list,map,digits,0,new StringBuffer());
        return list;
    }

    public static void backtrack(List<String> list,Map<Character,String>
                                 map,String digits,int index,StringBuffer str){
        if(index==digits.length()){
            list.add(str.toString());
        }else{
            char digit=digits.charAt(index);
            String cur=map.get(digit);
            int len=cur.length();
            for(int i=0;i<len;i++){
                char ch=cur.charAt(i);
                str.append(ch);
                backtrack(list,map,digits,index+1,str);
                str.deleteCharAt(index);
            }
        }
    }
}
