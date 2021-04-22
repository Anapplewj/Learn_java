package Pra0420;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int row=sc.nextInt();
            int col=sc.nextInt();
            int count=0;
            int[][] arr=new int[row][col];
            for(int r=0;r<row;r++){
                for(int c=0;c<col;c++){
                    if(arr[r][c]==0){
                        count++;
                    }
                    if(r+2<row){
                        arr[r+2][c]=1;
                    }
                    if(c+2<col){
                        arr[r][c+2]=1;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
