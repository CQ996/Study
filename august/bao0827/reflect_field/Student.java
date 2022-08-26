package august.bao0827.reflect_field;

/**
 * @ClassName Student
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/25 17:13
 * @Version 1.0
 */
public class Student {
    public Student() {
        System.out.println("我是无参构造器");
    }

    public Student(String name, int age) {
        System.out.println("我是有参构造器");
        this.name = name;
        this.age = age;
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
    public static String schoolName;
    public static final String COUNTTRY = "中国";

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
