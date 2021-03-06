package Pra0305_2.Operations;

import Pra0305_2.BookList;

//展示所有书籍信息
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList){
        System.out.println("展示所有书籍信息");
        for(int i=0;i<bookList.getSize();i++){
            System.out.println(bookList.getBooks(i));
        }
    }
}
