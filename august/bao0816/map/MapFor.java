package august.bao0816.map;

import java.util.*;

/**
 * @ClassName MapFor
 * @Description Map接口遍历方式
 * @Author CQ
 * @Date 2022/8/15 18:58
 * @Version 1.0
 */
public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("邓超","孙俪");//替换
        map.put("王宝强","马蓉");
        map.put("宋喆","马蓉");
        map.put("刘令博",null);
        map.put(null,"刘亦菲");
        map.put("鹿晗","关晓彤");
        //第一组：先取出所有的Key,再通过Key取出对应的Value
        System.out.println("===第一种方式===");
        Set keyset = map.keySet();
        //1.增强for循环
        //System.out.println();
        for (Object key :keyset) {
            System.out.println(map.get(key));
        }
        //2.迭代器
        System.out.println("===第二种方式===");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key =  iterator.next();
            System.out.println(map.get(key));
        }
        //第二组：把所有的Values取出
        Collection values = map.values();
        //这里可以使用所有Collection使用的遍历方法
        //1.增强for
        System.out.println("===取出所有的value 增强for===");
        for (Object value :values) {
            System.out.println(value);
        }
        //2.迭代器
        System.out.println("===取出所有的value 迭代器===");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value =  iterator2.next();
            System.out.println(value);
        }
        //第三组：通过EntrySet 来获取 K-y
        Set entrySet = map.entrySet();
        //1.增强for
            System.out.println("===使用EntrySet 增强for===");
            for (Object entry :entrySet) {//EntrySet<Entry<k,y>>
                //将entry 转成Map.entry
                Map.Entry m = (Map.Entry) entry;
                System.out.println(m.getKey()+"-"+m.getValue());
            }
        //2.迭代器
        System.out.println("===使用EntrySet 迭代器===");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry =  iterator3.next();
            //System.out.println(entry.getClass());//HashMap$Node实现Map.Entry（getKey,getValue）
            //向下转型 HashMap$Node
            Map.Entry m= (Map.Entry) entry;
            System.out.println(m.getKey()+"-"+m.getValue());

        }

    }
}
