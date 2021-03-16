package Pra0316;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[][] arr=s.findContinuousSequence(9);
        //打印顺序表
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
