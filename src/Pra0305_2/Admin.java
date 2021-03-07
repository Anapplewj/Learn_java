package Pra0305_2;
import Pra0305_2.IOperations.*;
import java.util.Scanner;

public class Admin extends User{
    public Admin(String name) {
        this.name=name;
        this.oprations=new IOperation[]{
                new FindOperation(),
                new AddOperation(),
                new DelOperation(),
                new DisplayOperation(),
                new ExitOperation()
        };

    }
    @Override
    public int menue(){
        System.out.println("=============================");
        System.out.println("欢迎"+name+"来到新一代图书管理系统");
        System.out.println("1.查找操作");
        System.out.println("2.增加操作");
        System.out.println("3.删除操作");
        System.out.println("4.展示所有书籍");
        System.out.println("5.退出");
        System.out.println("=============================");
        System.out.println("请输入您的选择");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        return choice;
    }
}
