package august.bao0805.library;

/**
 * @ClassName Literature
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/5 16:04
 * @Version 1.0
 */
public class Literature extends Book {
    //书本数量
    int numBooks;
    public Literature(int numBooks){
        this.numBooks=numBooks;
    }
    //罚金
    @Override
    public double calFines(int borrowingDays) {
        //超出的借阅天数
        int delay = borrowingDays - this.getBorrowingPeriod();
        double fines; //罚金
        if (delay <= 3) {
            fines = delay * 5 * this.numBooks;
        } else {
            fines = 3 * 5 + (delay - 3) * 10 * this.numBooks;
        }
        return fines;
    }

}
