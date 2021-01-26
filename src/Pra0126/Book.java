package Pra0126;

public class Book {
    private String name;
    private String auther;
    private double price;
    private String type;
    private boolean isBorrowed=false;

    public Book(String name, String auther, double price, String type) {
        this.name = name;
        this.auther = auther;
        this.price = price;
        this.type = type;
    }
}
