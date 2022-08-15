package august.bao0816.map;

import java.util.*;

/**
 * @ClassName Map_
 * @Description Map接口特点
 * @Author CQ
 * @Date 2022/8/15 18:13
 * @Version 1.0
 */
public class Map_ {
    public static void main(String[] args) {
        //Map 接口实现类的特点，使用 HashMap 演示
        //1.Map 用于保存具有映射关系的数据：Key-Value（双列元素）
        //2.Map 中的 Key 与 Value 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
        //3.Map 中的 Ke y不允许重复，因为要根据 Key 的哈希值判断
        //4.Map 中的 value 可以重复
        //5.Map 中的 Key 与 Value 可以为null，
        // Key为null只能有一个，Value为null可以有多个
        //6.常用String类作为Map的Key
        //7.Key和vaule之间存在单向一对一关系，即通过指定的key总能找到对应的vaule
        //8.
        Map map = new HashMap();
        map.put("no1","程大屌");
        map.put("no2","张无忌");
        map.put("no1","张三丰");//当有相同的K，就等价于替换
        map.put("no3","张三丰");
        System.out.println(map);
        map.put(null,null);
        map.put("no4","abc");
        map.put("no5",null);
        System.out.println(map);
        map.put(1,"赵敏");
        System.out.println(map);
        map.put(new Object(),"凯子");
        //通过get 方法，传入Key ，会返回对应的vaule
        System.out.println(map.get("no1"));
    }
}
