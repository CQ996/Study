package august.bao0805.library;

import august.ba0802.farm.AppleTree;
import august.ba0802.farm.Corn;

/**
 * @ClassName Test
 * @Description 多态——向下转型,多态——数组 两种方法计算图书馆罚金
 * @Author CQ
 * @Date 2022/8/5 16:14
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        double money = 0;
        Book[] book=new Book[3];
        book[0] = new AdultBook("《博弈论》、《法布尔昆虫记》",21,2);
        book[1] = new KidBook("《半小时漫画中国史》、《最好的朋友》",21,2);
        book[2] = new Literature("《世界文化遗产》",14,1);
        for (int i = 0; i < book.length; i++) {
            money+=book[i].calFines(30);
        }
        System.out.println("一共需交纳罚金："+money+"元");
 /*
        Book book=null;
        String[] title={"《半小时漫画中国史》","《博弈论》","《法布尔昆虫记》","《最好的朋友》","《世界文化遗产》"};
        System.out.println("您共归还书籍5本");
        for (int i = 0; i < title.length; i++) {
            System.out.println((i+1)+"."+title[i]);
        }
        System.out.println("借阅时间：30天");
                book=new AdultBook(2);
                book.setBorrowingPeriod(21);
                double m1=((AdultBook)book).calFines(30);
                book=new KidBook(2);
                book.setBorrowingPeriod(21);
                double m2=((KidBook)book).calFines(30);
                book=new Literature(1);
                book.setBorrowingPeriod(14);
                double m3=((Literature)book).calFines(30);
                System.out.println("一共需交纳罚金："+(m1+m2+m3)+"元");
*/
    }
}
