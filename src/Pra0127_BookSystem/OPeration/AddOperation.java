package Pra0127_BookSystem.OPeration;
import Pra0127_BookSystem.Book;
import Pra0127_BookSystem.BookList;
import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("添加书籍！");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入新增书籍的名称");
        String name=sc.next();
        System.out.println("请输入新增书籍的作者");
        String author=sc.next();
        System.out.println("请输入新增书籍的价格");
        double price=sc.nextDouble();
        System.out.println("请输入新增书籍的类型");
        String type=sc.next();
        Book book=new Book(name,author,price,type);
        bookList.setSize(bookList.getSize()+1);
        bookList.setBooks(bookList.getSize()-1,book);
        System.out.println("添加书籍成功！");
    }
}
