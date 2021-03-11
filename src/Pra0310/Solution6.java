package Pra0310;
//以x为基准将链表切割为两部分
//创建两个链表smallList,largeList(带傀儡节点)
//然后合并两个链表
public class Solution6 {
    public ListNode partition(ListNode pHead, int x) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode smallList=new ListNode(0);
        ListNode sTail=smallList;
        ListNode sHead=smallList;
        ListNode largeList=new ListNode(0);
        ListNode lTail=largeList;
        ListNode lHead=largeList;
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
