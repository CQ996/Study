package august.bao0811.list;

import java.util.*;

/**
 * @ClassName Vector
 * @Description Vector底层结构和源码分析
 * @Author CQ
 * @Date 2022/8/13 10:02
 * @Version 1.0
 */
public class Vector_ {
    public static void main(String[] args) {
        //1、和ArrayList几乎一样，但是方法有synchronized修饰，
        //支持线程同步（线程互斥）
        //2、在开发中，需要线程同步安全时，考虑使用Vector

        /*
        一、当创建Vector对象时，如果使用的是无参构造器，
        则初始elementData容量为10，如需再次扩容，则扩容elementData为2倍
        */

        /*
        二、当创建Vector对象时，如果使用的是指定大小的构造器，
        则初始elementData容量为指定大小，如需扩容，则直接扩容elementData为2倍
        */

        //源码分析
        //1、new Vector() 底层
        /*
        public Vector() {
                this(10);
            }
         2、vector.add
         2.1  //下面这个方法就是添加数据到vector集合
            public synchronized boolean add(E e) {
                    modCount++;
                    ensureCapacityHelper(elementCount + 1);
                    elementData[elementCount++] = e;
                    return true;
                }
          2.2  //确定是否需要扩容 条件：minCapacity - elementData.length > 0
          private void ensureCapacityHelper(int minCapacity) {
                // overflow-conscious code
                if (minCapacity - elementData.length > 0)
                    grow(minCapacity);
          }
          2.3  //如果需要的数组大小不够用就扩容，扩容的算法
          //newCapacity = oldCapacity + ((capacityIncrement > 0) ?
          //                                             capacityIncrement : oldCapacity);
          //就是扩容2倍
              private void grow(int minCapacity) {
            // overflow-conscious code
            int oldCapacity = elementData.length;
            int newCapacity = oldCapacity + ((capacityIncrement > 0) ?
                                             capacityIncrement : oldCapacity);
            if (newCapacity - minCapacity < 0)
                newCapacity = minCapacity;
            if (newCapacity - MAX_ARRAY_SIZE > 0)
                newCapacity = hugeCapacity(minCapacity);
            elementData = Arrays.copyOf(elementData, newCapacity);
        }
         */
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        vector.add(100);
        System.out.println(vector);


        Vector vector2 = new Vector(8);
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }

    }

}
