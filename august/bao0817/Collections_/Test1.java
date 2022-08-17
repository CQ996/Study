package august.bao0817.Collections_;

import java.util.*;

/**
 * @ClassName Collections_
 * @Description Collections的工具类演示
 * @Author CQ
 * @Date 2022/8/17 14:18
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {
        // Collections :  集合操作工具类. 注: 提供了一些静态操作集合的方法.

        //演示:

        List list = new ArrayList();
        list.add( 8 );
        list.add( 5 );
        list.add( 1 );
        list.add( 4 );
        list.add( 6 );
        //sort()
        Collections.sort(list);
        //reverse()
        //Collections.reverse( list );

        //binarySearch()
        int index = Collections.binarySearch(list, 5);

        System.out.println( list );
        System.out.println("元素的位置为: " + index);

        //synchronizedXXXX() :  将不同步的集合 ----> 同步集合.
        //原理: 在内部做了包装操作:  new  SynchronizedList( list )
        List list2 = Collections.synchronizedList(list);

        System.out.println(list2);

        //unmodifiableXXXX():  将集合 ----> 只读集合.
        List list3 =  Collections.unmodifiableList( list );

        Object o = list3.get(0);//ok
        list3.add( "哈哈" );//抛出异常

    }
}
