package august.bao0817.generic_;

import java.util.*;

/**
 * @ClassName Test3
 * @Description 泛型集合的演示
 * @Author CQ
 * @Date 2022/8/17 15:12
 * @Version 1.0
 */
public class Test3 {

    public static void main(String[] args) {


        //泛型集合: 对集合在使用过程中,对其进行元素类型参数的声明约束.
        //          被称为: 类型参数化.

        List<Integer> list = new ArrayList();

        list.add( 10 );
        list.add( 26 );

        Integer num1 = list.get(0);
        Integer num2 = list.get(1);

        Map<Integer , String> map = new HashMap();
        map.put( 1 , "老张" );
        map.put( 2 , "老李" );

        Collection<String> values = map.values();


        //需求: 模拟一个班级集合.存储结构: k必须为学号数值, v必须为学生对象Student类型.
        Map<Integer , Student> map2 = new HashMap();

        //测试: 存储三名同学, 并迭代展示三名同学的内部姓名. 性别信息.
        Student s1 = new Student( "王小二" , "男生" );
        Student s2 = new Student( "王小三" , "男生" );
        Student s3 = new Student( "王小四" , "男生" );

        map2.put( 1 , s1 );
        map2.put( 2 , s2 );
        map2.put( 3 , s3 );


        Collection<Student> values1 = map2.values();
        for( Student s : values1){
            System.out.println("学生信息为: " +s.getStuName()+ " --- " + s.getGender());
        }

    }
}

//自定义类型:
class Student{
    private String stuName;
    private String gender;

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String stuName, String gender) {
        this.stuName = stuName;
        this.gender = gender;
    }
}
