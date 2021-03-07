package Pra0307;
//链表的中间节点
//链表的长度/2=从链表的第一个节点开始要走的步数
public class Solution3 {
    public int getLength(ListNode head){
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode middleNode(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        int steps=getLength(head)/2;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
}
