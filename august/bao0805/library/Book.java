package august.bao0805.library;

/**
 * @ClassName Book
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/5 15:57
 * @Version 1.0
 */
public abstract class Book {
    public Book(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBorrowingPeriod() {
        return borrowingPeriod;
    }

    public void setBorrowingPeriod(int borrowingPeriod) {
        this.borrowingPeriod = borrowingPeriod;
    }

    public Book(String name,int borrowingPeriod){
        this.name=name;
        this.borrowingPeriod=borrowingPeriod;
    }
    //书名
    private String name;
    //借阅期限
    private int borrowingPeriod;

    //罚金
    public abstract double calFines(int borrowingDays);


}
