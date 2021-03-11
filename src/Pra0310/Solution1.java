package Pra0310;
//删除链表中所有指定值的节点
//得找到待删节点的前一个节点
public class Solution1 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        ListNode prevNode=head;
        ListNode curNode=prevNode.next;
        for(;curNode!=null;curNode=curNode.next){
            if(curNode.val==val){
                prevNode.next=curNode.next;
            }else{
                prevNode=curNode;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
