package Pra0305_2.Operations;

import Pra0305_2.BookList;

public class ExitOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("退出图书管理系统，byebye~");
        System.exit(0);//退出程序
    }
}
//System.exit(0)//退出程序