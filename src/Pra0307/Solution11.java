package Pra0307;
//找到链表开始入环的第一个节点
//首先快慢指针判断链表是否有环
//从链表的第一个节点到入环的第一个节点的距离等于
// 从快慢指针交汇处出发到入环的第一个节点的距离
public class Solution11 {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        //快慢指针判断链表是否存在环
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||slow==null){
            return null;
        }
        ListNode cur1=head;
        ListNode cur2=slow;
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
}
