package Pra0408;

import java.util.Stack;

class Solution {
    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        if(pushed.length==0 && popped.length==0){
            return true;
        }
        Stack<Integer> stack=new Stack<>();
        int i=0;
        int j=0;
        stack.push(pushed[i]);
        i++;
        while(j<popped.length){
            if(!stack.isEmpty() && stack.peek()==popped[j]){
                stack.pop();
                j++;
                continue;
            }
            if(i<pushed.length){
                stack.push(pushed[i]);
                i++;
            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] pushA={1,2,3,4,5};
        int[] popA={4,5,3,2,1};
        System.out.println(validateStackSequences(pushA,popA));
    }
}
