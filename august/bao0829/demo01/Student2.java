package august.bao0829.demo01;

import java.io.Serializable;

/**
 * @ClassName Student1
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 14:29
 * @Version 1.0
 */
public class Student2 implements Serializable {
    private static final long serialVersionUID = -1698409571728448035L;
    public Student2() {
    }

    public Student2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

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

    @Override
    public String toString() {
        return "Student2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
