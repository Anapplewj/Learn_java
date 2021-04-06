package Pra0406;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    public boolean Find(int target, int [][] array) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                set.add(array[i][j]);
            }
        }
        if(set.contains(target)){
            return true;
        }
        return false;
    }
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        List<Integer> list=new ArrayList<>();
        ArrayList<Integer> result=new ArrayList<>();
        ListNode tail=listNode;
        while(tail!=null){
            list.add(tail.val);
            tail=tail.next;
        }
        for(int i=list.size()-1;i>=0;i--){
            result.add(list.get(i));
        }
        return result;
    }
//    public int minNumberInRotateArray(int [] array) {
//        if(array.length==0){
//            return 0;
//        }
//        int index1=0;
//        int index2=array.length-1;
//        if(array[index1]<array[index2]){
//            return array[index1];
//        }
//        int mid=(index2-index1)/2;
//        while(array[mid]>array[index1] && array[mid]<array[index2]){
//            index1=mid;
//            index2--;
//            mid=(index2-index1)/2;
//        }
//        int result=0;
//        if(index2-index1==1){
//            result=array[index2];
//        }
//        return result;
//    }
}
