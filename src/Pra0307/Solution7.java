package Pra0307;

//删除有序链表中的重复节点
//创建一个新的带傀儡节点的链表用来保存结果
//遍历链表，将不重复的节点添加到新链表的尾部
public class Solution7 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newList=new ListNode(0);
        ListNode head=newList;
        ListNode tail=newList;
        ListNode cur=pHead;
        while(cur!=null){
            if(cur!=null&&cur.next!=null&&cur.val==cur.next.val){
                while(cur!=null&&cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
            }else {
                tail.next = new ListNode(cur.val);
                tail = tail.next;
            }
            cur=cur.next;
        }
        return head.next;
    }
}
