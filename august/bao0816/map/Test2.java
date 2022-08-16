package august.bao0816.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName Test2
 * @Description HashMap和treeMap
 * @Author CQ
 * @Date 2022/8/16 14:12
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {


        //增强for的使用:  简化代替迭代器.

        Map map = new HashMap();

        map.put(1 , "老张1");
        map.put(2 , "老张2");
        map.put(3 , "老张3");

        Collection values = map.values();

        for ( Object n  : values) {
            System.out.println("展示: " + n);
        }

        //HashMap子类: key值将基于哈希表维护.保持唯一性.
        //用法: 等同于Map接口.

        // 指定默认初始容量。和指定当容量扩展的一个加载比例.
        //HashMap hashMap = new HashMap();
        // 当每次加入新元素时. 都会检查容量是否满足,否则将自动扩容.扩容方法: resize().
        //hashMap.put()

        //TreeMap子类: key值将基于默认自然排序维护.保持存储顺序.
        TreeMap treeMap = new TreeMap();
        treeMap.put( "A" , "小王1" );
        treeMap.put( "C" , "小王1" );
        treeMap.put( "D" , "小王1" );
        treeMap.put( "B" , "小王1" );
        treeMap.put( "E" , "小王1" );

        System.out.println(treeMap);

    }
}