package Pra0412;

import java.util.Arrays;

public class MySort {
    //插入排序
    //[0,bound)是已排区间,[bound,arr.length)是待排区间
    //将待排区间的第一个元素拿出来,在已排区间中找到一个合适的位置插入即可
    //全部都以升序为例
    public static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(arr[cur]>v){
                    arr[cur+1]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+1]=v;
        }
    }

    //希尔排序,设置一个分组系数,分组系数越来越小
    public static void shellSort(int[] arr){
        int gap=arr.length/2;
        while(gap>0){
            _shellSort(arr,gap);
            gap/=2;
        }
    }
    private static void _shellSort(int[] arr,int gap){
        for(int bound=gap;bound<arr.length;bound++){
            int v=arr[bound];
            int cur=bound-gap;
            for(;cur>=0;cur-=gap){
                if(arr[cur]>v){
                    arr[cur+gap]=arr[cur];
                }else{
                    break;
                }
            }
            arr[cur+gap]=v;
        }
    }
    //
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,10,100,-3};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //总结: 插入排序的时间复杂度为:最好O(n),最坏和平均: O(n) 空间复杂度为:O(1)
    //希尔排序的时间复杂度为: 平均:O(n^1.3),最好:O(n),最坏:O(n^2),空间复杂度: O(1)
}
