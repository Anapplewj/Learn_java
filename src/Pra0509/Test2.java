package Pra0509;

import java.util.*;

public class Test2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n<3){
                System.out.println(-1);
                continue;
            }
            int[][] arr=new int[n][2*n-1];
            boolean isFind=false;
            for(int i=0;i<n;i++){
                arr[i][0]=1;
                for(int j=1;j<=2*i;j++){
                    if(j==1){
                        arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
                    }else{
                        arr[i][j]=arr[i-1][j-2]+arr[i-1][j-1]+arr[i-1][j];
                    }
                }
            }
            int result=-1;
            for(int i=0;i<2*n-1;i++){
                if(arr[n-1][i]%2==0){
                    result=i+1;
                    break;
                }
            }
            System.out.println(result);
        }
    }
}
