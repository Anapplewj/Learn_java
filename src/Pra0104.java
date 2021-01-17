import java.util.Arrays;
import java.util.Scanner;

public class Pra0104 {
    public static void main(String[] args) {
        int[] arr={9,5,2,7};
        for(int bound=0;bound<arr.length;bound++){
            for(int cur=arr.length-1;cur>bound;cur--){
                if(arr[cur-1]>arr[cur]){
                    int tem=arr[cur-1];
                    arr[cur-1]=arr[cur];
                    arr[cur]=tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
//    public static void main(String[] args) {
//        int[] arr={9,5,2,7};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    public static void bubbleSort(int[] arr) {
//        for(int bound=0;bound<arr.length;bound++){
//            for(int cur=arr.length-1;cur>bound;cur--){
//                if(arr[cur-1]>arr[cur]){
//                    int tem=arr[cur-1];
//                    arr[cur-1]=arr[cur];
//                    arr[cur]=tem;
//                }
//            }
//        }
//    }
//}
//    public static void main(String[] args) {
//        //使用系统的
//        int[] arr={1,2,3,4};
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr.length-i-1;j++){
//                if(arr[j]<arr[j+1]){
//                    int tem=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=tem;
//                }
//            }
//        }
//        for(int bound=0;bound<arr.length;bound++){
//            //极端情况下cur和bound都是0，那么cur-1就是负的，出现越界
//            for(int cur=arr.length-1;cur>bound;cur--){
//                if(arr[cur-1]>arr[cur]){
//                    int tem=arr[cur-1];
//                    arr[cur-1]=arr[cur];
//                    arr[cur]=tem;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        int[] newArr=Arrays.copyOf(arr,arr.length);
//        System.out.println(Arrays.toString(newArr));
//    }
//    public static void sort(int[] arr){
//        int left=0;
//        int right=arr.length-1;
//        while (left<right){
//            while(left<right&&arr[left]%2==0){
//
//            }
//        }
//    }
//}

//    public static void main(String[] args) {
//        //实现自己的数组拷贝
//        int[] arr={1,2,3,4};
//        int[] newarr=copy(arr);
//        for(int x:newarr){
//            System.out.println(x);
//        }
//
//    }
//
//    public static int[] copy(int[] arr) {
//        int[] ret=new int[arr.length];
//        for(int i=0;i<arr.length;i++){
//            ret[i]=arr[i];
//        }
//        return ret;
//    }
//}
//    public static void main(String[] args) {
//        //检查数组的有序性
//        int[] arr={1,2,3,4};
//        System.out.println(isOrder(arr));
//    }
//
//    public static boolean isOrder(int[] arr) {
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                return false;
//            }
//        }
//        return true;
//    }
//}
//    public static void main(String[] args) {
//        //数组逆序
//        int arr[]={1,2,3,4};
//        reverseArr(arr);
//        for(int x:arr){
//            System.out.println(x);
//        }
//    }
//
//    public static void reverseArr(int[] arr) {
//        int left=0;
//        int right=arr.length-1;
//        while(left<right){
//            int temp=arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//        }
//    }
//}
//    public static void main(String[] args) {
//        //二分查找数组中的某一元素
//        int[] arr={2,4,6,8,10};
//        find(arr);
//    }
//
//    public static void find(int[] arr) {
//        System.out.println("请输入要查找的数字");
//        Scanner sc=new Scanner(System.in);
//        int find=sc.nextInt();
//        int left=0;
//        int right=arr.length-1;
//        while(left<=right){
//            int mid=(left+right)/2;
//            if(find<arr[mid]){
//                right=mid-1;
//            }else if(find>arr[mid]){
//                left=mid+1;
//            }else{
//                System.out.println("找到了！下标是："+mid);
//                break;
//            }
//        }
//        if(left>right){
//            System.out.println("找不到！");
//        }
//    }
//}
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4};
//        String str= Arrays.toString(arr);
//        System.out.println(str);
//    }
//}
//    public static void main(String[] args) {
//        int[] arr1={1,2,3,4};
//        int[] arr2=transform(arr1);
//        for(int x:arr2){
//            System.out.println(x);
//        }
//
//    }
//
//    public static int[] transform(int[] arr1) {
//        int[] arr2=new int[arr1.length];
//        for(int i=0;i< arr1.length;i++){
//         arr2[i]=arr1[i]*2;
//        }
//        return arr2;
//    }
//
//}
//        System.out.println(Boolean.FALSE);
//        System.out.println(Float.MIN_VALUE);
//        char num='中';
//        System.out.println(num);
//        byte a=10;
//        byte b=20;
//        byte c=(byte)(a+b);
//        //整数转字符串
//        int num=10;
//        String str=String.valueOf(num);
//        System.out.println(str);
//        //字符串转整数
//        String str="100";
//        //int num=Integer.parseInt(str);
//        int num=Integer.valueOf(str);
//        System.out.println(num);
//        int num=10;
//        String str=""+num;
//        System.out.println(str);
//        String str="10";
//        int num=Integer.parseInt(str);
//        System.out.println(num);
//
//    }
//}
