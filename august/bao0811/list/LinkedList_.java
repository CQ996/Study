package august.bao0811.list;

/**
 * @ClassName LinkedList_
 * @Description LinkedList底层结构和源码分析
 * @Author CQ
 * @Date 2022/8/13 10:44
 * @Version 1.0
 */
public class LinkedList_ {
    //1.LinkedList底层实现了双向链表和双端队列特点
    //2.可以添加任意元素（元素可以重复），包括null
    //3.线程不安全，没有实现同步
    //4.LinkedList中维护了两个属性first和last分别指向首节点和尾节点
    //5每个节点（Node对象），里面又维护了prev、next、item三个属性，
    // 其中通过prev指向前一个，通过next指向后一个节点。最终实现双向链表。
    //6.所以LinkedList元素的添加和删除，不是通过数组完成的，相对来说效率比较高
    public static void main(String[] args) {
        //模拟一个简单的双向链表
        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node cq = new Node("cq");
        //连接三个结点，形成双向链表
        //jack -> tom -> cq
        jack.next = tom;
        tom.next = cq;
        //cq -> tom -> jack
        cq.pre = tom;
        tom.pre = jack;

        Node first = jack;//让first引用指向jack，就是双向链表的头结点
        Node last = cq;//让last引用指向cq，就是双向链表的尾结点

        //演示，从头到尾进行遍历
        System.out.println("==从头到尾进行遍历==");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first 信息
            System.out.println(first);
            first = first.next;
        }
        //演示从尾到头的遍历
        System.out.println("==从尾到头进行遍历==");
        while (true) {
            if (last == null) {
                break;
            }
            //输出first 信息
            System.out.println(last);
            last = last.pre;
        }

        //演示链表添加对象/数据，是多么的方便
        //要求，在tom-------cq之间，插入一个对象，smith

        //1.先创建一个 Node 结点，name 就是smith
        Node smith = new Node("smith");
        System.out.println("==下面就把smith加入到了双向链表==");
        smith.next = cq;
        smith.pre = tom;
        cq.pre = smith;
        tom.next = smith;

        //让first 再次指向第一个人jack
        first = jack;//让first引用指向jack，就是双向链表的头结点
        System.out.println("==从头到尾进行遍历==");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first 信息
            System.out.println(first);
            first = first.next;
        }

        last = cq;//让last重新指向最后一个结点
        //演示从尾到头的遍历
        System.out.println("==从尾到头进行遍历==");
        while (true) {
            if (last == null) {
                break;
            }
            //输出first 信息
            System.out.println(last);
            last = last.pre;
        }
    }
}

//定义一个 Node 类， Node 对象 表示双向链表的一个结点
class Node {
    public Object item;//真正存放数据的地方，所以用Object
    public Node next;//指向后一个结点
    public Node pre;//指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }
}