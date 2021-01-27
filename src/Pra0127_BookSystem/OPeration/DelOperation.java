package Pra0127_BookSystem.OPeration;
import Pra0127_BookSystem.BookList;
import java.util.Scanner;

public class DelOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //删除书籍相关操作
        System.out.println("删除书籍！");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您想删除的书的书名");
        String name=sc.next();
        int i=0;
        for(;i<bookList.getSize();i++){
            if(name.equals(bookList.getBooks(i).getName())){
                if(i==bookList.getSize()-1){
                    bookList.setSize(bookList.getSize()-1);
                }else{
                    bookList.setBooks(i,bookList.getBooks(bookList.getSize()-1));
                    bookList.setSize(bookList.getSize()-1);
                }
                System.out.println("删除书籍成功！");
                break;
            }
        }
        if(i>=bookList.getSize()){
            System.out.println("您所删除的书籍不存在");
        }

    }
}
