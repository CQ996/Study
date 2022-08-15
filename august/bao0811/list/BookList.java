package august.bao0811.list;

import java.util.*;

/**
 * @ClassName ListExercise02
 * @Description List练习---给书集合按价格排序
 * @Author CQ
 * @Date 2022/8/12 9:55
 * @Version 1.0
 */
public class BookList {
    //@SuppressWarnings({"all"})
    public static void main(String[] args) {
        //List list = new ArrayList();
        //List list = new Vector();
        List list = new LinkedList();
        list.add(new Book("红楼梦","曹雪芹",100));
        list.add(new Book("西游记","吴承恩",10));
        list.add(new Book("水浒传","施耐庵",9));
        list.add(new Book("三国演义","罗贯中",80));
        //list.add(new Book("西游记","吴承恩",10));

        System.out.println("==排序前==");
        for (Object o :list) {
            System.out.println(o);
        }

        //冒泡排序
        sort(list);
        System.out.println("==排序后==");
        for (Object o :list) {
            System.out.println(o);
        }

    }
    //静态方法--排序
    //价格要求是从小到大
    public static void sort(List list){
        int listsize=list.size();
        for (int i = 0; i < listsize-1; i++) {
            for (int j = 0; j < listsize-1-i; j++) {
                //取出对象Book
                Book book1 = (Book) list.get(j);
                Book book2 = (Book)list.get(j+1);
                if(book1.getPrice()> book2.getPrice()){
                    list.set(j,book2);
                    list.set(j+1,book1);
                }
            }
        }
    }
}
