package Pra0201;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
//        int[] num1={1,2,3,5,7};
//        System.out.println(isThree(num1));
//        int[] num2={};
//        System.out.println(isThree(num2));
        List<List<Integer>> mytest=generate(5);
        System.out.println(mytest);
    }
    //判断一个数组是否存在连续的三个奇数
    public static boolean isThree(int[] nums){
        for(int i=0;i<nums.length-2;i++) {
            if (nums[i] % 2 != 0 && (nums[i + 1] % 2 != 0 )&& (nums[i + 2] % 2 != 0)) {
                return true;
            }
        }
        return false;
    }
    //打印杨辉三角
    //第一行第二行都是1
    //往后的第N行的第一个和最后一个都是1
    public static List<List<Integer>> generate(int numRows) {
        if(numRows<=0){
            return new ArrayList<>();
        }
        //第一行
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> row1=new ArrayList<>();
        row1.add(1);
        result.add(row1);
        if(numRows==1){
            return result;
        }
        //第二行
        List<Integer> row2=new ArrayList<>();
        row2.add(1);
        row2.add(1);
        result.add(row2);
        if(numRows==2){
            return result;
        }
        //第三行~其他行
        for(int row=2;row<numRows;row++){
            //第一列元素是1
            List<Integer> line=new ArrayList<>();
            line.add(1);
            //每一列逐个赋值
            for(int col=1;col<row;col++){
                int num=result.get(row-1).get(col)+result.get(row-1).get(col-1);
                line.add(num);
            }
            //最后一列是1
            line.add(1);
            result.add(line);
        }
        return result;
    }
}
