package Pra0307;
//合并两个有序链表，使得合并结果也为有序链表
//创建一个新链表，保存合并结果,为了方便插入，使其带傀儡节点
//创建两个引用分别指向两个链表,
//两个链表均不为空的情况下进行引用比较插入小的
//直到某个链表为空，就将另外一个链表插入到新的链表中
public class Solution5 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        ListNode l3=new ListNode(0);
        ListNode head3=l3;
        ListNode tailNode=l3;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                tailNode.next=new ListNode(cur1.val);
                cur1=cur1.next;
            }else{
                tailNode.next=new ListNode(cur2.val);
                cur2=cur2.next;
            }
            tailNode=tailNode.next;
        }
        if(cur1==null){
            tailNode.next=cur2;
        }else{
            tailNode.next=cur1;
        }
        return head3.next;
    }
}
