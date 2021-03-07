package Pra0305_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList=new BookList();
        User user=login();
        while(true){
            int choice=user.menue();
            user.doOperations(choice,bookList);
        }
    }
    public static User login(){
        System.out.println("请输入您的姓名");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("请输入您的身份");
        System.out.println("1.管理员  2.普通用户");
        int choice=sc.nextInt();
        if(choice==1){
            return new Admin(name);
        }
        return new NormalUser(name);
    }
}
//总结：这个图书管理系统非常的有趣，首先创建了Book这个类，还有BookList这个类
//将所有的操作抽象出一个共同的接口，IOperation
//然后，普通用户和管理员又有共同的特点，将其放在一个抽象类中
//这个类中包含了名称，抽象方法，还有一个doOperations
//在登录这个方法中，又涉及到了多态,首先输入自己的身份
//然后返回，涉及到了向上转型
//然后通过具体是哪个对象，在运行的过程中决定调用哪个对象的方法