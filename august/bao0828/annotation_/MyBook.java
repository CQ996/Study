package august.bao0828.annotation_;

/**
 * @ClassName MyBook
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/27 11:29
 * @Version 1.0
 */


public @interface MyBook {
    //默认public，所以可以不写
    public String name();
    String[] authors();
    double price();
}
