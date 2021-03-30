package Pra0329;

import java.util.*;

public class Solution {
    //找到只出现一次的数字
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int value=map.getOrDefault(num,0);
            map.put(num,value+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue().equals(1)){
                return entry.getKey();
            }
        }
        return 0;
    }
    //复制带随机指针的链表
    public static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        Map<Node,Node> map=new HashMap<>();
        //首先根据原链表创建出正常的新节点，放在Map中
        for(Node cur=head;cur!=null;cur=cur.next){
            Node newNode=new Node(cur.val);
            map.put(cur,newNode);
        }
        //然后看原链表的指向关系，让新链表的指向也复制过来
        for(Node key:map.keySet()){
            map.get(key).next=map.get(key.next);
            map.get(key).random=map.get(key.random);
        }
        return map.get(head);
    }
    //宝石与石头，jewels代表宝石的类型，每个字符就是一种类型
    //stones代表我所拥有的石头的类型，判断我拥有的宝石的类型有多少种
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            jewelSet.add(jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(jewelSet.contains(ch)){
                count++;
            }
        }
        return count;
    }
    //坏键盘打字
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //首先将这些字符输入进来，转换为大写，将input存在Set中，看哪个不存在
        //注意，输出的结果不能重复输出而且输出的结果为大写
        while(sc.hasNext()){
            String input=sc.next();
            String result=sc.next();
            input=input.toUpperCase();
            result=result.toUpperCase();
            Set<Character> resultSet=new HashSet<>();
            Set<Character> printSet=new HashSet<>();
            for(int i=0;i<result.length();i++){
                resultSet.add(result.charAt(i));
            }
            for(int i=0;i<input.length();i++){
                char ch=input.charAt(i);
                if(!resultSet.contains(ch) && !printSet.contains(ch)){
                    printSet.add(ch);
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
    //前k个高频单词，将每个单词出现的次数统计下来，然后进行排序
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String str:words){
            int value=map.getOrDefault(str,0);
            map.put(str,value+1);
        }
        //设置一个比较方法，优先级队列
        List<String> listWords=new ArrayList<>(map.keySet());
        Collections.sort(listWords, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int count1=map.get(o1);
                int count2=map.get(o2);
                if(count1==count2){
                    return o1.compareTo(o2);
                }
                return count1-count2;
            }
        });
        return listWords.subList(0,k);
    }
}
