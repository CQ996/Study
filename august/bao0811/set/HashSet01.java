package august.bao0811.set;

import java.util.HashSet;

/**
 * @ClassName HashSet01
 * @Description HashSet重复添加相同元素机制
 * @Author CQ
 * @Date 2022/8/15 9:19
 * @Version 1.0
 */
public class HashSet01 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        //说明：
        //1.在执行add方法后，会返回一个boolean值
        //2.如果添加成功，返回true,否则返回false
        //3.可以通过remove 指定删除哪个对象
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));

        set.remove("john");
        System.out.println(set);


        set = new HashSet();
        //4.HashSet 不能添加相同发元素/数据
        set.add("lucy");//添加成功
        set.add("lucy");//添加失败
        set.add(new Dog("tom"));//添加成功
        set.add(new Dog("tom"));//添加成功
        System.out.println(set);

        //再加深一下，非常经典的面试题
        //看源码，分析 add 到底发生了什么？ => 底层机制
        set.add(new String("cq"));//添加成功
        set.add(new String("cq"));//添加失败
        System.out.println(set);
    }
}

class Dog {//定义了一个Dog类
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
