package Pra0305;
//判断链表中是否有环
//快慢指针的方法
//定义两个引用fast，slow指向头节点,fast每次走2步，slow每次走一步
//判断是否存在两个引用指向的节点相同的情况
//如果存在，那么链表存在环
//反之，不存在
public class Solution10 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null&&slow!=null&&slow.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
