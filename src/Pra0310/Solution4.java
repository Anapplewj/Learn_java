package Pra0310;
//输出链表中倒数第k个节点
//首先计算出链表的长度length
//链表长度减去k就是需要走的步数
public class Solution4 {
    public int getLength(ListNode head){
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode FindKthToTail(ListNode head,int k) {
       int length=getLength(head);
       if(k<=0||k>length){
           return null;
       }
       for(int i=0;i<length-k;i++){
           head=head.next;
       }
       return head;
    }
}
