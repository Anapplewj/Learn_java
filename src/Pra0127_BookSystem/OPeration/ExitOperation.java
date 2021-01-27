package Pra0127_BookSystem.OPeration;
import Pra0127_BookSystem.BookList;

public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        //退出程序
        System.out.println("退出图书管理系统！byebye~");
        System.exit(0);
    }
}
