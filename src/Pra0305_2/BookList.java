package Pra0305_2;
//书籍列表
public class BookList {
    private int size;
    private int capacity=100;
    Book[] books=new Book[capacity];
    //初始化BookList
    public BookList(){
        books[0]=new Book("西游记","吴承恩","60","古典文学");
//        books[1]=new Book("三国演义","罗贯中")
    }
}
