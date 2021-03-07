package Pra0307;

//以x为基准，将一个链表分为两个部分
//小于x的在前面部分，大于x在后面部分
//创建两个链表，smallList，largeList分别存放小于x和大于x的节点
//最后将两个链表合并即可
public class Solution6 {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode smallList=new ListNode(0);
        ListNode sHead=smallList;
        ListNode sTail=smallList;
        ListNode largeList=new ListNode(0);
        ListNode lHead=largeList;
        ListNode lTail=largeList;
        for(ListNode cur=pHead;cur!=null;cur=cur.next){
            if(cur.val<x){
                sTail.next=new ListNode(cur.val);
                sTail=sTail.next;
            }else{
                lTail.next=new ListNode(cur.val);
                lTail=lTail.next;
            }
        }
        sTail.next=lHead.next;
        return sHead.next;
    }
}
//一定要注意返回的结果