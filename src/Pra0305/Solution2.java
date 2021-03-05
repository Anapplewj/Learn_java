package Pra0305;
//反转一个单链表
//首先判断链表是否为空或者链表中是否只有一个节点
//四个引用：prev,cur,newHead,nextNode
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
            if(nextNode==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        return newHead;
    }
}
//遇到的问题：忘记判断链表为空或者链表只有一个元素的情况
//有的细节也不是很熟练
