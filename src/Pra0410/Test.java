package Pra0410;

import java.util.*;

//字符串的排列
//拿出第一个字符和后面的字符进行交换,直到交换到了最后一个字符
//交换完成之后要恢复原来的顺序
public class Test {
    static char[] c;
    static ArrayList<String> list;
    public ArrayList<String> Permutation(String str) {
        c =str.toCharArray();//将原来的数组保留一份
        list=new ArrayList<>();
        healp(0);
        Collections.sort(list);
        return list;
    }
    private void healp(int x){
        if(x== c.length-1){
            list.add(String.valueOf(c));
            return;
        }else{
            Set<Character> set=new HashSet<>();
            for(int i=x;i<c.length;i++){
                if(set.contains(c[i])){
                    continue;
                }else{
                    set.add(c[i]);
                    swap(i,x);
                    healp(x+1);
                    swap(i,x);
                }
            }
        }

    }
    private void swap(int i,int x){
        char temp=c[i];
        c[i]=c[x];
        c[x]=temp;
    }

    public static int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int value=map.getOrDefault(array[i],0);
            map.put(array[i],value+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>array.length/2){
                return entry.getKey();
            }
        }
        return 0;
    }
    //返回前k小的数
    //排序
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(k<0||k>input.length){
            return list;
        }
        for(int x:input){
            list.add(x);
        }
        Collections.sort(list);
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            result.add(list.get(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] array={2,3,4,5,4,4,4,4,};
        System.out.println(GetLeastNumbers_Solution(array,3));
    }
}
