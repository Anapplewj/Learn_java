package Pra0319;

public class Solution7 {
    public static StringBuffer result=null;
    public String tree2str(TreeNode t) {
        if(t==null){
            return "";
        }
        result=new StringBuffer();
        build(t);
        result.deleteCharAt(0);
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
    public void build(TreeNode t){
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
