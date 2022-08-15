package august.bao0811.list;

/**
 * @ClassName Book
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/13 7:10
 * @Version 1.0
 */
public class Book {
    public Book() {
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "书名：" + name + "\t\t价格：" + price + "\t\t作者：" + author;
    }

    private String name;
    private String author;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
