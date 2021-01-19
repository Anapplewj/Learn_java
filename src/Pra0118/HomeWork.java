package Pra0118;
import java.util.Arrays;
public class HomeWork {
    public static void main(String[] args) {
        //给定整型数组, 把所有的偶数放到数组前面, 把所有奇数放到数组后面.
        int[] arr={9,0,5,2,7,6};
        System.out.println("Before Change:"+Arrays.toString(arr));
        swap(arr);
        System.out.println("After  Change:"+Arrays.toString(arr));

    }

    public static void swap(int[] arr) {
        for(int odd=0;odd<arr.length;odd++){
            if(arr[odd]%2!=0){
                for(int even=odd+1;even<arr.length;even++){
                    if(arr[even]%2==0){
                        int tem=arr[odd];
                        arr[odd]=arr[even];
                        arr[even]=tem;
                        break;
                    }
                }
            }

        }
    }
}
//        //给定两个整型数组, 交换两个数组的内容.
//        int[] arr1={1,2,3,4};
//        int[] arr2={11,22,33,44};
//        System.out.println("Before Swap:");
//        System.out.println("arr1:"+Arrays.toString(arr1));
//        System.out.println("arr2:"+Arrays.toString(arr2));
//        System.out.println("After Swap:");
//        swap(arr1,arr2);
//        System.out.println("arr1:"+Arrays.toString(arr1));
//        System.out.println("arr2:"+Arrays.toString(arr2));
//    }
//    public static void swap(int[] arr1, int[] arr2) {
//        int tem=0;
//        for(int i=0;i<arr1.length;i++){
//            tem=arr1[i];
//            arr1[i]=arr2[i];
//            arr2[i]=tem;
//        }
//    }
//}
//public class HomeWork{
//    static int cnt=6;
//    static{
//        cnt +=9;
//    }
//    public int a;
//    public int b;
//    private int count;
//    public HomeWork(int a){
//        this.a=10;
//    }
//    public HomeWork(int a,int b){
//        this(a);
//    }
//    public static void main(String[] args) {
//        System.out.println(cnt);
//        HomeWork ho=new HomeWork(88);
//        System.out.println(ho.count);
//    }
//    HomeWork(int a){
//        count=a;
//    }
//    static{
//        cnt/=3;
//    }
//}
//public class HomeWork {// 1
//    private static int x = 100;// 2
//    public static void main(String args[]) {// 3
//        HomeWork hsl = new HomeWork();// 4
//        hsl.x++;// 5
//        HomeWork hs2 = new HomeWork();// 6
//        hs2.x++;// 7
//        hsl = new HomeWork();// 8
//        hsl.x++;// 9
//        HomeWork.x--;// 10
//        System.out.println(" x=" + x);// 11
//    }
//}

//public class HomeWork{
//
//    private String name = "Person";
//
//    int age=0;
//
//}
//
//public class Child extends HomeWork{
//
//    public String grade;
//
//    public static void main(String[] args){
//
//        HomeWork p = new Child();
//
//        System.out.println(p.name);
//
//    }
//
//}
//public class HomeWork {
//    public int aMethod(){
//        static int i = 0;
//        i++;
//        return i;
//    }
//    public static void main(String args[]){
//        HomeWork test = new HomeWork();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//}
//    class Test {
//        public static void hello() {
//            System.out.println("hello");
//        }
//    }
//
//    public class HomeWork {
//        static boolean a;
//        private float f=1.0f;
//        public static void main(String[] args) {
//            System.out.println(a);
//            HomeWork ho=new HomeWork();
//
//            System.out.println(ho.f);
////            // TODO Auto-generated method stub
////            Test test=null;
////            test.hello();//这里也就等价于Test.hello()，一般不建议这么写
////            Test2 b=new Test2();
////            System.out.println(b.s);
//
//        }
//    }
//
