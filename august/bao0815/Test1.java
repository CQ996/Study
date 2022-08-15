package august.bao0815;

import java.util.*;

/**
 * @ClassName Test1
 * @Description List功能方法演示
 * @Author CQ
 * @Date 2022/8/15 13:58
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        //Collection:  子接口List(具有索引位置的线性表存储结构)
        //演示List接口使用
        List list = new ArrayList();
        //功能演示：部分功能来自于Collection父类接口中
        //list.add(10);
        //list.clear();
        //Iterator i = list.iterator();
        //······

        //其他功能
        list.add("aaa");
        list.add("ddd");
        list.add("ccc");
        list.add(3, "www");//添加新元素在指定位置中
        list.add(3, "nnn");
        list.add(100);
        //list.add(10,"iii");   //IndexOutOfBoundsException:超出了集合范围0-size
        Object e1 = list.get(0);
        int index = list.indexOf("ddd");//从前往后索引
        int index2 = list.lastIndexOf("dddwww");//从后往前索引
        System.out.println(e1);
        System.out.println(index);
        System.out.println(index2);

        //remove(int index)  remove(Object o)
        list.remove("ddd");
        list.remove("100");//删除数字需要用数字的索引删除
        System.out.println(list);
        //如果要删除List中int元素：需要将元素类型声明为Object形式
        Object o1=100;
        list.remove(o1);
        System.out.println(list);

        //替换指定元素：
        list.set(0,"ppp");
        System.out.println(list);

        //listIterator():也是一种迭代器的获取方式
        //一个列表的迭代器，允许程序员在两个方向遍历列表，在迭代过程中修改列表，并获得在列表中的迭代器的当前位置。
        ListIterator it= list.listIterator();
        while (it.hasNext()) {//从前往后遍历
            Object o2 =  it.next();
            it.add("王");
            //通过迭代器加入新元素，不能通过集合操作
            System.out.println("listIterator()迭代器取出的集合："+o2);
        }
        System.out.println(list);
        System.out.println("===================");
        while (it.hasPrevious()) {//从后往前遍历
            Object o3 =  it.previous();
            System.out.println("listIterator()迭代器取出的集合："+o3);
        }
        System.out.println(list);
    }
}
