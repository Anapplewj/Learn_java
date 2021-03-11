package Pra0310;
//将连个有序链表合并成为一个有序链表
//创建一个新的链表保存最终结果(带傀儡节点)
//两个引用分别指向两个链表
public class Solution5 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode(0);
        ListNode head3=l3;
        ListNode tail3=l3;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                tail3.next=new ListNode(cur1.val);
                cur1=cur1.next;
            }else{
                tail3.next=new ListNode(cur2.val);
                cur2=cur2.next;
            }
            tail3=tail3.next;
        }
        if(cur1==null){
            tail3.next=cur2;
        }else{
            tail3.next=cur1;
        }
        return head3.next;
    }
}
