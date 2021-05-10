package Pra0507;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//输出第n行,第一个偶数的位置
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n<=2){
                System.out.println(-1);
                continue;
            }
            int[][] arr=new int[n][2*n+1];
            arr[0][n-1]=1;
            arr[1][n-2]=1;
            arr[1][n-1]=1;
            for(int i=2;i<n;i++){
                for(int j=0;j<2*n+1;j++){
                    if(j==0){
                        arr[i][j]=arr[i-1][j]+arr[i-1][j+1];
                    }else if(j==n-1){
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    }else{
                        arr[i][j]=arr[i-1][j]+arr[i-1][j-1]+arr[i-1][j];
                    }
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }
}
