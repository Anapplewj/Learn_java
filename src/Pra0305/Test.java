package Pra0305;

import java.util.Scanner;

//实现一个简单的用户台控制系统，登录密码输入错误，抛出自定义的异常
public class Test {
    private static String userName="ttlxbb";
    private static String passWord="5201314";
    //主类
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的姓名");
        String name=sc.next();
        System.out.println("请输入您的密码");
        String passWd=sc.next();
        try{
            login(name,passWd);
        }catch (NameException|PassWordException e){
            e.printStackTrace();
        }
    }
    //登录方法
    public static void login(String name,String passWd)throws NameException,PassWordException{
        if(!name.equals(userName)){
            throw new NameException("用户名输入错误");
        }
        if (!passWd.equals(passWord)) {
            throw new PassWordException("密码输入错误");
        }
        System.out.println("登录成功！");
    }
}
//总结：这个代码回顾了一下异常的使用，自己创建了两个异常NameException
//和PassWordException，通过输入用户名和密码，判断用户名和密码如果
//其中某个出现错误则抛出异常
//throw表示抛出某个异常
//throws表示这个方法可能会抛出哪些异常，异常之间使用逗号隔开
//将抛出的异常交给上级去处理
//printStackTrace()方法可以获取到异常的具体信息