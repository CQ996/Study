package august.bao0811.list;

import java.util.*;

/**
 * @ClassName LinkedListUser
 * @Description LinkedList的增删改查
 * @Author CQ
 * @Date 2022/8/14 9:52
 * @Version 1.0
 */
public class LinkedListCRUD {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);
        //演示一个删除结点的源码
        //linkedList.remove();//这里默认删除的是第一个结点

        /* 执行
          public E removeFirst() {
                  final Node<E> f = first;
                  if (f == null)
                      throw new NoSuchElementException();
                  return unlinkFirst(f);
              }
           执行 unlinkFirst，将 f 指向的双向链表的第一个结点拿掉
           private E unlinkFirst(Node<E> f) {
                // assert f == first && f != null;
                final E element = f.item;
                final Node<E> next = f.next;
                f.item = null;
                f.next = null; // help GC
                first = next;
                if (next == null)
                    last = null;
                else
                    next.prev = null;
                size--;
                modCount++;
                return element;
            }
         **/

        //linkedList.remove(2);//删除第3个结点

        //修改某个结点对象, 第2个改为999
        linkedList.set(1,999);
        System.out.println(linkedList);
        /*
        1.LinkedList linkedList = new LinkedList();
            public LinkedList() {}
          2.这时 LinkedList() 的属性 first = null  last = null
          3.执行 添加
            public boolean add(E e) {
                    linkLast(e);
                    return true;
                }
          4.将新的结点，加入到双向链表的最后
              void linkLast(E e) {
                final Node<E> l = last;
                final Node<E> newNode = new Node<>(l, e, null);
                last = newNode;
                if (l == null)
                    first = newNode;
                else
                    l.next = newNode;
                size++;
                modCount++;
            }
         **/
    }
}
