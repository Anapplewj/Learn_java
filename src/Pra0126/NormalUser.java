package Pra0126;

import Pra0126.Operation.*;

import java.util.Scanner;

public class NormalUser extends User{
    public NormalUser(String name){
        this.name=name;
        IOperation operations[]=new IOperation[]{
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation(),
                new ExitOperation()
        };
    }
    @Override
    public int menue() {
        System.out.println("欢迎"+name+"进入图书管理系统");
        System.out.println("=======================");
        System.out.println("1.查找书籍");
        System.out.println("2.借阅书籍");
        System.out.println("3.归还书籍");
        System.out.println("4.退出系统");
        System.out.println("=======================");
        System.out.println("请输入您的选择：");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}
