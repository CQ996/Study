package august.bao0811.collection;

import java.util.*;

/**
 * @ClassName CollectionIterator
 * @Description Collection接口遍历方式一：用Iterator迭代器遍历获取集合中的单一元素
 * @Author CQ
 * @Date 2022/8/11 10:04
 * @Version 1.0
 */
public class CollectionIterator {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义","罗贯中",10.1));
        col.add(new Book("小李飞刀","古龙",5.1));
        col.add(new Book("红楼梦","曹雪芹",34.6));

        //System.out.println("col="+col);
        //遍历col集合
        //1、先得到col对应的迭代器
        Iterator bookss=col.iterator();//得到一个集合的迭代器
        //2.使用while循环遍历
        while (bookss.hasNext()){//判断是否还有数据，没有就返回false
            //返回下一个元素，这里的编译类型是Object，但是运行类型取决于上面存放的对象类型
            Object obj = bookss.next();//next()方法：①指针下移②将下移以后集合位置上的元素返回
            System.out.println("obj="+obj);
        }
            //快捷键，快速生成while循环--→itit
            //显示idea所有快捷键的快捷键ctrl+j
//            while (bookss.hasNext()) {
//                Object next =  bookss.next();
//            }
        //3、当迭代器退出while循环后，这时iterator(此处是Book集合的迭代器bokss)迭代器指向最后一个元素
        //bookss.next();//NoSuchElementException
        //4、如果希望再次遍历，需要重置遍历
        bookss=col.iterator();
        System.out.println("=====第二次遍历=====");
        while (bookss.hasNext()) {
            Object n02 =  bookss.next();
            System.out.println("n02="+n02);
        }
    }
}

class Book{
    public Book() {
    }
    private String name;
    private String author;
    private double price;

    public Book(String name,String author,double price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
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

    @Override
    public String toString() {
        return "Book{" +
                "书名：'" + name + '\'' +
                ", 作者：'" + author + '\'' +
                ", 价格：" + price +
                '}';
    }
}
