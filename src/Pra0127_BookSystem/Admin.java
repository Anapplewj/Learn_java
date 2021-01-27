package Pra0127_BookSystem;
import Pra0127_BookSystem.OPeration.*;
import java.util.Scanner;

public class Admin extends User{

    public Admin(String name) {
        this.name = name;
        this.operations=new IOperation[] {
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };
    }
    @Override
    public int menue() {
        System.out.println("===================");
        System.out.println("欢迎"+name+"进入新一代智能图书管理系统");
        System.out.println("1.查阅书籍信息");
        System.out.println("2.添加新的书籍");
        System.out.println("3.删除书籍");
        System.out.println("4.查看所有书籍列表");
        System.out.println("5.退出系统");
        System.out.println("===================");
        System.out.println("请输入您的选择");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}
