package Pra0509;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//三数字之和等于0

class TreeSums {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        if(nums==null||nums.length<3){
            return list;
        }
        //1.首先对数组进行排序
        Arrays.sort(nums);
        //2.寻找题目要求的三个数字,用nums[i]表示a,nums[l]表示i+1位置的数字
        //nums[r]表示 len-1位置的数字
        ArrayList<Integer> row=null;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i-1]==nums[i]){
                continue;
            }
            int l=i+1;
            int r=nums.length-1;
            while(l<r){
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0){
                    row=new ArrayList<>();
                    row.add(nums[i]);
                    row.add(nums[l]);
                    row.add(nums[r]);
                    list.add(row);
                    // list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(l<r&&nums[l]==nums[l+1]){
                        l++;
                    }
                    while(l<r&&nums[r]==nums[r-1]){
                        r--;
                    }
                    l++;
                    r--;
                }else if(sum<0){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return list;
    }
}