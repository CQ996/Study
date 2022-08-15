package august.bao0815;

import java.util.HashSet;

/**
 * @ClassName Test4
 * @Description HashSet演示介绍
 * @Author CQ
 * @Date 2022/8/15 16:59
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        //Set接口：  子类HashSet特点：基于哈希表支持存储（HashMap）
        //构建一个HashSet其实就是内部使用HashMap集合对象属性
        HashSet set1 = new HashSet();

        //将根据存储的数据计算出hash值作为唯一标识存储该元素
        set1.add("小花");
        set1.add("小花");
        System.out.println(set1);
        int code1="小丽1".hashCode();
        int code2="小丽1".hashCode();
        System.out.println(code1==code2);
    }
}
