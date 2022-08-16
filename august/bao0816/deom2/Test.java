package august.bao0816.deom2;

import java.util.*;

/**
 * @ClassName Test
 * @Description 泛型集合:Map中一个键对应多个值
 * @Author CQ
 * @Date 2022/8/16 11:35
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Student> stu= new ArrayList<>();
        stu.add(new Student("张三丰",7,'男'));
        stu.add(new Student("李  四",8,'男'));
        stu.add(new Student("王  丽",9,'女'));

        ArrayList<Student> stu2= new ArrayList<>();
        stu2.add(new Student("张aa",7,'男'));
        stu2.add(new Student("李bb",8,'男'));
        stu2.add(new Student("王cc",9,'女'));

        HashMap<String, ArrayList> saa= new HashMap<>();
        saa.put("三年级一班",stu);
        saa.put("三年级二班",stu2);
        System.out.println("输入班级名称：");
        String grade=in.next();
        //获取saa集合的键
        Set<String> keys = saa.keySet();
        for (String key : keys ) {
            //获取saa集合的值
            ArrayList list = saa.get(key);
            //获取值的迭代器
            Iterator it = list.iterator();
            if (grade.equals(key)) {
                System.out.println(grade + "学生列表：");
                while (it.hasNext()) {
                    Student st = (Student) it.next();
                    System.out.println(st.name + "\t\t" + st.age + "\t\t" + st.sex);
                }
            }

        }


    }
}
class Student {
    public Student() {
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

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    String name;
        int age;
        char sex;

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


}
