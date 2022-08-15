package august.bao0811.set;

import java.util.*;

/**
 * @ClassName HashSetExercise
 * @Description HashSet练习——重写equals()、hashCode()
 * @Author CQ
 * @Date 2022/8/15 9:51
 * @Version 1.0
 */
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new Employee("milan",18));
        hashSet.add(new Employee("smith",28));
        hashSet.add(new Employee("milan",18));
        //三个不同的对象hash值不同，所以都可以添加
        //重写equals()、hashCode() 后第三个重复对象不能添加
        System.out.println(hashSet);


    }
}

//创建Employee(员工类)
class Employee{
    public Employee() {
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

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //如果name 和 age的值相同，在计算hashCode()值时，返回相同的结果

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    //如果name 和 age的值相同，在计算hashCode()值时，返回相同的结果

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}