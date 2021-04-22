package Pra0420;
import java.util.Scanner;

//求最后一个被删除的数字的下标位置
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n>=1000){
                n=999;
            }
            int[] arr=new int[n];
            int i=0;
            int prev=0;
            while(i<arr.length){
                if(i+3>=arr.length){
                    prev=i;
                    i=0;
                }else if(i==0){
                    prev=i;
                    i+=2;
                }else{
                    prev=i;
                    i+=3;
                }
                if(arr[i]==0){
                    arr[i]=1;
                }else{
                    break;
                }
            }
            System.out.println(prev);
        }
    }
}
