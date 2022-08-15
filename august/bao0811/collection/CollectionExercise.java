package august.bao0811.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @ClassName CollectionExercise
 * @Description 集合遍历练习，分别用Iterator迭代器、增强for循环遍历
 * @Author CQ
 * @Date 2022/8/11 11:50
 * @Version 1.0
 */
public class CollectionExercise {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Dog("小花",1));
        list.add(new Dog("小黄",2));
        list.add(new Dog("小黑",3));

        System.out.println("1、用Iterator迭代器遍历");
        //获得一个list集合的迭代器
        Iterator Dogss= list.iterator();
        while (Dogss.hasNext()) {
            Object dog =  Dogss.next();
            System.out.println(dog);
        }

        System.out.println("2、用增强for循环遍历");
        for (Object dog :list) {
            System.out.println(dog);
        }

    }
}
class Dog{
    public Dog() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;
    public Dog(String name, int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Dog{" + "姓名：'" + name + '\'' +
                ", 年龄" + age +
                '}';
    }
}
