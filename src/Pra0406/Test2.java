package Pra0406;

import java.util.Arrays;
import java.util.Stack;

public class Test2 {
    //用两个栈实现一个队
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int node){
        stack1.push(node);
    }
    public int pop(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int result=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return result;
    }
    //插入排序实现
    public static int[] reOrderArray (int[] array) {
        for(int bound=1;bound<array.length;bound++){
            int v=array[bound];
            //遇到
            if(((v-1)&1)==1){
                continue;
            }
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(((array[cur]-1)&1)==1){
                    array[cur+1]=array[cur];
                }else{
                    break;
                }
            }
            array[cur+1]=v;
        }
        return array;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        reOrderArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
