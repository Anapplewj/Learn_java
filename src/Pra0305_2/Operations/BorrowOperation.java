package Pra0305_2.Operations;
import Pra0305_2.BookList;

import java.util.Scanner;

//借书操作
public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("借书操作！");
        System.out.println("请输入您想要借阅的书籍名称");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBooks(i).getName().equals(name)){
                if(bookList.getBooks(i).getBorrowed()==true){
                    System.out.println("这本书被借出去了，看看其他的书吧~");
                }else{
                    bookList.getBooks(i).setBorrowed(true);
                    System.out.println("借阅成功！");
                    return;
                }
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("很遗憾，您所借阅的书不存在");
        }
    }
}
