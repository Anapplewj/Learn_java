package Pra0127_BookSystem;

public class BookList {
    //书的列表，首先存放书
    private int size;
    private int capacity=100;
    Book[] books=new Book[capacity];


    public BookList() {
        books[0]=new Book("西游记","吴承恩",50,"古典文学");
        books[1]=new Book("三国演义","罗贯中",60,"古典文学");
        books[2]=new Book("从你的全世界路过","张嘉佳",45,"青春文学");
        size=3;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Book getBooks(int index) {
        return books[index];
    }

    public void setBooks(int index,Book book) {
        this.books[index] = book;
    }
}


