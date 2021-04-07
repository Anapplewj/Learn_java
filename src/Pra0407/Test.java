package Pra0407;

import java.util.ArrayList;

//打印一个矩阵,每次打印一圈
//将打印的结果添加到一个顺序表中
public class Test {
    public static ArrayList<Integer> list=null;
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        list=new ArrayList<>();
        if(matrix.length<=1){
            for(int i=0;i<matrix[0].length;i++){
                list.add(matrix[0][i]);
            }
            return list;
        }
        if(matrix[0].length<=1){
            for(int i=0;i<matrix.length;i++){
                list.add(matrix[i][0]);
            }
            return list;
        }
        int start=0;//表示打印第0圈
        while(matrix.length>start*2 && matrix[0].length>start*2){
            _print(start,matrix);
            start++;
        }
        return list;
    }
    private static void _print(int start,int[][] matrix){
        int max_row=matrix.length-1-start;
        int max_col=matrix[0].length-1-start;
        for(int i=start;i<=max_col;i++){
            list.add(matrix[start][i]);
        }
        if(start<max_row) {
            for (int i = start+1; i <=max_row; i++) {
                list.add(matrix[i][max_col]);
            }
        }
        if(start<max_col && start<max_row) {
            for (int i = max_col-1; i >= start; i--) {
                list.add(matrix[max_row][i]);
            }
        }
        if(start<max_row) {
            for (int i = max_row-1; i > start; i--) {
                list.add(matrix[i][start]);
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(printMatrix(matrix).toString());
    }
}
