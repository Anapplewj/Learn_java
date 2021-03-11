package Pra0310;
//返回链表的中间节点
//首先计算出链表的长度length
//length/2为需要从头结点出发走的步数
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
        for(int i=0;i<steps;i++){
            head=head.next;
        }
        return head;
    }
}
