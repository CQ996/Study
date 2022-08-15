package august.enum_;

/**
 * @ClassName Enumeration01
 * @Description 枚举的描述
 * @Author CQ
 * @Date 2022/8/13 13:20
 * @Version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season1 spring = new Season1("春天", "温暖");
        Season1 summer = new Season1("夏天","炎热");
        Season1 autumn = new Season1("秋天","凉爽");
        Season1 winter = new Season1("冬天","寒冷");
        //因为对于季节而言，他的对象（具体的值）是固定的4个，不会有更多；只读，不需要修改
        //因此 枚举类[枚举：一个一个 举，即把具体的对象一个一个例举出来的类
        // 就称为枚举类]
        //枚举是一组常量的集合。
        //枚举属于一种特殊的类，里面只包含一组有限的特定的对象
        Season1 other = new Season1("红天", "~~~~");
    }
}

class Season1{
    private String name;
    private String desc;//描述

    public Season1(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
