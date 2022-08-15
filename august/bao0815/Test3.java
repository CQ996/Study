package august.bao0815;

import java.util.*;

/**
 * @ClassName Test3
 * @Description HashSet演示介绍
 * @Author CQ
 * @Date 2022/8/15 16:53
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        //Set: 无需，唯一
        Set set1 = new HashSet();
        set1.add("王小一");
        set1.add("王小二");
        set1.add("王小三");
        set1.add("王小三");
        set1.add("王小四");
        set1.add("王小五");
        set1.add("王小六");
        set1.add("王小六");

        Iterator it = set1.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println("下一个元素为："+next);
        }
    }
}
