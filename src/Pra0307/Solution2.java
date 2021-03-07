package Pra0307;
//反转一个单链表
//需要四个引用
//prevNode,curNode,newHead,nextNode
public class Solution2 {
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode prevNode=null;
        ListNode curNode=head;
        ListNode newHead=null;
        for(;curNode!=null;){
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
//存在的问题，又忘记判断链表是否为空了