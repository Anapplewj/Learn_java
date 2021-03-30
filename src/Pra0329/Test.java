package Pra0329;

public class Test {
    public static void main(String[] args) {
        MyHashMap map=new MyHashMap();
        map.put(100002,3);
        map.put(2,4);
        map.put(87,5);
        map.put(89,3);
        map.put(12,64);
        map.put(1002,4);
        map.put(3402,68);
        map.put(55,5);
        map.put(8937465,3);
        map.put(8888,98);
        map.put(23574,6);
        map.put(7467,13);
        System.out.println(map.get(8888));
    }
}
