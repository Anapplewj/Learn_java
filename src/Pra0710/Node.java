package Pra0710;

public class Node {
    int val;
    Node prev;
    Node next;

    public Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "[" + val +"]";
    }
}
