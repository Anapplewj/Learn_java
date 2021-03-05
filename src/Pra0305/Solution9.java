package Pra0305;
//找到两个链表相交的起始节点
//两个链表相交，不可能是x形状的，因为相交的那个节点的next只能保存一个地址，
//也就是说，从相交处开始，之后的节点都是相同的~
//首先求出两个链表的长度len1,len2，如果len1>len2,让长的链表先走len1-len2步,反之
//然后开始判断(==)是否相等
public class Solution9 {
    public int getLength(ListNode head){
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=getLength(headA);
        int len2=getLength(headB);
        ListNode curA=headA;
        ListNode curB=headB;
        if(len1>len2){
            int steps=len1-len2;
            for(int i=0;i<steps;i++){
                curA=curA.next;
            }
        }else{
            int steps=len2-len1;
            for(int i=0;i<steps;i++){
                curB=curB.next;
            }
        }
        while(curA!=null&&curB!=null){
            if(curA==curB){
                return curA;
            }
            curA=curA.next;
            curB=curB.next;
        }
        return null;
    }
}
