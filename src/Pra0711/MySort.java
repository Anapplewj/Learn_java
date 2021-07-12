package Pra0711;

import java.util.Arrays;

public class MySort {
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length-1);
    }

    private static void _quickSort(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int index=partition(arr,left,right);
        _quickSort(arr,left,index-1);
        _quickSort(arr,index+1,right);
    }

    private static int partition(int[] arr,int left,int right){
        int l=left;
        int v=arr[right];
        int r=right;
        while(l<r){
            while(l<r&&arr[l]<=v){
                l++;
            }
            while(l<r&&arr[r]>=v){
                r--;
            }
            swap(arr,l,r);
        }
        swap(arr,l,right);
        return l;
    }
    private static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }

    public static void main(String[] args) {
        int[] arr={9,5,2,7,3,6,8,100,-1};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
