package august.bao0816.map;

import java.util.*;

/**
 * @ClassName Test1
 * @Description Map方法演示
 * @Author CQ
 * @Date 2022/8/16 10:36
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) {

        //Map: 一种存储结构为:  key-value 形式的 集合对象.

        //实例化:
        Map map = new HashMap();

        //使用方法:

        //put(K key, V value)
        map.put( 1 , "小花1" );
        map.put( 2 , "小花2" );
        map.put( 3 , "小花3" );

        //clear() containsKey(Object key) containsValue(Object value)
        //map.clear();
//        boolean r1 = map.containsKey(1);
//        boolean r2 = map.containsValue("小花");
//        System.out.println(r1+" ====== " + r2);



        //get(Object key) remove(Object key) replace(K key, V value)
//        Object value = map.get(2);
//        System.out.println("value值为； " + value);
//        Object r3 = map.remove(2);
//        System.out.println("返回的是: " + r3);
//        map.replace(3 , "老王3");

        //size()
//        int size = map.size();
//        System.out.println("元素数量为: " + size);

        //直接输出,仅限观察内部数据结构.
//        System.out.println( map );


        //keySet()values()entrySet()

        //解析map集合的所有的键:
        Set set1 = map.keySet();

        Iterator it = set1.iterator();
        while(it.hasNext()) {
            Object key = it.next();

            //根据key取value:
            Object value = map.get(key);
            System.out.println("取出的key:" + key+" ---- 对应的值为 : " + value);
        }

        //解析map中的所有value:
        Collection values = map.values();
        Iterator it2 = values.iterator();
        while( it2.hasNext() ){
            Object value = it2.next();
            System.out.println("解析到的value为: " + value);
        }

        //解析map集合中的每个元素对象(k-v):
        Set set2 = map.entrySet();
        Iterator it3 = set2.iterator();
        while ( it3.hasNext() ) {
            //注意: o1对象结构为: key-value形式.
            Object o1 = it3.next();

            //Map.Entry类型即为: key-value形式.
            Map.Entry entry = (Map.Entry)o1;

            //解析单个对象的内部详细信息:
            Object k = entry.getKey();
            Object v = entry.getValue();
            System.out.println("单个元素对象为: " + k +" --- " + v);

        }


    }
}
