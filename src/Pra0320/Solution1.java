package Pra0320;
//二叉树创建字符串
//创建一个成员变量StringBuffer
//特殊位置加上括号，最后手动去掉不必要的括号即可
public class Solution1 {
    public static StringBuffer result=null;
    public String tree2str(TreeNode t) {
        result =new StringBuffer();
        if(t==null){
            return "";
        }
        build(t);
        result.deleteCharAt(0);
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
    public static void build(TreeNode t){
        if(t==null){
            return;
        }
        result.append("(");
        result.append(t.val);
        build(t.left);
        if(t.left==null&&t.right!=null){
            result.append("()");
        }
        build(t.right);
        result.append(")");
    }
}
