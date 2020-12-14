import java.util.Random;
import java.util.Scanner;
//0～999之间的所有“水仙花数”并输出
//public class pra1213{
//    public static void main(String[] args){
//        System.out.println("0~999之间的水仙花数为：");
//        for(int i=100;i<=999;i++){
//            int bai=i/100;
//            int temp=i%100;
//            int shi=temp/10;
//            int ge=temp%10;
//            if(i==(flower3(ge)+flower3(shi)+flower3(bai))){
//                System.out.println(i);
//            }
//        }
//    }
//    public static int flower3(int num){
//        return num*num*num;
//    }
//}
public class pra1213 {
    public static void main(String[] args) {
        //打印X图形
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            int n = input.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(j==n-i-1||j==i){
                        System.out.print("*");
                    } else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            break;
        }
    }
}

//public class pra1213{
//    public static void main(String[] args){
//        //根据输入的年龄, 来打印出当前年龄的人是少年(低于18)
//        // 青年(19-28), 中年(29-55), 老年(56以上)
//        System.out.println("请输入要判断的年龄:");
//        Scanner sc=new Scanner(System.in);
//        int age=sc.nextInt();
//        whatKind(age);
//    }
//    public static void whatKind(int age){
//        if(age<0){
//            System.out.println("输入有误，世上无此人");
//            return;
//        }
//        if(age<=18){
//            System.out.println("年龄为 "+age+" 的人是少年");
//        }else if(age>=19&&age<=28){
//            System.out.println("年龄为 "+age+" 的人是青年");
//        }else if(age>=29&&age<=55){
//            System.out.println("年龄为 "+age+" 的人是中年");
//        }else{
//            System.out.println("年龄为 "+age+" 的人是老年");
//        }
//    }
//}
//public class pra1213 {
//    public static void main(String [] args){
//        System.out.println("请输入一个数字：");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        if(prime(num)){
//            System.out.println(num+"是素数");
//        }else{
//            System.out.println(num+"不是素数");
//        }
//        //打印1~100之间的素数
//        for(int num=1;num<=100;num++){
//            if(prime(num)){
//                System.out.println(num);
//            }
//        }
//        //打印1000~2000之间闰年
//        System.out.println("1000~2000年之间的闰年有：");
//        printLeapYear();
//        //1~100之间9的个数
//        int num=nineCount();
//        System.out.println(num);
//        //简单的猜数字游戏
//        //1.生成一个随机数toFind
//        Random random=new Random();
//        int toFind=random.nextInt(100)+1;
//        while(true){
//            //2.玩家输入toGuess
//            System.out.println("请输入一个数字");
//            Scanner sc=new Scanner(System.in);
//            int toGuess=sc.nextInt();
//            //3.判断
//            if(toGuess<toFind){
//                System.out.println("低了");
//            }else if(toGuess>toFind){
//                System.out.println("高了");
//            }else{
//                System.out.println("恭喜你猜对了！");
//                break;
//            }
//
//        }
//    }
//    //判定是否为素数
//    public static boolean prime(int num) {
//        if(num==1||num==0){
//            return false;
//        }
//        for(int i=2;i<num;i++){
//            if(num%i==0){
//                return false;
//            }
//        }
//        return true;
//    }
//    //打印1000~2000之间闰年
//    //判断世纪闰年
//    //判断普通闰年
//    public static void printLeapYear(){
//        for(int year=1000;year<=2000;year++){
//            if(year%100==0){
//                if(year%400==0){
//                    System.out.println(year);
//                }
//            }else if(year%4==0){
//                System.out.println(year);
//            }
//        }
//
//    }
//    1~100之间9的个数
//    public static int nineCount(){
//        int count=0;
//        for(int i=1;i<=100;i++){
//          //个位为9
//            if(i%10==9){
//                count++;
//            }
//          //十位为9
//            if(i/10==9){
//                count++;
//            }
//        }
//        return count;
//    }
//}
