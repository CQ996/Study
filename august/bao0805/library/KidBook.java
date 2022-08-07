package august.bao0805.library;

/**
 * @ClassName KidBook
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/5 16:03
 * @Version 1.0
 */
public class KidBook extends Book {
    //书本数量
    int numBooks;
    public KidBook(int numBooks){
        this.numBooks=numBooks;
    }

    //罚金
    @Override
    public double calFines(int borrowingDays) {
        //超出的借阅天数
        int delay = borrowingDays - this.getBorrowingPeriod();
        double fines = delay * 1 * this.numBooks;
        ; //罚金
        return fines;
    }
}
