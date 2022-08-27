package august.bao0828.annotation_;

/**
 * @ClassName AnnotationDemo02
 * @Description 认识元注解：.@Target和Retention
 * @Author CQ
 * @Date 2022/8/27 11:48
 * @Version 1.0
 */
//@MyTest//只能注解类和成员变量
public class AnnotationDemo02 {
    @MyTest
    private String name;

    @MyTest
    public void add(){}

    public static void main(String[] args) {

    }
}
