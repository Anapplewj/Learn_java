package Pra0127_BookSystem.OPeration;
import Pra0127_BookSystem.BookList;

public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        //展示所有书籍信息
        System.out.println("查看所有书籍信息");
        for(int i=0;i<bookList.getSize();i++){
            System.out.println(bookList.getBooks(i));
        }
    }
}
