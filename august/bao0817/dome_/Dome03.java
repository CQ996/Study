package august.bao0817.dome_;

import java.util.*;

/**
 * @ClassName Dome03
 * @Description 模拟一个集合存储多个班级对象,  其中每个班级对象内部具有多名同学对象. 请编码实现将班级对象集合按照每个班级的人数升序排列。HashMap转List
 * @Author CQ
 * @Date 2022/8/17 19:00
 * @Version 1.0
 */
public class Dome03 {
    public static void main(String[] args) {
        //创建Map集合收集班级信息
        Map <String,List<Student>> data = new HashMap<>();
        //2.把班级信息存入大集合
        ArrayList<Student> stu9 = new ArrayList<>();
        Student s9 = new Student("张一","一班");
        Student s8 = new Student("张一","一班");
        Student s7 = new Student("张一","一班");
        Student s6 = new Student("张一","一班");
        Student s5 = new Student("张一","一班");
        //3.把学生信息存入班级
        Collections.addAll(stu9,s9,s8,s7,s6,s5);
        data.put("一班",stu9);


        ArrayList<Student> stuu = new ArrayList<>();
        Student sttq = new Student("李一","三班");
        Student sttw = new Student("李二","三班");
        Student stte = new Student("李三","三班");

        Collections.addAll(stuu,sttq,sttw,stte);
        data.put("三班",stuu);

        ArrayList<Student> stu2 = new ArrayList<>();
        Student st1 = new Student("王一","二班");
        Student st2 = new Student("王二","二班");
        Collections.addAll(stu2,st1,st2);
        data.put("二班",stu2);
        //4.统计每个班级人数
        Map<Student,Integer> infos=new HashMap<>();
        //5.提取所有人姓名信息
        Collection<List<Student>> values = data.values();
        //7.values={["张一"],["李一","李二","李三"],["王一","王二"]}
        System.out.println("====排序前====");
        bijiao bijiao1 = new bijiao();
        for (List<Student> vaule :values) {
            //再次遍历得到["张一"]···
            System.out.println(vaule);
        }
        //HashMap转List
        List<List<Student>> valueList = new ArrayList<>(values);
        valueList.sort(bijiao1);
        System.out.println("====排序后====");
        for (Object vaule :valueList) {
            //再次遍历
            System.out.println(vaule);
        }

    }

}

//学生
class Student{
    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", banji='" + banji + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBanji() {
        return banji;
    }

    public void setBanji(String banji) {
        this.banji = banji;
    }

    public Student(String name, String banji) {
        this.name = name;
        this.banji = banji;
    }

    String name;
    String banji;
}


//比较器
class bijiao extends Student implements Comparator <List<Student>>{

    @Override
    public int compare(List<Student> o1, List<Student> o2) {
        return o1.size()-o2.size();
    }
}
