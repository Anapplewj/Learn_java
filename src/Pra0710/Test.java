package Pra0710;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        System.out.println(list.getLength());
        for(int i=0;i<list.getLength();i++){
            System.out.println(list.getNode(i));
        }
    }
}
