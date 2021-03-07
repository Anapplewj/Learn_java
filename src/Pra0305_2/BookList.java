package Pra0305_2;
//书籍列表
public class BookList {
    private int size;
    private int capacity=100;
    Book[] books=new Book[capacity];
    //初始化BookList
    public BookList(){
        books[0]=new Book("西游记","吴承恩","60","古典文学");
        books[1]=new Book("三国演义","罗贯中","60","古典文学");
        books[2]=new Book("海贼王","尾田","80","漫画");
        books[3]=new Book("水浒传","施耐庵","60","古典文学");
        size=4;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public Book getBooks(int index){
        return books[index];
    }
    public void setBooks(int index,Book book){
        this.books[index]=book;
    }
}
