package august.bao0817.dome_;

import java.util.*;

/**
 * @ClassName Dome01
 * @Description 用程序给出10个随机数，存入集合中，使用迭代器遍历，按从小到大顺序输出。
 * @Author CQ
 * @Date 2022/8/17 18:13
 * @Version 1.0
 */
public class Dome01 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        //3~9随机整数
        int a;
        for (int i = 0; i < 10; i++) {
            a=(int)(Math.random()*7)+3;
            list.add(a);
        }
        Collections.sort(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.println(next);
        }
    }
}
