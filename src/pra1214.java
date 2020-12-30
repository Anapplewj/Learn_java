import java.util.Scanner;

public abstract class pra1214 {
    //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
    public static void main(String[] args) {
        double sum = 0.0;
        for (int i = 1; i < 100; i += 2) {
            sum += (1.0 / i - 1.0 / (i + 1));
        }
        System.out.println("1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值为： " + sum);
    }
}
//    //求两个正整数的最大公约数
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入两个正整数：");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        System.out.println(num1+"和"+num2+ "的最大公约数为：" + yueShu(num1, num2));
//    }
//
//    public static int yueShu(int num1, int num2) {
//        int result = 0;
//        for (int i = (num1 < num2 ? num1 : num2); i > 0; i--) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                return i;
//            }
//        }
//        return 0;
//    }
//}
//    //求一个整数，在内存当中存储时，二进制1的个数
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个整数:");
//        int num=sc.nextInt();
//        int count=0;
//        for(int i=0;i<32;i++){
//            if((1&(num>>i))==1){
//                count++;
//            }
//        }
//        System.out.println("num在内存中存储时二进制1的个数为："+count);
//    }
//}
//    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入一个整数:");
//        int num=sc.nextInt();
//        System.out.println(num+"的二进制序列中所有的偶数位为： ");
//        odd(num);
//        System.out.println();
//        System.out.println(num+"的二进制序列中所有的奇数位为： ");
//        even(num);
//        System.out.println();
//    }
//    public static void odd(int num) {
//        for(int i=30;i>=0;i-=2){
//            if((num&(1<<i))==(1<<i)) {
//                System.out.print(1);
//            }else{
//                System.out.print(0);
//            }
//        }
//    }
//    public static void even(int num){
//       for(int i=31;i>=1;i-=2){
//           if((num&(1<<i))==(1<<i)) {
//               System.out.print(1);
//           }else{
//               System.out.print(0);
//           }
//       }
//    }
//}
//    //模拟登录三次
//    public static void main(String[] args) {
//        String password="zs123";
//        login(password);
//    }
//    public static void login(String password) {
//        System.out.println("请输入您的密码：");
//        for(int i=0;i<3;i++){
//            Scanner sc=new Scanner(System.in);
//            String pd=sc.nextLine();
//            if(password.equals(pd)){
//                System.out.println("登录成功!");
//                return;
//            }else{
//                System.out.println("密码错误，请重新输入");
//            }
//        }
//        System.out.println("输入次数已达上限，登录失败！");
//    }
//}
//    public static void main(String[] args) {
//        System.out.println("请输入您想得到乘法口诀表的行数/列数");
//        Scanner sc=new Scanner(System.in);
//        int num=sc.nextInt();
//        multiple(num);
//    }
//    public static void multiple(int num){
//        for(int row=1;row<=num;row++){
//            for(int col=1;col<=row;col++){
//                System.out.printf("%dx%d=%d\t",col,row,col*row);
//            }
//            System.out.println();
//        }
//    }
//}
//    //输出一个整数的每一位，如：123的每一位是1 ， 2 ， 3
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数:");
//        int num = sc.nextInt();
//        System.out.println(num + "的每一位是");
//        everyPosition(num);
//    }
//
//    //首先看有多少位
//    public static void everyPosition(int num) {
//        int num1 = num;
//        int count = 0;
//        while (num1 != 0) {
//            num1 = num1 / 10;
//            count++;
//        }
//        for (int i = count - 1; i >= 0; i--) {
//            if (i != 0) {
//                System.out.print(num / (ciFang(i)) + ",");
//                num = num % (ciFang(i));
//
//            } else {
//                System.out.println(num / (ciFang(i)));
//            }
//        }
//    }
//    //10的i次方
//    public static int ciFang(int i) {
//        if (i == 0) {
//            return 1;
//        }
//        int num = 1;
//        for (int j = 1; j <= i; j++) {
//            num *= 10;
//        }
//        return num;
//    }
//}
