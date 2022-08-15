package august.bao0811.list;

import java.util.ArrayList;

/**
 * @ClassName ArrayListDetail
 * @Description ArrayList细节
 * @Author CQ
 * @Date 2022/8/13 7:49
 * @Version 1.0
 */
public class ArrayListDetail {
    public static void main(String[] args) {
        //ArrayList不安全，如下源码，方法中没有 synchronized 修饰（线程互斥）
        //多线程时，不建议使用！！！
        /*
        public boolean add(E e) {
        ensureCapacityInternal(size + 1);  // Increments modCount!!
        elementData[size++] = e;
        return true;
    }*/
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add("jack");
        //1.ArrayList可以放入空值，并且多个
        System.out.println(arrayList);
    }
}
