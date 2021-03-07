package Pra0307;

//链表的回文结构
//创建一个带傀儡节点的新链表
//将A链表拷贝一份到新链表
//反转新链表，和原来的链表进行比对
public class Solution8 {
    public boolean chkPalindrome(ListNode A){
        if(A==null||A.next==null){
            return true;
        }
        //拷贝链表
        ListNode list1=new ListNode(0);
        ListNode head1=list1;
        ListNode tail1=list1;
        for(ListNode cur=A;cur!=null;cur=cur.next){
            tail1.next=new ListNode(cur.val);
            tail1=tail1.next;
        }
        head1=head1.next;
        //逆置链表
        ListNode prevNode=null;
        ListNode curNode=head1;
        ListNode newHead=null;
        while(curNode!=null){
            ListNode nextNode=curNode.next;
            if(curNode.next==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        //比较两个链表
        //注意比对的是值
        ListNode cur1=newHead;
        ListNode cur2=A;
        while(cur1!=null&&cur2!=null){
            if(cur1.val!=cur2.val){
                return false;
            }
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return true;
    }
}
