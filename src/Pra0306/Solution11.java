package Pra0306;

//返回链表的入环节点
//先使用快慢指针判断链表是否存在环，找到快慢指针交汇的处
//定义两个引用，分别指向链表的头节点和交汇的地方
//从两个引用的地方出发，交汇的地方便是链表入环的第一个节点
public class Solution11 {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        //快慢指针判断链表中是否存在环
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
            //说明链表是不带环的
            return null;
        }
        ListNode cur1=head;
        ListNode cur2=fast;
        while(cur1!=cur2){
            cur1=cur1.next;
            cur2=cur2.next;
        }
        return cur1;
    }
}
