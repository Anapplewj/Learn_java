package Pra0305;
//链表的中间节点
//首先求出链表的长度length
//length/2就是从头要走的步数
public class Solution3 {
    public int getLength(ListNode head){
        int len=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            len++;
        }
        return len;
    }
    public ListNode middleNode(ListNode head) {
        int steps=getLength(head)/2;
        for(int i=0;i<steps;i++){
            head=head.next;
        }
        return head;
    }
}
