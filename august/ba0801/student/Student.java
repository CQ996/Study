package august.ba0801.student;

/**
 * @ClassName Student
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/1 15:51
 * @Version 1.0
 */
public class Student {
    public Student(){
        this.studNum="0000";
    }
    public Student(String name, int age){
        this();
        this.name=name;
        this.age=age;
    }
    public void show(){
        System.out.println("学号是"+studNum+"姓名是："+name+"年龄是："+age);
    }
    String studNum;
    String name;
    int age;
}
