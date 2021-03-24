package Pra0324;

import java.util.Arrays;

public class MySort {
    //插入排序
    //[0,bound)表示已排区间，[bound,length-1]表示待排区间
    //将待排区间的第一个元素v取出来，在已排区间中找到合适的插入位置并插入
    //以升序为例，升序从左到右依次递增
    public static void insertSort(int[] arr){
        for(int bound=1;bound<arr.length;bound++){
            //由于后面涉及到元素的挪动，可能会将bound位置的元素覆盖掉，所以将bound位置的元素取出保存起来
            int v=arr[bound];
            int cur=bound-1;
            for(;cur>=0;cur--){
                if(v<arr[cur]){
                    arr[cur+1]=arr[cur];
                }else{
                    //找到合适的位置了
                    break;
                }
            }
            //此时cur位置的元素小于v，所以将v插入到cur位置元素的后面
            arr[cur+1]=v;
        }
    }
    //希尔排序
    //
    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
