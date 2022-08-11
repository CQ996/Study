package august.bao0811.collection;

import java.util.*;

/**
 * @ClassName Collection_
 * @Description Collection接口实现子类的特点
 * @Author CQ
 * @Date 2022/8/10 23:01
 * @Version 1.0
 */
public class Collection_ {
    public static void main(String[] args) {
        //1、集合主要是两组（单列集合，双列集合）
        //2、Collection 接口有两个重要的子接口List Set,他们的实现子类都是单列集合
        //3、Map 接口的实现子类 是双列集合，存放的 K-V
        //单列数组
        ArrayList arrayList = new ArrayList();
        //单列集合
        arrayList.add("jack");
        arrayList.add("tom");

        //双列数组
        HashMap hashMap = new HashMap();
        //双列集合
        hashMap.put("N01","北京");
        hashMap.put("N02","上海");

        //1、Collection实现子类可以存放多个元素，每个元素可以是Obiject
        //2、有些Collection实现类，可以存放重复的元素，有些不可以
        //3、有些Collection实现类，有些是有序的（List），有些不是有序（Set）
        //4、Collection接口没有直接的实现子类，是通过它的子接口Set和List来实现的


    }
}
