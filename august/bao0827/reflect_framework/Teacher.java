package august.bao0827.reflect_framework;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/27 9:56
 * @Version 1.0
 */
public class Teacher {
    public Teacher() {
    }

    public Teacher(String name, char sex, double salary) {
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    private String name;
    private char sex;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
