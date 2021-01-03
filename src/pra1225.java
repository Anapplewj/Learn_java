import java.util.Arrays;

public class pra1225 {
    public static void main(String[] args) {
        //创建一个 int 类型的数组, 元素个数为 100,
        // 并把每个元素依次设置为 1 - 100
        int[] arr=new int[100];
        toInit(arr);
        String result=Arrays.toString(arr);
        System.out.println(result);
    }

    public static void toInit(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i]=i+1;
        }
    }
}
//    public static void main(String[] args) {
//        //实现一个方法 printArray, 以数组为参数,
//        // 循环访问数组中的每个元素, 打印每个元素的值.
//        int[] arr={9,5,2,7};
//        printArray(arr);
//    }
//
//    public static void printArray(int[] arr) {
//        for(int x:arr){
//            System.out.printf("%d ",x);
//        }
//        System.out.println();
//    }
//}
//    public static void main(String[] args) {
//        //实现一个方法 transform, 以数组为参数,
//        // 循环将数组中的每个元素 乘以 2 , 并设置到对应的数组元素上.
//        // 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
//        int[] arr={1,2,3};
//        System.out.print("Before transform:");
//        String result1= Arrays.toString(arr);
//        System.out.println(result1);
//        transform(arr);
//        String result2= Arrays.toString(arr);
//        System.out.print("After  transform:");
//        System.out.println(result2);
//    }
//
//    public static void transform(int[] arr) {
//        for(int i=0;i<arr.length;i++){
//            arr[i]*=2;
//        }
//    }
//}
//    public static void main(String[] args) {
//        //实现一个方法 sum, 以数组为参数, 求数组所有元素之和.
//        int[] arr={9,5,2,7};
//        int num=sum(arr);
//        System.out.println(num);
//    }
//
//    public static int sum(int[] arr) {
//        int num=0;
//        for(int i=0;i<arr.length;i++){
//            num+=arr[i];
//        }
//        return num;
//    }
//}
//    public static void main(String[] args) {
//        //实现一个方法 avg, 以数组为参数
//        // 求数组中所有元素的平均值(注意方法的返回值类型).
//        int[] arr1={9,5,2,7};
//        double num=avg(arr1);
//        System.out.println(num);
//    }
//
//    public static double avg(int[] arr1) {
//        double num=0.0;
//        for(int i=0;i<arr1.length;i++){
//            num+=arr1[i];
//        }
//        return num/arr1.length;
//    }
//}
