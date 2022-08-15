package august.bao0811.list;

import java.util.*;

/**
 * @ClassName ArrayListSource
 * @Description ArrayList底层结构和源码分析
 * @Author CQ
 * @Date 2022/8/13 8:31
 * @Version 1.0
 */
public class ArrayListSource {
    public static void main(String[] args) {

        //注意。IDEA默认情况下Debug显示的数据是简化的，如果显示全部需要改设置
        /*
        一、当创建ArrayList对象时，如果使用的是无参构造器，
        则初始elementData容量为0，第一次添加，则扩容elementData为10，
        如需再次扩容，则扩容elementData为1.5倍
        */

        /*
        二、当创建ArrayList对象时，如果使用的是指定大小的构造器，
        则初始elementData容量为指定大小，如需扩容，则直接扩容elementData为1.5倍
        */

        //使用无参构造器创造ArrayList对象
        //ArrayList list = new ArrayList();

        //使用指定大小参构造器创造ArrayList对象
        ArrayList list = new ArrayList(8);


        //使用for循环给list集合添加1-10数据
        for (int i = 0; i <=10; i++) {
            list.add(i);
        }



        //使用for循环给list集合添加11-15数据
        for (int i = 11; i <=15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
        System.out.println(list);
    }
}
