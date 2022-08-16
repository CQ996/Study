package august.bao0816.map;

/**
 * @ClassName Test3
 * @Description HashMap、Hashtable、ConcurrentHashMap的不同
 * @Author CQ
 * @Date 2022/8/16 14:13
 * @Version 1.0
 */
public class Test3 {

    public static void main(String[] args) {


        //HashMap   :  首选采用,因为操作不同步. 注: 线程操作过程不属于线程安全. 但是线程操作效率高.
        //Hashtable :  当需要考虑并发操作,因为操作同步. 注: 线程操作过程属于线程安全. 但是线程操作效率较低.
        //ConcurrentHashMap : 部分操作关键代码块为同步形式. 其他无需同步考虑代码块，直接提供并发操作.




    }
}