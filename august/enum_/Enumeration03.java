package august.enum_;

/**
 * @ClassName Enumeration03
 * @Description enum关键字枚举
 * @Author CQ
 * @Date 2022/8/13 18:42
 * @Version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season2.SPRING);
    }
}

//反编译源码中显示：
//当使用enum关键字开发一个枚举类时，默认会继承Eunm类。而且时一个final修饰过的类
//
/*
      D:\IdeaProjects\bdqn\out\production\bdqn\august\enum_>javap Season2.class
        Compiled from "Enumeration03.java"

        final class august.enum_.Season2 extends java.lang.Enum<august.enum_.Season2> {
      public static final august.enum_.Season2 SPRING;
      public static final august.enum_.Season2 SUMMER;
      public static final august.enum_.Season2 AUTUMN;
      public static final august.enum_.Season2 WINTER;
      public static august.enum_.Season2[] values();
      public static august.enum_.Season2 valueOf(java.lang.String);
      public java.lang.String getName();
      public java.lang.String getDesc();
      public java.lang.String toString();
      static {};
}
**/

enum Season2{
    //定义了四个对象
//    public final static Season SPRING=new Season("春天", "温暖");
//    public final static Season SUMMER=new Season("夏天","炎热");
//    public final static Season AUTUMN=new Season("秋天","凉爽");
//    public final static Season WINTER=new Season("冬天","寒冷");

    //如果使用了enum 来实现枚举类
    //1.使用关键字 enum替代class
    //2.public final static Season SPRING=new Season("春天", "温暖"); 直接使用
    //  SPRING("夏天","炎热");  解读：常量名(实参列表)
    //3.如果有多个常量（对象），使用 ， 号间隔即可：常量名(实参1，实参2)，最后一个用;收尾
    //4.如果使用enum来实现枚举，要求将定义常量对象，写在最前面
    //5.如果我们使用无参构造器，创建常量对象，则可以省略（）；
    //6.枚举对象必须放在枚举类的行首。
    SPRING("春天", "温暖"), SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"), WINTER("冬天","寒冷"),
    WHAT();//调用类的无参构造器可以简化为：WHAT
    private String name;
    private String desc;//描述

    //无参构造器
    Season2() {
    }

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return name + "是" + desc + "的";
    }
}
