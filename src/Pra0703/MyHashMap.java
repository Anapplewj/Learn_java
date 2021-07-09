package Pra0703;

class HashNode{
    int key;
    int value;
    HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class MyHashMap{
    private static HashNode[] arr=new HashNode[16];
    private static int size;

    public void put(int key,int value){
        int index=key%arr.length;
        for(HashNode cur=arr[index];cur!=null;cur=cur.next){
            if(cur.key==key){
                cur.value=value;
                return;
            }
        }
        HashNode newHashNode=new HashNode(key,value);
        newHashNode.next=arr[index];
        arr[index]=newHashNode;
        size++;

        //考虑是否达到负载因子扩容
        if(loadFactor()>0.75){
            resize();
        }
    }

    private int loadFactor(){
        return size/arr.length;
    }

    private void resize(){
        HashNode[] newArr=new HashNode[arr.length*2];
        for(int i=0;i<arr.length;i++){
            int newIndex=arr[i].key%newArr.length;
            HashNode next=null;
            for(HashNode cur=arr[i];cur!=null;cur=next){
                next=cur.next;
                cur.next=newArr[newIndex];
                newArr[newIndex]=cur;
            }
        }
        arr=newArr;
    }

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
