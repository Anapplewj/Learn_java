package Pra0305;
//找到链表中倒数第k个节点
//首先得到链表的总长度length
//倒数第k个节点就是从第一个节点开始向后走length-k步
//注意要判断k是否合理(k<=0,或者k大于链表的长度)
public class Solution4 {
    public int getLength(ListNode head){
        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        return length;
    }
    public ListNode FindKthToTail(ListNode head,int k) {
        if(k<=0||k>getLength(head)){
            return null;
        }
        int steps=getLength(head)-k;
        for(int i=0;i<steps;i++){
            head=head.next;
        }
        return head;
    }
}
