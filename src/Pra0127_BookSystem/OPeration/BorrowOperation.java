package Pra0127_BookSystem.OPeration;
import Pra0127_BookSystem.BookList;
import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("借阅书籍！");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您想借阅的书籍名称");
        String name=sc.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(bookList.getBooks(i).getName().equals(name)){
                if(bookList.getBooks(i).isBorrowed()==false){
                    System.out.println("借阅成功！");
                    bookList.getBooks(i).setBorrowed(true);
                }else{
                    System.out.println("这本书已被借出啦，看看其他书吧~");
                }
                return;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("您所借阅的这本书不存在！");
        }
    }
}
