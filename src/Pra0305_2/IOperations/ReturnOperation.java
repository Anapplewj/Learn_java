package Pra0305_2.IOperations;

import Pra0305_2.BookList;

import java.util.Scanner;

//归还书籍
public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("归还书籍！");
        System.out.println("请输入您想归还的书籍的名称");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBooks(i).getName().equals(name)){
                bookList.getBooks(i).setBorrowed(false);
                System.out.println("归还成功！");
                return;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("归还失败！检查一下是否输入有误~~");
        }
    }
}
