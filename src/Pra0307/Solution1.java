package Pra0307;
//删除链表中所有给定值为val的节点
//找到待删节点，和待删节点的前一个节点
//从头结点开始的下一个节点开始判断，因为删除头节点的方式和其他节点不同
//最后再判断头节点
public class Solution1 {
    public ListNode removeElements(ListNode head, int val){
        if(head==null){
            return null;
        }
        ListNode prevNode=head;
        ListNode curNode=prevNode.next;
        for(;curNode!=null;curNode=curNode.next){
            if(curNode.val==val){
                prevNode.next=curNode.next;
            }else {
                prevNode = curNode;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
