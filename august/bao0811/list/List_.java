package august.bao0811.list;

import java.util.*;

/**
 * @ClassName List_
 * @Description List接口特点
 * @Author CQ
 * @Date 2022/8/11 12:28
 * @Version 1.0
 */
public class List_ {
    public static void main(String[] args) {
        List list = new ArrayList();
        //1、List集合类中元素有序（添加和取出顺序一致，且元素可重复）
        list.add("jack");
        list.add("tom");
        list.add("marry");
        list.add("cq");
        list.add("tom");
        System.out.println("list="+list);
        //2、List集合中的每个元素都有其对应的顺序索引，即支持索引
        //索引从0开始
        System.out.println(list.get(3));//cq

    }
}
