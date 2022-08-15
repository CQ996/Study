package august.bao0811.set;

import java.util.*;
/**
 * @ClassName HashSet_
 * @Description HashSet特点
 * @Author CQ
 * @Date 2022/8/15 9:10
 * @Version 1.0
 */
public class HashSet_ {
    public static void main(String[] args) {
        //源码解读
        //1.构造器走的源码，底层是HashMap
        /*
        public HashSet() {
            map = new HashMap<>();
        }
        2.HashSet可以存放空值，但是只能有一个，即元素不能重复
        3.HashSet不保证元素是有序的，取决于hash后，在确定索引的结果。
        （即，不保证存放元素顺序和取出顺序一致）
        * */
        Set hashSet = new HashSet();
        hashSet.add(null);
        hashSet.add(null);
        System.out.println(hashSet);
    }
}
