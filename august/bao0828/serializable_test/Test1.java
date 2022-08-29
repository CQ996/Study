package august.bao0828.serializable_test;

import java.io.*;

/**
 * @ClassName Test
 * @Description 对象的序列化
 * @Author CQ
 * @Date 2022/8/29 9:15
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        //1.创建java对象
        User u1 = new User("陈磊","chenlei","1314520",21);
        //2.指定目标位置
        File f1 = new File("src/august/bao0828/serializable_test/1.txt");
        //3.构建序列化流通道（对象-->字节）
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f1));
        //4.往序列化流中传输Java对象
        oos.writeObject(u1);
        //oos.writeInt();支持存储任意基本类型，Serializable不用标识，可以直接使用
        oos.flush();

        //5.关闭释放内存资源
        oos.close();
    }
}

//如果要序列化，必须要实现Serializable接口（起到标识作用)
class User implements Serializable {
    //生成序列化的编号：标识唯一性
    //序列化的版本号和反序列化的版本号必须一致，才能不出错
    private static final long serialVersionUID = -9116806304041075721L;

    private String name;
    private String loginName;
    //transient修饰成员变量，不参与序列化
    private transient String passWord;
    private int age;

    public User(String name, String loginName, String passWord, int age) {
        this.name = name;
        this.loginName = loginName;
        this.passWord = passWord;
        this.age = age;
    }

    public User() {
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
