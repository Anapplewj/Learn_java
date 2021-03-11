package Pra0310;
//链表的回文结构
//拷贝原链表到新的链表中
//逆置新链表
//新链表和原来的链表进行比对
//快慢指针方法判断
public class Solution8 {
    public boolean chkPalindrome(ListNode A) {
        if(A==null||A.next==null){
            return true;
        }
        ListNode result=new ListNode(0);
        ListNode rHead=result;
        ListNode rTail=result;
        //拷贝链表
        for(ListNode cur=A;cur!=null;cur=cur.next){
            rTail.next=new ListNode(cur.val);
            rTail=rTail.next;
        }
        rHead=rHead.next;
        //反转链表
        ListNode prevNode=null;
        ListNode newHead=null;
        ListNode curNode=rHead;
        while(curNode!=null){
            ListNode nextNode=curNode.next;
            if(curNode.next==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;
        }
        //判断链表是否相等
        ListNode curA=A;
        ListNode curR=newHead;
        while(curA!=null){
            if(curA.val!=curR.val){
                return false;
            }
            curA=curA.next;
            curR=curR.next;
        }
        return true;
    }
}
