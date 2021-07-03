package Pra0626.TestPriorityQueue;

import java.util.*;

//前k个高频单词,指定排序规则时,实现comparator,匿名内部类
public class Test3 {
    public static List<String> topKFrequent(String[] words, int k) {
        //首先将这些单词放到一个HashMap中
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String key=words[i];
            int value=map.getOrDefault(key,0);
            map.put(key,value+1);
        }
        //然后将这些单词按照频率放到一个List当中
        List<String> wordsList=new ArrayList<>(map.keySet());
        Collections.sort(wordsList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return map.get(o2)-map.get(o1);
            }
        });
        return wordsList.subList(0,k);
    }
    public static void main(String[] args) {
        String[] arr={"zs","zs","ttl","ls","zs"};
        System.out.println(topKFrequent(arr,2));
    }
}
