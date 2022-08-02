package august.ba0801.student;

/**
 * @ClassName Student
 * @Description 构造方法3种写法会不冲突:类型，数量，顺序
 *              private封装
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
    public Student(int aaa,String bbb){
        this.aaa=555;
        this.bbb="777";
    }
    public static void show(){
        //静态方法不能调用实例方法，反之可以
        //非要调用，先实例化对象
        Student student=new Student();
        System.out.println("学号是"+student.studNum+"姓名是："+student.name+"年龄是："+student.age);
    }
    String studNum;
    private String name;
    private int age;
    int aaa;
    String bbb;
    char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        if(sex=='男' || sex=='女'){
            this.sex = sex;
        }else {System.out.println("性别非法！");}

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
}
