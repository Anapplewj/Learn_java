package Pra0311;

import java.util.Stack;

//括号匹配问题
//创建一个栈，先将所有的左括号入栈
//然后取到右括号和栈顶元素比较，是否相同
//如果栈为空，那么返回false，否则，如果左右匹配那就继续比较
//如果不匹配那就直接返回false
//如果栈为空了，然后右边的括号还有，或者栈非空，右边的括号没了
//那就返回false
public class Solution1 {
    public boolean isValid(String s) {
        Stack<Character> A=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            //如果遇到左括号就入栈
            if(c=='('||c=='{'||c=='['){
                A.push(c);
                continue;
            }
            //如果对空栈进行pop，就会抛出异常
            if(A.isEmpty()){
                return false;
            }
            Character top=A.pop();
            if(top=='('&& c==')'){
                continue;
            }
            if(top=='{'&& c=='}'){
                continue;
            }
            if(top=='['&& c==']'){
                continue;
            }
            //如果上面的三种情况都没有遇到，那就返回false
            return false;
        }
        if(A.isEmpty()){
            return true;
        }
        return false;
    }
}
