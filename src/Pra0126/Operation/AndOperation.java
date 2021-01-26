package Pra0126.Operation;

import Pra0126.Book;
import Pra0126.BookList;

import java.util.Scanner;

public class AndOperation implements IOperation{
    @Override
    public void Work(BookList bookList) {
        //添加的相关操作
        System.out.println("添加书籍!");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入书籍的名字");
        String name=sc.next();
        System.out.println("请输入作者的名字");
        String auther=sc.next();
        System.out.println("请输入书的价格");
        double price=sc.nextDouble();
        System.out.println("请输入书的类型");
        String type=sc.next();
        int size=bookList.getSize();
        Book book=new Book(name,auther,price,type);
        bookList.setBook(size,book);
        bookList.setSize(size++);
    }
}
