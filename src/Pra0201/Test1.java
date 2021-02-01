package Pra0201;
public class Test1 {
    public static void main(String[] args) {
        //测试一下增加的代码
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add("apple");
        myArrayList.add("banana");
        myArrayList.add("lemon");
        myArrayList.add("orange");
        System.out.println(myArrayList);
        myArrayList.add(2,"pineapple");
        System.out.println(myArrayList);
        //测试删除的代码
        boolean re=myArrayList.remove("apple");
        System.out.println(re);
        System.out.println(myArrayList);
        myArrayList.remove(1);
        System.out.println(myArrayList);
        //测试取出和设置指定下标的元素
        System.out.println(myArrayList.get(2));
//        System.out.println(myArrayList.set(-1,"apple"));
        myArrayList.set(0,"apple");
        System.out.println(myArrayList);
        //测试contains
        System.out.println(myArrayList.contains("apple"));
        System.out.println(myArrayList.contains("java"));
        //测试indexOf和lastInexOf
        myArrayList.add(1,"apple");
        System.out.println(myArrayList);
        System.out.println(myArrayList.indexOf("apple"));
        System.out.println(myArrayList.lastIndexOf("apple"));
        //测试清空，当前元素的个数，判断是否为空
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.size());
        myArrayList.clear();
        System.out.println(myArrayList.isEmpty());
    }
}
