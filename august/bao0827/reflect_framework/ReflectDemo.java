package august.bao0827.reflect_framework;

/**
 * @ClassName ReflectDemo
 * @Description 使用反射提供一个通用框架，支持保存所有对象的具体信息
 * @Author CQ
 * @Date 2022/8/27 10:00
 * @Version 1.0
 */
public class ReflectDemo {
    public static void main(String[] args) {
//        Student s = new Student();
//        s.setName("胡永见");
//        s.setSex('女');
//        s.setAge(18);
//        s.setClassName("java108班");
//        s.setHobby("喜欢吃面条");

        Student s = new Student("胡永见",'女',18,"java108班","喜欢吃面条");
        MybatisUtil.save(s);

//        Teacher t = new Teacher();
//        t.setName("方凯");
//        t.setSex('女');
//        t.setSalary(88.8);

        Teacher t = new Teacher("方凯",'女',88.0);
        MybatisUtil.save(t);
    }
}
