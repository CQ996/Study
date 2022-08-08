package august.bao0808.itface;

/**
 * @ClassName USB
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 15:15
 * @Version 1.0
 */
public interface USB {
    //成员：常量属性
    //接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量（并且只能是 public，用 private 修饰会报编译错误）。
    static final int HEIGHT=3;
    int WIDTH = 3;//默认为常量，隐式的指定为 public static final 修饰

    //成员：抽象方法
    //接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract（只能是 public abstract，其他修饰符都会报错）。
    public void in();
    public void out();
}
