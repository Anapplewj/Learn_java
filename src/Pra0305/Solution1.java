package Pra0305;
//删除链表中给定值的所有节点
//遍历数组，prevNode和curNode，然后再判断头节点是否也满足删除条件
public class Solution1 {
    public ListNode removeElements(ListNode head, int val){
        ListNode prev=head;
        ListNode cur=prev.next;
        for(;cur!=null;cur=cur.next){
            if(cur.val==val){
                prev.next=cur.next;
                //cur=cur.next;
                //prev.next=cur;//两种方法都可行
            }else{
                prev=cur;
            }
        }
        if(head.val==val){
            return head.next;
        }
        return head;
    }
}
