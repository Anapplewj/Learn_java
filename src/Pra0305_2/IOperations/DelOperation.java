package Pra0305_2.IOperations;

import Pra0305_2.BookList;

import java.util.Scanner;
//删除书籍操作
public class DelOperation implements IOperation{
    public void work(BookList bookList){
        System.out.println("删除书籍！");
        System.out.println("请输入您想要删除的书籍名字");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBooks(i).getName().equals(name)){
                if(i==bookList.getSize()-1){
                    bookList.setSize(bookList.getSize()-1);
                }else{
                    bookList.setBooks(i,bookList.getBooks(bookList.getSize()-1));
                    bookList.setSize(bookList.getSize()-1);
                }
                System.out.println("删除书籍成功！");
                return;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("您想删除的书籍不存在！");
        }
    }
}
