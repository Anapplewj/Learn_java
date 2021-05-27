package Pra0526;// write your code here
import java.util.Scanner;

//月份为素数,每天能挣1元,月份不为素数,每天能赚2元,给定一个区间,计算总共的收益
public class Test3{
    //判断是否为素数月
    private static boolean isSu(int m){
        return m==2||m==3||m==5||m==7||m==11;
    }
    //计算一整年的收益
    private static int profitOfYear(int year){
        return 31*2+28+31+30*2+31+30*2+31+31*2+30*2+31*2+30+31*2+isLeepYear(year);
    }
    //是否为闰年,闰年返回1,不是闰年,返回0
    private static int isLeepYear(int year){
        if(year%4==0&&year%100!=0){
            return 1;
        }else if(year%400==0){
            return 1;
        }
        return 0;
    }
    //计算从这一年的第一天,到现在这一天之前的收益.
    private static int profitOfDay(int year,int month,int day){
        int profit = 0;
        if (!isSu(month)) {
            profit = day * 2;
        } else {
            profit = day;
        }
        while (--month > 0) {
            switch (month){
                case 1: case 8: case 10: case 12:
                    profit += 62;
                    break;
                case 3: case 5: case 7:
                    profit += 31;
                    break;
                case 4: case 6: case 9:
                    profit += 60;
                    break;
                case 11:
                    profit += 30;
                    break;
                default: // case 2
                    profit += (28 + isLeepYear(year));
                    break;
            }
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
            int y1=sc.nextInt();
            int m1=sc.nextInt();
            int d1=sc.nextInt();
            int y2=sc.nextInt();
            int m2=sc.nextInt();
            int d2=sc.nextInt();
            int profit=0;
            if(y1==y2){
                profit+=profitOfDay(y2,m2,d2)-profitOfDay(y1,m1,d1)+(isSu(m2)?1:2);
                System.out.println(profit);
                continue;
            }
            for(int i=y1;i<=y2;i++){
                if(i==y1){
                    //先计算从第一年的剩余的收益
                    profit+=(profitOfYear(i)-profitOfDay(i,m1,d1));
                }else if(i==y2){
                    //再计算最后一年的收益
                    profit+=profitOfDay(i,m2,d2)+(isSu(m2)?1:2);
                }else{
                    //在计算中间的所有收益
                    profit+=profitOfYear(i);
                }
            }
            System.out.println(profit);
        }
    }
}
