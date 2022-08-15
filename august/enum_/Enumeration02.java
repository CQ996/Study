package august.enum_;

/**
 * @ClassName Enumeration02
 * @Description 自定义枚举类实现案例
 * @Author CQ
 * @Date 2022/8/13 18:00
 * @Version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}
//演示自定义枚举
class Season{
    private String name;
    private String desc;//描述

    //定义了四个对象
    public final static Season SPRING=new Season("春天", "温暖");
    public final static Season SUMMER=new Season("夏天","炎热");
    public final static Season AUTUMN=new Season("秋天","凉爽");
    public final static Season WINTER=new Season("冬天","寒冷");

    //1.将构造器私有化，防止被直接new出来
    //2.去掉set方法，防止属性被修改
    //3.在Season内部，直接创建固定的对象
    //4.优化，加入final常量修饰符
    //5.枚举对象名通常大写
    //6.枚举对象根据需要，可以有多个属性
    private Season(String name, String desc) {
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
