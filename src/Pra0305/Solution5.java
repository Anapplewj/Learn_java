package Pra0305;
//将两个升序链表合并为一个新的升序链表
//创建一个新的链表用来保存结果
//定义一个引用指向新的链表的末尾，为了方便插入操作，给新链表中加入傀儡节点
//定义两个引用分别指向两个链表的第一个节点，进行比较，小的插入进新的链表的末尾，更新引用的指向
//直到某一个链表为空了，那么就将剩余的那个链表中的节点插入进新链表末尾即可
public class Solution5 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode head3=l3;
        ListNode tailNode=l3;
        ListNode head1=l1;
        ListNode head2=l2;
        while(head1!=null&&head2!=null){
            if(head1.val<head2.val){
                tailNode.next=new ListNode(head1.val);
                head1=head1.next;
            }else{
                tailNode.next=new ListNode(head2.val);
                head2=head2.next;
            }
            tailNode=tailNode.next;
        }
        if(head1==null){
            tailNode.next=head2;
        }else{
            tailNode.next=head1;
        }
        return head3.next;
    }
}
//注意：由于是带傀儡节点的链表，所以要返回头节点的下一个节点