package Pra0127_BookSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //首先创建一个书籍列表
        BookList bookList=new BookList();
        //用户登录
        User user=login();
        //循环操作
        while(true){
            int choice=user.menue();
            user.doOperation(choice,bookList);
        }
    }

    public static User login(){
        System.out.println("请输入您的姓名");
        Scanner sc= new Scanner(System.in);
        String name=sc.next();
        System.out.println("请选择您的身份：1.管理员 2.普通用户");
        int choice=sc.nextInt();
        if(choice==1){
            return new Admin(name);  //向上转型
        }
        return new NormalUser(name);
    }
}
