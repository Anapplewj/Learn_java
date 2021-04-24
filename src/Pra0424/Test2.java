package Pra0424;
//错误的题解
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//输入一个偶数
//找到所有小于它的素数
//找到两个素数相加为这个偶数
public class Test2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int num=sc.nextInt();
            if(num%2!=0){
                continue;
            }
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=3;i<num;i++){
                if(isSu(i)){
                    list.add(i);
                }
            }
            Collections.sort(list);
            int[] result={0,0};
            int count=(result[1]-result[0]);
            int i=1;
            int j=2;
            while(j<list.size()){
                while(j<list.size()&&(list.get(i)+list.get(j))!=num){
                    j++;
                }
                if(j>=list.size()){
                    break;
                }
                if(result[0]==0&&(list.get(i)+list.get(j))==num){
                    result[0]=list.get(i);
                    result[1]=list.get(j);
                    i++;
                    j=i+1;
                }else if(list.get(j)-list.get(i)<count&&(list.get(i)+list.get(j))==num){
                    count=list.get(j)-list.get(i);
                    result[0]=list.get(i);
                    result[1]=list.get(j);
                    i++;
                    j=i+1;
                }
            }
            System.out.println(result[0]);
            System.out.println(result[1]);
        }
    }
    private static boolean isSu(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
