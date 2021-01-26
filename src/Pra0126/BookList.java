package Pra0126;

public class BookList {
    private Book[] books=new Book[100];
    private int size=0;

    public BookList() {
        books[0]= new Book("西游记","吴承恩",80,"经典文学");
        books[1]=new Book("三国演义","罗贯中",80,"经典文学");
        books[2]=new Book("从你的全世界路过","张嘉译",56,"青春文学");
        size=3;
    }

    public Book getBook(int index) {
        return books[index];
    }

    public void setBook(int index,Book book) {
        books[index]=book;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
