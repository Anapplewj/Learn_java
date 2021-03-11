package Pra0310;
//找到两个链表相交的第一个节点
//首先求出两个链表的长度len1,len2
//长的那个链表先走链表长度之差步
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
            int steps=lenA-lenB;
            for(int i=0;i<steps;i++){
                curA=curA.next;
            }
        }else{
            int steps=lenB-lenA;
            for(int i=0;i<steps;i++){
                curB=curB.next;
            }
        }
        while (curA!=null&&curB!=null){
            if(curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }
}
