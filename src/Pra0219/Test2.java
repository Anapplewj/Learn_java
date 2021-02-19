package Pra0219;
//链表的逆置

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
 }
public class Test2 {
     //创建一个链表
    public static ListNode init(){
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=null;
        return node1;
    }
     //打印链表
    private static void printNodeList(ListNode head) {
        for(ListNode cur=head;cur!=null;cur=cur.next){
            System.out.print(cur.val+"  ");
        }
        System.out.println();
    }
    public static ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode curNode=head;
        ListNode prevNode=null;
        ListNode newHead=null;
        while(curNode!=null){
            ListNode nextNode=curNode.next;
            //一直到最后一个节点就结束，新的头节点为最后一个节点
            if(nextNode==null){
                newHead=curNode;
            }
            curNode.next=prevNode;
            prevNode=curNode;
            curNode=nextNode;

        }
        return newHead;
    }

    public static void main(String[] args) {
        ListNode head=init();
        //逆置前
        System.out.println("逆置前：");
        printNodeList(head);
        System.out.println("逆置后：");
        head=reverseList(head);
        printNodeList(head);
    }
}
