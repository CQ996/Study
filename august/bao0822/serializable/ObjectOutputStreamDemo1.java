package august.bao0822.serializable;

import java.io.*;

/**
 * @ClassName ObjectOutputStreamDemo1
 * @Description 使用对象序列化：使用ObjectOutputStream把内存中的对象存到文件中
 * @Author CQ
 * @Date 2022/8/22 12:19
 * @Version 1.0
 */
public class ObjectOutputStreamDemo1 {
    public static void main(String[] args) throws Exception {
        //1.创建学生对象
        Student s = new Student("陈磊","chenlei","1314520",21);

        //2.对象序列化，使用对象字节输出流，包装字节输出流管道
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("obj.txt"));

        //3.调用序列化方法
        oos.writeObject(s);

        //4.释放资源
        oos.close();
    }
}
//如果要序列化，必须要实现Serializable接口
class Student implements Serializable{
    private String name;
    private String loginName;
    private String passWord;
    private int age;

    public Student(String name, String loginName, String passWord, int age) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
        this.age = age;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", age=" + age +
                '}';
    }
}