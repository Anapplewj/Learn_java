package Pra0314;
//LeetCode，复杂的链表拷贝
//首先计算
public class Solution9 {
    public static class Node{
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next=null;
            this.random=null;
        }
    }
    public int getSteps(Node head,Node random){
        int step=0;
        for(Node cur=head;cur!=null;cur=cur.next){
            if(cur==random){
                break;
            }else{
               step++;
            }
        }
        return step;
    }
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
        //首先将链表正常的顺序拷贝过来
        Node newHead=new Node(0);
        Node tail=newHead;
        for(Node cur=head;cur!=null;cur=cur.next){
            tail.next=new Node(cur.val);
            tail=tail.next;
        }
        newHead=newHead.next;
        //然后拷贝随便的顺序
        //先得到那个节点距离头节点的步数，
        //那么我们的新链表也就从头结点走几步,
        Node head1=head;
        for(Node newCur=newHead;newCur!=null&&head1!=null;newCur=newCur.next){
            if(head1.random!=null){
                int steps=getSteps(head,head1.random);
                Node result=head;
                for(int i=0;i<=steps;i++){
                    result=result.next;
                }
                newCur.random=result;
            }
            head1=head1.next;
        }
        return newHead;
    }
}
