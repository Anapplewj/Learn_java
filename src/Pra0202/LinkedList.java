package Pra0202;

public class LinkedList {
    public static Node creatList(){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=null;
        return a;
    }
    public static void main(String[] args) {
        Node head=creatList();
//        通过遍历，打印链表的每个元素
//        for(Node cur=head;cur!=null;cur=cur.next){
//            System.out.print(cur);
//        }
//        //找到链表的最后一个结点
//        Node cur=head;
//        while(cur!=null&&cur.next!=null){
//            cur=cur.next;
//        }
//        System.out.println(cur);
        //找到链表的倒数第二个结点
//        Node cur=head;
//        while(cur!=null&&cur.next!=null&&cur.next.next!=null){
//            cur=cur.next;
//        }
//        System.out.println(cur);
//        //找到链表的第 n 个结点
//        Node cur=head;
//        int n=3;
//        for(int i=1;i<n;i++){
//            cur=cur.next;
//        }
//        System.out.println(cur);
//        //计算链表中元素的个数
//        int count=0;
//        for(Node cur=head;cur!=null;cur=cur.next){
//            count++;
//        }
//        System.out.println(count);
        //找到链表中是否包含某个元素
        int num=6;
        Node cur=head;
        for(;cur!=null;cur=cur.next){
            if(cur.val==num){
                break;
            }
        }
        if(cur!=null){
            System.out.println("找到了");
        }else{
            System.out.println("找不到");
        }
    }


}
