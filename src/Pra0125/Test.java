package Pra0125;

import java.util.Scanner;

//实现一个简单的控制台版用户登陆程序, 程序启动提示用户输入用户名密码.
// 如果用户名密码出错, 使用自定义异常的方式来处理
public class Test {
    private static String userName="ttlxbb";
    private static String userPassword="5201314";

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入姓名");
        String name=sc.next();
        System.out.println("请输入密码");
        String password=sc.next();
        try{
        login(name,password);
        }catch(NameException | PasswdException e){
            e.printStackTrace();
        }
    }
    public static void login(String name,String password)throws NameException, PasswdException {
        if(!name.equals(userName)){
            throw new NameException("用户名输入错误");
        }
        if(!password.equals(userPassword)){
            throw new PasswdException("用户密码输入错误");
        }
        System.out.println("登录成功！");
    }
}
