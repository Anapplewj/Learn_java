package Pra0413;

import java.util.HashMap;
import java.util.Map;

public class Solution3 {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0){
            return 0;
        }
        int length=array.length/2;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int value=map.getOrDefault(array[i],0);
            map.put(array[i],value+1);
        }
        int result=0;
        for(Integer key:map.keySet()){
            if(map.get(key)>length){
                result=key;
            }
        }
        return result;
    }
}
