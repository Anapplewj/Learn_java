package Pra0521;

import java.util.ArrayList;
import java.util.List;

//括号匹配问题
//要想让括号匹配,记录左右括号的数量
//如果左括号的数量<=n,那么就可以添加左括号
//如果右括号的数量<左括号的数量,那么就可以添加右括号
public class Test8 {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        if(n<=0){
            return list;
        }
        backtrack(list,n,0,0,new StringBuffer());
        return list;
    }

    private static void backtrack(List<String> list,int n,int left,
                                  int right,StringBuffer str){
        if(left==right&&left==n){
            list.add(str.toString());
        }else{
            if(left<n){
                str.append("(");
                backtrack(list,n,left+1,right,str);
                str.deleteCharAt(str.length()-1);
            }
            if(right<left){
                str.append(")");
                backtrack(list,n,left,right+1,str);
                str.deleteCharAt(str.length()-1);
            }

        }
    }
}
