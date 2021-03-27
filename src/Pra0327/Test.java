package Pra0327;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("wj","520");
        map.put("wj","5201314");
        map.put("ttlxbb","520");
        System.out.println(map.getOrDefault("wjxbb","haha"));
        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.print(entry.getKey()+","+entry.getValue());
        }
        System.out.println();
        for(String key:map.keySet()){
            System.out.println(key);
        }
    }
}
