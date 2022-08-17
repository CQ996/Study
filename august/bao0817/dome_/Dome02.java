package august.bao0817.dome_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * @ClassName Dome02
 * @Description 模拟一个集合存储多名同学, 编码实现将其中学号，姓名相同的学生对象从集合中移除.保留最终集合元素并展示.
 * @Author CQ
 * @Date 2022/8/17 18:27
 * @Version 1.0
 */
public class Dome02 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Students st = new Students();
        Students st1=new Students(1,"王一");
        Students st2=new Students(1,"王一");
        Students st5=new Students(1,"张三");
        Students st3=new Students(3,"李四");
        Students st4=new Students(4,"王五");
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        Iterator it = list.iterator();
        HashSet setData = new HashSet();
        setData.addAll(list);
        System.out.println(setData.toString());
    }
}
class Students{
    @Override
    public String toString() {
        return "学号：" + id +
                "  姓名:" + name ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Students() {
    }
}