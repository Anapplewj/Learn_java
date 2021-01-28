package Pra0128;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //二分法查找数组的某个元素
        int[] arr = {2, 4, 6, 8, 10, 12, 14};
        binery(arr);
    }

    private static void binery(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您像查找的数字");
        int toFind=sc.nextInt();
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(toFind<arr[mid]){
                right=mid-1;
            }else if(toFind>arr[mid]){
                left=mid+1;
            }else{
                System.out.println("找到了！数组下标为"+mid);
                break;
            }
        }
        if(left>right){
            System.out.println("您所查找的数字不存在");
        }
    }
}
//    public static void main(String[] args) {
//        //冒泡排序,升序
//        int[] arr={9,5,2,7,0};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//
//    private static void bubbleSort(int[] arr) {
//        for(int bound=0;bound<arr.length;bound++){
//            for(int cur=arr.length-1;cur>bound;cur--){
//                if(arr[cur-1]>arr[cur]){
//                    int temp=arr[cur-1];
//                    arr[cur-1]=arr[cur];
//                    arr[cur]=temp;
//                }
//            }
//        }
//    }
//}
