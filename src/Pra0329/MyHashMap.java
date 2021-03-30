package Pra0329;
//哈希桶的方式实现哈希表,数组的每个元素是一个链表
class HashNode{
    int key;
    int value;
    HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class MyHashMap {
    private HashNode[] arr=new HashNode[16];
    private int size=0;
    //插入元素
    public void put(int key,int value){
        int index=key%arr.length;
        //先看key是不是已经存在，若存在就修改key的value
        for(HashNode cur=arr[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                cur.value=value;
            }
        }
        //若不存在，就头插
        HashNode newNode=new HashNode(key,value);
        newNode.next=arr[index];
        arr[index]=newNode;
        index++;
        //判断是否需要扩容，负载因子>0.75时，负载因子=元素的个数/数组的长度
        if(loadFactor()>0.75){
            reSize();
        }
    }
    private double loadFactor(){
        return size/arr.length;
    }
    private void reSize(){
        HashNode newArr[]=new HashNode[arr.length*2];
        for(int i=0;i<arr.length;i++){
            HashNode next=null;
            for(HashNode cur=arr[i];cur!=null;cur=next){
                next=cur.next;
                int newIndex=cur.key%newArr.length;
                cur.next=newArr[newIndex];
                newArr[newIndex]=cur;
            }
        }
        arr=newArr;
    }
    //查找元素
    public Integer get(int key){
        int index=key%arr.length;
        for(HashNode cur=arr[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                return cur.value;
            }
        }
        return null;
    }
}
