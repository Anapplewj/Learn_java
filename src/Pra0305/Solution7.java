package Pra0305;
//删除链表中的重复节点
//创建一个新的链表，用来保存最终结果
//遍历原有链表，找到当前的val和下一个的val不相等的插入到新的链表当中
public class Solution7 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode result=new ListNode(0);
        ListNode newHead=result;
        ListNode tailNode=result;
        ListNode cur=pHead;
        while(cur!=null){
            if(cur!=null&&cur.next!=null&&cur.val==cur.next.val) {
                while(cur!=null&&cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
            }else{
                tailNode.next=new ListNode(cur.val);
                tailNode=tailNode.next;
            }
            cur=cur.next;
        }
        return newHead.next;
    }
}
