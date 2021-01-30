package Pra0130;

import java.util.Arrays;

//abstract class MyClass{
//    public int a = 5;
//    {
//        a=a+5;
//    }
//    public void method() {
//    }
//}
    public class Test {
        static boolean haha;
        String a;
    public static void main(String[] args) {
        Test test=new Test();
        System.out.println(test.a);
        System.out.println(haha);
//        数组拷贝
//        int[] num={1,2,3,4};
//        int[] num2={2,3,4};
//        num=Arrays.copyOf(num2,3);
//        func(num);
//        System.out.println(Arrays.toString(num));
//        整型数组转字符串
//        int[] num={1,2,6,7,3};
//        Arrays.sort(num);
//        System.out.println(Arrays.toString(num));

//        //字符串转整数
//        String str="1234";
//        int num2=Integer.parseInt(str);
//        System.out.println(num2);

    }

    private static void func(int[] num) {
        int[] num2={2,3,4};
        num=Arrays.copyOfRange(num2,0,1);
        System.out.println(Arrays.toString(num));
    }
}
