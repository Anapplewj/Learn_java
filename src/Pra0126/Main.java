package Pra0126;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.先准备好书籍的数据
        BookList bookList=new BookList();
        //2.用户登录
        User user=login();
        //3.进入主循环
        while(true){
            int choice=user.menue();
            user.doOperation(choice,bookList);
        }
    }

    public static User login(){
        System.out.println("请输入您的姓名：");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("请输入您的角色：1.管理员  2.用户");
        int who=sc.nextInt();
        if(who==1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
