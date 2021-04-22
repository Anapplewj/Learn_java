package Pra0420;

import java.util.Scanner;

public class Test4 {
    private static Long jiecheng(int n){
        Long  result=1l;
        for(int i=1;i<=n;i++){
            result*=i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int n=sc.nextInt();
            if(n<=0){
                System.out.println(0);
                continue;
            }
            if(n>20){
                System.out.println(4);
                continue;
            }
            Long sum=jiecheng(n);
            System.out.println(sum);
            String str=""+sum;
            int count=0;
            for(int i=str.length()-1;i>=1;i--){
                char ch=str.charAt(i);
                if(ch!='0'){
                    break;
                }else{
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
