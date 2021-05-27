package Pra0526;

// write your code here
import java.util.*;
public class Test5 {
    private static boolean isLeapYear(int y) {
        return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
    }
    private static final int[] DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31,
            30, 31};

    // 给定 y,m,d，返回这年过了多少天了
    private static int nDays(int y, int m, int d) {
        // m: 12
        // [0, 10]
        int n = d;
        for (int i = 0; i < m - 1; i++) {
            n += DAYS[i];
        }
        if (m > 2 && isLeapYear(y)) {
            n++;
        }
        return n;
    }
    // 传入 y,m,d，找到从公元前 1 年12月31日开始过了多久了。求出它的 MOD 7 的同余数
    private static int diff(int y, int m, int d) {
        return (y - 1) + (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400 + nDays(y,
                m, d);
    }
    // 根据 y,m,d 求出星期几
    private static int week(int y, int m, int d) {
        int w = diff(y, m, d) % 7;
        if (w == 0) {
            w = 7;
        }
        return w;
    }
    // 根据 1 日星期 w，求第 n 个星期 e 是几号
    private static int m1(int w, int n, int e) {
        return 1 + (n - 1) * 7 + (7 - w + e) % 7;
    }
    // 根据 6月1日星期 w，求5月的最后一个星期一
    private static int m2(int w) {
        int d = (w == 1 ? 7 : w - 1);
        return 32 - d;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNextInt()) {
            int y = s.nextInt();
            System.out.printf("%d-01-01\n", y);
            int w;
            w = week(y, 1, 1);
            System.out.printf("%d-01-%02d\n", y, m1(w, 3, 1));
            w = week(y, 2, 1);
            System.out.printf("%d-02-%02d\n", y, m1(w, 3, 1));
            w = week(y, 6, 1);
            System.out.printf("%d-05-%02d\n", y, m2(w));
            System.out.printf("%d-07-04\n", y);
            w = week(y, 9, 1);
            System.out.printf("%d-09-%02d\n", y, m1(w, 1, 1));
            w = week(y, 11, 1);
            System.out.printf("%d-11-%02d\n", y, m1(w, 4, 4));
            System.out.printf("%d-12-25\n", y);
            System.out.println();
        }
    }
}