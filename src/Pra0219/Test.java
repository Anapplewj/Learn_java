package Pra0219;
//删除链表中指定值的所有节点
//class ListNode {
//      int val;
//      ListNode next;
//      ListNode(int val) { this.val = val; }
//}
//
//public class Test {
//    //创建一个链表
//    public static ListNode init(){
//        ListNode node1=new ListNode(1);
//        ListNode node2=new ListNode(1);
//        ListNode node3=new ListNode(2);
//        ListNode node4=new ListNode(1);
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        node4.next=null;
//        return node1;
//    }
//    //打印链表
//    private static void printNodeList(ListNode head) {
//        for(ListNode cur=head;cur!=null;cur=cur.next){
//            System.out.print(cur.val+"  ");
//        }
//        System.out.println();
//    }
//    //删除元素
//    public static ListNode removeElements(ListNode head, int val) {
//        if(head==null){
//            return null;
//        }
//        ListNode prev=head;//待删节点的前一个节点
//        ListNode cur=prev.next;//待删节点
//        for(;cur!=null;){
//            if(cur.val==val){
//                prev.next=cur.next;
//                cur=cur.next;
//            }else{
//                prev=cur;
//                cur=cur.next;
//            }
//        }
//        if(head.val==val){
//            head=head.next;
//        }
//        return head;
//    }
//    public static void main(String[] args) {
//        ListNode head=init();
//        //删除前
//        printNodeList(head);
//        //删除后
//        head=removeElements(head,1);
//        printNodeList(head);
//    }
//}
