package august.bao0817.generic_;

import java.util.*;

/**
 * @ClassName Test4
 * @Description 自定义泛型
 * @Author CQ
 * @Date 2022/8/17 15:59
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {

        //自定义泛型:
        Teacher<Integer , String> t1 = new Teacher();

        t1.tid = 1;
        t1.subject = "java";

        //泛型类型的限制: 泛型的限定.
        //      <? super E>     表示支持传入: E类型或其父类类型.
        //      <? extends E>   表示支持传入: E类型或其子类类型.
        //      <?>     表示任意类型.

        User<String> u1 = new User();

        Teacher<Integer , String> t2 = new Teacher();
        t2.teach( u1 );

        //练习测试: TreeSet集合有一个addAll()演示他的泛型限定效果.


    }
}
//模拟1个老师:
class Teacher<A, B>{

    A tid;
    B subject;

    public void teach( User<? extends B> user ){
        System.out.println("模拟同学上课: " + user.s1);
    }

}

//定义用户类:
class User<S>{

    //表示专业:
    S s1;


}