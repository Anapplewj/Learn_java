import java.util.Arrays;
import java.util.Scanner;

public class pra0102 {
    public static void main(String[] args) {
        //实现一个方法 toString
        // 把一个整型数组转换成字符串
        // 例如数组 {1, 2, 3} , 返回的字符串为 "[1, 2, 3]"
        // 注意 逗号 的位置和数量.
        int[] arr1={9,5,2,7,0};
        String arr2=toString(arr1);
        System.out.println(arr2);
    }

    public static String toString(int[] arr1) {
        String arr2=new String();
        for(int i=0;i<arr1.length;i++){
            if(i==arr1.length-1){
                arr2=arr2+arr1[i]+"]";
            }else if(i==0){
                arr2="["+arr1[i]+",";
            }else{
                arr2=arr2+arr1[i]+",";
            }
        }
        return arr2;
    }
}
//    public static void main(String[] args) {
//        //实现一个方法 copyOf, 对一个整型数组进行拷贝, 得到一个新的数组.
//        int[] arr1={1,2,3,4,5};
//        System.out.print("arr1数组：");
//        String result1=Arrays.toString(arr1);
//        System.out.println(result1);
//        int[] arr2= copyOf(arr1);
//        System.out.print("arr2数组：");
//        String result2=Arrays.toString(arr2);
//        System.out.println(result2);
//    }
//
//    public static int[] copyOf(int[] arr1) {
//        int[] arr2=new int[arr1.length];
//        for(int i=0;i<arr1.length;i++){
//            arr2[i]=arr1[i];
//        }
//        return arr2;
//    }
//
//}
//    //给定一个有序整型数组, 实现二分查找
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//        System.out.println("请输入要查找的数字");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        findNum(arr,num);
//    }
//
//    public static void findNum(int[] arr, int tofind) {
//        int left=0;
//        int right=arr.length-1;
//        while(left<=right){
//            int mid=(left+right)/2;
//            if(tofind>arr[mid]){
//                left=mid+1;
//            }else if(tofind<arr[mid]){
//                right=mid-1;
//            }else if(tofind==arr[mid]){
//                System.out.println("找到了！数组下标为"+mid);
//                break;
//            }
//        }
//        if(left>right) {
//            System.out.println("找不到！");
//        }
//    }
//
//}
//    //给定一个整型数组, 判定数组是否有序（递增）
//    public static void main(String[] args) {
//        System.out.println("请输入一组整型数字(空格隔开)");
//        Scanner sc=new Scanner(System.in);
//        String arr1=sc.nextLine();
//        System.out.println(arr1.length());
//        String[] arr2=arr1.split(" ");
//        System.out.println(arr2.length);
//        for(String x:arr2){
//            System.out.print(x);
//        }
//        int[] num=new int[arr2.length];
//        for(int i=0;i< arr2.length;i++){
//            num[i]=Integer.parseInt(arr2[i]);
//        }
//        if(isOrder(num)){
//            System.out.println("该数组是递增数组");
//        }else{
//            System.out.println("该数组是非递增数组");
//        }
//    }
//    public static boolean isOrder(int[] num){
//       for(int i=0;i<num.length-1;i++) {
//           if (num[i] > num[i + 1]){
//               return false;
//           }
//       }
//        return true;
//    }
//}
//    //给定一个整型数组, 实现冒泡排序(升序排序)
//    public static void main(String[] args) {
//        int[] arr={9,5,2,7,0};
//        bubbleSort(arr);
//        String result=Arrays.toString(arr);
//        System.out.println(result);
//    }
//    public static void bubbleSort(int[] arr) {
//        int temp=0;
//        for(int bound=0;bound<arr.length;bound++){
//            for(int cur=arr.length-1;cur>bound;cur--){
//                if(arr[cur]<arr[cur-1]){
//                    temp=arr[cur];
//                    arr[cur]=arr[cur-1];
//                    arr[cur-1]=temp;
//                }
//            }
//        }
//    }
//}
