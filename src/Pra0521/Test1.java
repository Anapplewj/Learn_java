package Pra0521;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
//不对..
public class Test1 {
    public static void main(String[] args) {
        int[] arr={4,1,3,2};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            getSum(arr,i,0);
        }
        //将Set转换为一个数组
        int[] arr1=new int[set.size()];
        int i1=0;
        for(Integer x:set){
            arr1[i1]=x;
            i1++;
        }
        //进行判断
        for(int i=arr1[0];i<=arr1[arr1.length-1];i++){

        }
        System.out.println(set);
    }

    //计算一个集合的子集的和
    public static Set<Integer> set=new HashSet<>();
    private static void getSum(int[] arr,int index,int nums){
        if(index>=arr.length){
            return;
        }
        set.add(arr[index]);
        nums+=arr[index];
        if(nums!=arr[index]){
            set.add(nums);
        }
        getSum(arr,index+1,nums);
    }
}
