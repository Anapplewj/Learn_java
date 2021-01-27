package Pra0127_BookSystem.OPeration;
import Pra0127_BookSystem.BookList;
import java.util.Scanner;

public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
//        查找书籍相关操作
        System.out.println("查找书籍！");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您想查找书籍的名称");
        String name=sc.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBooks(i).getName().contains(name)){
                System.out.println(bookList.getBooks(i));
                System.out.println("查找成功！");
                return;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("您所查找的书籍不存在");
        }
    }
}
