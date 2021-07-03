package Pra0611;
import java.util.*;

public class Test2 {
    private static int count=0;

    public static void main(String[] args) {
        int[] A={2,7,3,1,1};
        System.out.println(findMaxGap(A,A.length));
    }
    public static int findMaxGap(int[] A, int n) {
        // write code here
        func(A,n,1);
        return count;
    }
    private static void func(int[] A,int n,int k){
        if(k>n-2){
            return;
        }
        int left=Integer.MIN_VALUE;
        int right=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            if(i<=k){
                left=Math.max(left,A[i]);
            }else{
                right=Math.max(right,A[i]);
            }
        }
        int result=(left>right)?(left-right):(right-left);
        count=Math.max(count,result);
        func(A,n,k+1);
    }
}