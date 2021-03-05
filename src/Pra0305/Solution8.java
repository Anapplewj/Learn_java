package Pra0305;
//链表的回文结构
//将链表复制一份，到新的链表中
//逆置新的链表
//和旧的链表进行一一比对
public class Solution8 {
    public boolean chkPalindrome(ListNode A) {
        if(A==null||A.next==null){
            return true;
        }
        ListNode list1=new ListNode(0);
        ListNode head1=list1;
        ListNode tailNode=list1;
        for(ListNode cur=A;cur!=null;cur=cur.next){
            tailNode.next=new ListNode(cur.val);
            tailNode=tailNode.next;
        }
        head1=head1.next;
        //逆置链表
        ListNode prevNode=null;
        ListNode curNode=head1;
        ListNode newHead=null;
        for(;curNode!=null;){
            ListNode nextNode=curNode.next;
            if(curNode.next==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        ListNode headA=A;
        while(headA!=null&&newHead!=null){
            if(headA.val!=newHead.val){
                return false;
            }
            headA=headA.next;
            newHead=newHead.next;
        }
        return true;
    }
}
