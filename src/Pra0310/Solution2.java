package Pra0310;
//反转链表
//需要四个引用 prevNode,curNode,nextNode,newHead
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prevNode=null;
        ListNode curNode=head;
        ListNode newHead=null;
        while(curNode!=null){
            ListNode nextNode=curNode.next;
            if(curNode.next==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        return newHead;
    }
}
