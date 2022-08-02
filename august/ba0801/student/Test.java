package august.ba0801.student;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description 学生——有参、无参构造方法的使用
 * @Author CQ
 * @Date 2022/8/1 15:53
 * @Version 1.0
 */
public class Test {
    Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        /*
        String name="小王";
        int age=18;
        Student student=new Student(name,age);
        student.setName("阿前");
        student.show();
        */
        Student student=new Student();
        student.setName("阿前");
        student.setAge(20);
        student.setSex('男');
        System.out.println("姓名是"+student.getName()+"，年龄是："+ student.getAge()+"性别是："+student.getSex());
    }
}
