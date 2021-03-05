package Pra0305;

import java.util.List;

//给定值x将链表分割成两部分，比x小的在链表前面的部分，比x大的在链表的后面部分
//创建两个链表（为了方便插入，使其带傀儡节点），比x小的插入到smallList中，比x大的，插入到largeList中
//然后合并两个链表即可
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
