package august.enum_;

/**
 * @ClassName EnumMethod
 * @Description 演示Enum类的各种方法使用
 * @Author CQ
 * @Date 2022/8/13 20:40
 * @Version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        //1.toString:Enum类已经重写过了，返回的当前对象名，子类可以重写该方法，用于返回对象的属性信息
        //使用Season2枚举类，来演示各种方法
        Season2 autumn = Season2.AUTUMN;
        //2.输出枚举对象的名字
        System.out.println(autumn.name());
        //3.ordinal()方法输出的时该枚举对象的次序/编号：从0开始编号
        //AUTUMN 枚举对象是第三个，因此输出 2
        System.out.println(autumn.ordinal());
        //4.从反编译可以看到values()方法，返回eason2[]含有定义的所有枚举对象
        //也就是返回当前枚举类中所有的常量
        Season2[] values = Season2.values();
        System.out.println("==遍历取出枚举对象==");
        for (Season2 season :values) {//增强for循环
            System.out.println(season);
        }
        //5.valueOf():将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程：
        //1.根据你输入的"AUTUMN" 到 Season2的枚举对象去查找
        //2.如果找到了，就返回，如果没有找到，就报错
        Season2 autumn1 = Season2.valueOf("AUTUMN");
        System.out.println("autumn1="+autumn1);
        System.out.println(autumn==autumn1);
        //6.compareTo:比较两个枚举常量，比较的就是编号
        //可以确定两个枚举常量位置先后
        //就是把 Season2.AUTUMN 和 Season2.SUMMER枚举对象编号比较
        /*
        public final int compareTo(E o) {

            return self.ordinal - other.ordinal;
        }
        Season2.AUTUMN编号[2] - Season2.SUMMER的编号[1]
        **/
        System.out.println(Season2.AUTUMN.compareTo(Season2.SUMMER));
    }
}
