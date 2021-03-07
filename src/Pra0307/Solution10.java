package Pra0307;
//判断链表中是否有环
//快慢指针
//如果两个指针重合，就是有环的，反之，无环
public class Solution10 {
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
