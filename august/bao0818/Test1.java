package august.bao0818;

import java.util.Objects;

/**
 * @ClassName Test1
 * @Description equals和==的使用演示
 * @Author CQ
 * @Date 2022/8/18 14:12
 * @Version 1.0
 */
public class Test1 {

    public static void main(String[] args) {

        // equals  ==   区别.

        int a = 10;
        int b = 10;

        Integer c  = 10;
        Integer d = 10;

        Integer e = new Integer( 10 );
        Integer f = new Integer( 10 );


        // == ： 用于值数据比对,直接判断值是否相等.
        //       用于引用数据比对,直接判断 引用地址 是否相等.
        //       特殊: 比对值数据与引用数据, 将自动拆箱后进行比对.
        System.out.println( a == b );
        System.out.println( c == d );
        System.out.println( e == f );
        System.out.println( e == a );
        System.out.println( c == e );
        System.out.println("===========");

        String s1 = "小明";
        String s2 = "小明";

        String s3 = new String("小明");
        String s4 = new String("小明");

        System.out.println( s1 == s2 );
        System.out.println( s3 == s4 );
        System.out.println( s1 == s3 );
        System.out.println("===========");
        // equals ： 用于字符串对象比对,直接挨个判断每个字符值是否相等.
        System.out.println( s1.equals(s2) );
        System.out.println( s3.equals(s4) );
        System.out.println( s1.equals(s3) );


        //模拟两位同学:
        User user1 = new User( 1  , "mr.laowang" );
        User user2 = new User( 1  , "mr.laowang" );

        // == 直接比对对象:  那就是比对对象地址.
        System.out.println( user1 == user2 );

        //equals（Object类）默认提供: 那就是==比对.
        //System.out.println( user1.equals( user2 ) );

        //equals（子类重写后）提供: 那就是对象属性值比对.
        System.out.println( user1.equals( user2 ) );



    }


}

class User{
    int uid;
    String uname;

    public User(int uid , String uname){
        this.uid = uid;
        this.uname = uname;
    }

    //equals: 模拟重写Object父类的方法.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return uid == user.uid &&
                Objects.equals(uname, user.uname);
    }

}
