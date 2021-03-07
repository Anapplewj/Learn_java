package Pra0307;
//输出链表的倒数第k个节点
//首先求出链表的长度length，
// 从链表的第一个节点开始走length-k步，便到达所求的节点
public class Solution4 {
    public int getLength(ListNode head){
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode FindKthToTail(ListNode head,int k){
        int length=getLength(head);
        if(k<0||k>length){
            return null;
        }
        int steps=length-k;
        ListNode cur=head;
        for(int i=0;i<steps;i++){
            cur=cur.next;
        }
        return cur;
    }
}
//注意：别忘了判断是否合法