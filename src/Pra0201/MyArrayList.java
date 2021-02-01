package Pra0201;

class MyArrayListIndexOutOfRangeException extends RuntimeException{
    public MyArrayListIndexOutOfRangeException(String message) {
        super(message);
    }
}

public class MyArrayList {
    private String[] data=null;
    private int size=0;
    private int capacity=100;

    public MyArrayList() {
        data=new String[capacity];
    }
    //尾插元素
    public void add(String e){
        //扩容
        if(size>=capacity){
            realloc();
        }else{
            data[size]=e;
            size++;
        }
    }
    //插入到指定位置
    public void add(int index,String e){
        if(index<0||index>size){
            return;
        }
        //如果空间不够先进行扩容
        if(size>=capacity){
            realloc();
        }
        for(int i=size;i>=index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }
    //扩容
    private void realloc() {
        //首先创造一个新的数组
        capacity*=2;
        String[] newData=new String[capacity];
        for(int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data=newData;
    }
    //删除指定下标的元素
    public void remove(int index){
        if(index<0||index>=size){
            return;
        }
        for(int i=index;i<size;i++){
            data[i]=data[i+1];
        }
        size--;
    }
    //删除指定内容的元素,删除最左边出现的，只删除一个
    public boolean remove(String e){
        int i=0;
        for(;i<size;i++){
            if(data[i].equals(e)){
               break;
            }
        }
        if(i>=size){
            return false;
        }
        for(int j=i;j<size;j++){
            data[j]=data[j+1];
        }
        size--;
        return true;
    }
    //取出指定下标的元素
    public String get(int index){
        if(index<0||index>=size){
            throw new MyArrayListIndexOutOfRangeException("下标越界了，下标为："+index);
        }
        return data[index];
    }
    //设置指定下标的元素为某个值
    public boolean set(int index,String e){
        if(index<0||index>=size){
            throw new MyArrayListIndexOutOfRangeException("下标越界了，下标为："+index);
        }
        data[index]=e;
        return true;
    }
    //是否包含某个字符串
    public boolean contains(String e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    //从前往后找出第一个指定内容的位置
    public int indexOf(String e){
        for(int i=0;i<size;i++){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    //从后往前找出第一个指定内容的位置
    public int lastIndexOf(String e){
        for(int i=size-1;i>=0;i--){
            if(data[i].equals(e)){
                return i;
            }
        }
        return -1;
    }
    //清空
    public void clear(){
        size=0;
    }
    //返回已有元素的个数
    public int size(){
        return size;
    }
    //判断是否为空
    public boolean isEmpty(){
        if(size==0){
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("[");
        for(int i=0;i<size;i++){
            if(i==size-1){
                stringBuffer.append(data[i]+"]");
            }else {
                stringBuffer.append(data[i] + ",");
            }
        }
        return stringBuffer.toString();
    }
}
