package august.bao0811.collection;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionFor
 * @Description Collection接口遍历对象方式2：增强for循环
 * @Author CQ
 * @Date 2022/8/11 11:37
 * @Version 1.0
 */
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();

        col.add(new Book("三国演义", "罗贯中", 10.1));
        col.add(new Book("小李飞刀", "古龙", 5.1));
        col.add(new Book("红楼梦", "曹雪芹", 34.6));

        //1、增强for循环相当于简化Iterator
        //2、底层依然是迭代器用于遍历集合
        //基本语法：
        //  （元素类型 元素名：集合名或数组名）
        for (Object book : col) {
            System.out.println("book=" + book);
        }
        //3、快捷键 大写I 再回车
//        for (Object o :) {
//
//        }

        //增强for循环也可以直接在数组使用
//        int[] nums={1,3,5,7,2};
//        for (int i :nums) {
//            System.out.print(i);
//        }
    }
}
