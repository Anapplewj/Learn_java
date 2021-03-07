package Pra0307;
//给定两个链表，找它们的第一个公共节点
//计算两个链表的长度l1,l2
//让长的那个链表先走了l1与l2之差步
//开始比对两个引用保存的地址是否相同

public class Solution9 {
    public int getLength(ListNode head){
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        int lenA=getLength(headA);
        int lenB=getLength(headB);
        ListNode curA=headA;
        ListNode curB=headB;
        if(lenA>lenB){
            for(int i=0;i<lenA-lenB;i++){
                curA=curA.next;
            }
        }else{
            for(int i=0;i<lenB-lenA;i++){
                curB=curB.next;
            }
        }
        while(curA!=null&&curB!=null){
            if(curA==curB){
                return curA;
            }else{
                curA=curA.next;
                curB=curB.next;
            }
        }
        return null;
    }
}
