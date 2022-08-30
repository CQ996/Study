package august.bao0829.demo01;

import java.io.Serializable;

/**
 * @ClassName Student
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 18:14
 * @Version 1.0
 */
public class Student implements Serializable {
    public Student() {
    }

    public Student(int id,String name ) {
        this.name = name;
        this.id = id;
    }
    public Student(int id) {
        this.id = id;
    }
    public Student(String name) {
        this.name = name;
    }

    public String name;
    public int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
