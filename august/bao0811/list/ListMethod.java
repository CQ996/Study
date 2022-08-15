package august.bao0811.list;

import java.util.*;

/**
 * @ClassName ListMethod
 * @Description List接口常用方法
 * @Author CQ
 * @Date 2022/8/12 8:47
 * @Version 1.0
 */
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("程大吊");
        //void add(int index, Object element)     在index=1的位置插入一个对象
        list.add(1,"王小二");
        System.out.println(list);
        //boolean addAll(int index, Collection else)
        //从index位置开始将eles中的所有元素添加进来
        List list2 = new ArrayList();
        list2.add("tom");
        list2.add("jack");
        list.addAll(1,list2);
        System.out.println(list);
        //int indexOf(Object obj):返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("tom"));
        //int lastIndexOf(Object obj):返回obj在集合中最后一次出现的位置
        list.add("张三丰");
        System.out.println(list);
        System.out.println(list.lastIndexOf("张三丰"));
        //Object remove(int index) ：移除此列表中指定index位置的元素。
        list.remove(1);
        System.out.println(list);
        //Object set(int index, E element):用指定元素替换此列表中指定位置的元素(该元素必须存在)。
        list.set(1,"方凯");
        System.out.println(list);
        //List subList(int fromIndex,int toIndex):返回从fromIndex到toIndex位置的子集合
        //注意：返回的子集合  fromIndex <= subList < toIdex
        List returnlist = list.subList(0,2);
        System.out.println(returnlist);
    }
}
