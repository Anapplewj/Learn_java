package Pra0310;
//删除有序链表中的重复节点
//由于是有序链表，所以链表中的重复节点在相邻的位置
public class Solution7 {
    public ListNode deleteDuplication(ListNode pHead) {
        if(pHead==null||pHead.next==null){
            return pHead;
        }
        ListNode cur=pHead;
        ListNode newList=new ListNode(0);
        ListNode newHead=newList;
        ListNode newTail=newList;
        while(cur!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                while(cur!=null&&cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
            }else{
                newTail.next=new ListNode(cur.val);
                newTail=newTail.next;
            }
            cur=cur.next;
        }
        return newHead.next;
    }
}
