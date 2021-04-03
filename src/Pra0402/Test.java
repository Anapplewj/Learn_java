package Pra0402;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("wj");
        System.out.println(list.get(0));
        Map<String,String> map=new HashMap<>();
        map.put("wj","123");
        map.put("ttx","456");
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        for(String key:map.keySet()){
            System.out.println(key);
        }
        Set<String> set=new HashSet<>();
        set.add("wj");
        set.add("ttlxbb");
        for(String key:set){
            System.out.println(key);
        }
    }
    //前k个高频单词
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String w:words){
            int value=map.getOrDefault(w,0);
            map.put(w,value+1);
        }
        //对哈希表中的次数进行排序
        List<String> result=new ArrayList<>(map.keySet());
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int count1=map.get(o1);
                int count2=map.get(o2);
                if(count1==count2){
                    return o1.compareTo(o2);
                }
                return count2-count1;
            }
        });
        return result.subList(0,k);
    }
}
