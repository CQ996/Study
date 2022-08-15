package august.bao0815;

import java.util.*;

/**
 * @ClassName Test2
 * @Description LinkedList超多种方法使用
 * @Author CQ
 * @Date 2022/8/15 14:47
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //LinkedList集合的使用演示
        LinkedList list = new LinkedList();
        //add(E e)将指定的元素插入列表的尾端 ; add(int index, E element) 在列表中指定的位置上插入指定的元素 ;
        // addFirst(E e)在此列表的开始处插入指定的元素 ; addLast(E e)在此列表的结尾处插入指定的元素。
        // offer(E e)将指定的元素添加到列表的尾部（最后一个元素）; offerFirst(E e)在列表的前面插入指定的元素 ; offerLast(E e)在列表的结尾插入指定的元素
        list.addFirst("A");
        list.addFirst("B");
        list.addFirst("C");
        System.out.println(list);
        //element() 检索，但不删除，此列表的头（第一个元素）; get(int index) 返回此列表中指定位置的元素;
        // getFirst() 返回此列表中的第一个元素 ; getLast()返回此列表中的最后一个元素 ;
        //peek() 检索，但不删除，此列表的头（第一个元素）;
        // peekFirst() 检索，但不删除该列表的第一个元素，或返回 null如果这个列表是空的;
        // peekLast() 检索，但不删除该列表的最后一个元素，或返回 null如果这个列表是空的;
        //poll() 检索并删除此列表的头（第一个元素）;
        // pollFirst() 检索并移除此列表的第一个元素，或返回 null如果这个列表是空的 ;
        // pollLast() 检索并移除此列表的最后一个元素，或返回 null如果这个列表是空的 ;
        // remove() 检索并删除此列表的头（第一个元素）;
        // remove(int index) 移除此列表中指定位置的元素;
        // removeFirst() 移除并返回此列表中的第一个元素 ;
        // removeLast() 移除并返回此列表中的最后一个元素 ;
        Object firstNode = list.pollFirst();
        System.out.println(list);
        //当把链表当作对象使用时，存取方法：pop() , push(E e) ，（先进后出）
        //相当于模拟堆栈：list2
        LinkedList list2=new LinkedList();
        //入栈：push(E e)
        list2.push("A");
        list2.push("B");
        list2.push("C");

        //出栈：pop()
        Object obj1 = list2.pop();
        Object obj2 = list2.pop();
        Object obj3 = list2.pop();
        System.out.println(obj1+"  "+obj2+"  "+obj3);

        //将链表作为单端队列进行操作(先进先出)：
        LinkedList list3=new LinkedList();

        //存储数据至队列：
        list3.add("A");
        list3.add("B");
        list3.add("C");

        //取出队列数据：
        Object f1 = list3.removeFirst();
        Object f2 = list3.removeFirst();
        Object f3 = list3.removeFirst();
        System.out.println(f1+"  "+f2+"  "+f3);
    }

}
