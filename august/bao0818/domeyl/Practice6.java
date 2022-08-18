package august.bao0818.domeyl;

//模拟一个集合存储多个班级对象,
//其中每个班级对象内部具有多名同学对象.
//请编码实现将班级对象集合按照每个班级的人数升序排列。

import java.util.ArrayList;

public class Practice6 {
    public static void main(String[] args) {
        //存放班级对象的集合
        ArrayList<Class> classes = new ArrayList<>();
        //初始化班级
        classes.add(new Class("一班"));
        classes.add(new Class("二班"));
        classes.add(new Class("三班"));
        //初始化学生
        ArrayList students = new ArrayList();
        //一班学生
        classes.get(0).students.add(new Student("朝夕", 18, '男'));
        classes.get(0).students.add(new Student("宿莽", 18, '男'));
        classes.get(0).students.add(new Student("芳泽", 18, '男'));
        //二班学生
        classes.get(1).students.add(new Student("灵均", 18, '男'));
        classes.get(1).students.add(new Student("落英", 18, '女'));
        //三班学生
        classes.get(2).students.add(new Student("正则", 18, '男'));
        //排序前
        System.out.println("排序前");
        for (Class c : classes) {
            System.out.println(c.cName + ":" + c.students.size() + "人");
        }
        //按照每个班级的人数升序排列
        //实例化比较器
        NumberComparator numberComparator = new NumberComparator();
        //传入sort()方法中排序
        classes.sort(numberComparator);
        //排序后
        System.out.println("排序后");
        for (Class c : classes) {
            System.out.println(c);
        }
    }
}
