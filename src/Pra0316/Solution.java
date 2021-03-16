package Pra0316;

import java.util.ArrayList;
import java.util.List;
//和为target的数组
class Solution {
    public int sum(int num1,int num2){
        int sums=0;
        for(int i=num1;i<=num2;i++){
            sums+=i;
        }
        return sums;
    }
    public int[][] findContinuousSequence(int target) {
        if(target<=2){
            return null;
        }
        List<List<Integer>> list=new ArrayList<>();
        int bound=(target+1)/2;
        int small=1;
        int big=2;
        while(big<=bound){
            int nums=sum(small,big);
            if(nums<target){
                big++;
            }else if(nums>target){
                small++;
            }else{
                List<Integer> row=new ArrayList<>();
                for(int i=small;i<=big;i++){
                    row.add(i);
                }
                int haha=row.size();
                list.add(row);
                small++;
            }
        }
        int size=list.get(0).size();
        int[][] arr=new int[list.size()][];
        for(int i=0;i<list.size();i++){
            arr[i]=new int[list.get(i).size()];
            for(int j=0;j<list.get(i).size();j++){
                arr[i][j]=list.get(i).get(j);
            }
        }
        return arr;
    }
}
