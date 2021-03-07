package Pra0307;

public class Test {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.addLast(3);
        myLinkedList.add(0,0);
//        System.out.println(myLinkedList.get(9));
//        System.out.println(myLinkedList.indexOf(9));
//        myLinkedList.removeByValue(4);
//        myLinkedList.removeByIndex(0);
        myLinkedList.set(0,100);
        myLinkedList.set(1,101);
        myLinkedList.set(100,100);
        myLinkedList.set(3,200);
        myLinkedList.printLinkedList();
    }
}
