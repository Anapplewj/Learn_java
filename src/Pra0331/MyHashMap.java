package Pra0331;
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
    //插入键值对
    public void put(int key,int value){
        //按照 key/数组的长度转换下标
        int index=key%arr.length;
        //判断当前key是否存在，如果存在则直接修改key的value
        for(HashNode cur=arr[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                cur.value=value;
                return;
            }
        }
        //如果不存在，直接将其插入到index位置
        HashNode newNode=new HashNode(key,value);
        newNode.next=arr[index];
        arr[index]=newNode;
        size++;
        //考虑是否需要扩容，负载因子如果超过 0.75,就需要扩容
        if(loadFactor()>0.75){
            resize();
        }
    }
    //计算负载因子
    private double loadFactor(){
        return size/arr.length;
    }
    //扩容，创建一个新的数组，将原数组的内容拷贝到新的下标处
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
    //根据 key 得到 value
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
