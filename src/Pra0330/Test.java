package Pra0330;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<String> set=new HashSet<>();
        set.add("路飞");
        set.add("娜美");
        set.add("索隆");
        Iterator<String> it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        for(String key:set){
//            System.out.println(key);
//        }
//        Map<String,String> map=new HashMap<>();
//        map.put("吃货","路飞");
//        map.put("财迷","娜美");
//        map.put("路痴","索隆");
//        for(String key:map.keySet()){
//            System.out.println(key);
//        }
//        for(String value:map.values()){
//            System.out.println(value);
//        }
//        for(Map.Entry<String,String> entry:map.entrySet()){
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }
    }
}
