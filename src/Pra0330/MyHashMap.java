package Pra0330;
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
    //当前哈希表所存的元素个数
    private int size=0;
    //增加元素
    public void put(int key,int value){
        //首先计算出相应的下标
        int index=key%arr.length;
        //首先看一下key是否已经存在了
        for(HashNode cur=arr[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                cur.value=value;
                return;
            }
        }
        //如果不存在，那么就将新的key头插到新的对应位置
        HashNode newNode=new HashNode(key,value);
        newNode.next=arr[index];
        arr[index]=newNode;
        size++;
        //考虑是否需要扩容
        if(loadFactor()>0.75){
            resize();
        }
    }
    private void resize(){
        HashNode[] newArr=new HashNode[arr.length*2];
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
    private double loadFactor(){
        return (double)size/arr.length;
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
