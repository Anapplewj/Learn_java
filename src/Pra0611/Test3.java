package Pra0611;

import java.util.*;

public class Test3 {
    private static int[] arr;
    private static int size=0;

    public static void main(String[] args) {
        int[][] mat=new int[5][5];
        mat[0]=new int[]{1,2,3,4,5};
        mat[1]=new int[]{6,7,8,9,10};
        mat[2]=new int[]{11,12,13,14,15};
        mat[3]=new int[]{16,17,18,19,20};
        mat[4]=new int[]{21,22,23,24,25};
        int[] arr=clockwisePrint(mat,mat.length,mat[0].length);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        arr=new int[n*m];
        size=0;
        func(mat,n-1,m-1,0,0);
        return arr;
    }

    private static void func(int[][] mat,int maxRow,int maxCol,int x,int y){
        if(size==mat[0].length*mat.length){
            return;
        }
        //从左到右
        for(int i=y;i<=maxCol;i++){
            arr[size]=mat[x][i];
            size++;
        }
        //从上到下
        for(int i=x+1;i<=maxRow;i++){
            arr[size]=mat[i][maxCol];
            size++;
        }
        //从右到左
        for(int i=maxCol-1;i>=x;i--){
            arr[size]=mat[maxRow][i];
            size++;
        }
        //从下到上
        for(int i=maxRow-1;i>x;i--){
            arr[size]=mat[i][y];
            size++;
        }
        func(mat,maxRow-1,maxCol-1,x+1,y+1);
    }
}
