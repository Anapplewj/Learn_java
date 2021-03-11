package Pra0310;
//找到链表开始入环的第一个节点
//首先判断链表是否存在环
//从链表的第一个节点到入环节点的距离等于
//快慢指针交汇处的距离到入环节点的距离
public class Solution11 {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        while(head!=fast){
            head=head.next;
            fast=fast.next;
        }
        return head;
    }
}
