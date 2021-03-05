package Pra0305_2;

public class Book {
    private String name;
    private String author;
    private String price;
    private String type;
    private Boolean isBorrowed=false;
    //构造方法
    public Book(String name, String author, String price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }
    //获取书名
    public String getName() {
        return name;
    }
    //获取被借状态
    public Boolean getBorrowed() {
        return isBorrowed;
    }
    //设置被借状态
    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price='" + price + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
