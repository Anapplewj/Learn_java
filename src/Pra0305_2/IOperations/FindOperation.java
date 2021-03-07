package Pra0305_2.IOperations;

import Pra0305_2.BookList;

import java.util.Scanner;

//查找某个书籍
public class FindOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("查找书籍！");
        System.out.println("请输入书籍的名称");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBooks(i).getName().contains(name)){
                System.out.println(bookList.getBooks(i));
                return;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("您所查找的书籍不存在！");
        }
    }
}
