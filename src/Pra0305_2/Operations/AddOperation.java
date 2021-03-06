package Pra0305_2.Operations;

import Pra0305_2.Book;
import Pra0305_2.BookList;

import java.util.Scanner;

//添加操作
public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("添加书籍！");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入书名");
        String bookName=sc.next();
        System.out.println("请输入作者名");
        String auName=sc.next();
        System.out.println("请输入价格");
        String price=sc.next();
        System.out.println("请输入书的类型");
        String type=sc.next();
        Book book=new Book(bookName,auName,price,type);
        bookList.setBooks(bookList.getSize(),book);
        bookList.setSize(bookList.getSize()+1);
        System.out.println("添加书籍成功！");
    }
}
