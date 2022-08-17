package august.bao0817.generic_;

/**
 * @ClassName GenericDome01
 * @Description 泛型:定义泛型类
 * @Author CQ
 * @Date 2022/8/17 10:42
 * @Version 1.0
 */
public class GenericDome01 {
    public static void main(String[] args) {
        ////E数据类型是在定义person对象的时候指定的，即在编译期间就确定E是什么类型
        Person<String> str = new Person<String>("你好");
        Person<Integer> intt = new Person<>(100);
        System.out.println(str.s);
        System.out.println(intt.s);
        str.show();//输出数据类型：String
    }
}
//泛型的作用是：可以在类声明时通过一个标识表示类中某个属性的类型
//或者是某个方法的返回值类型，或者是参数类型

class Person<E>{
    E s;//用E表示s的数据类型，该数据类型是在定义person对象的时候指定的，即在编译期间就确定E是什么类型

    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }
    public E f(){//E也可以是返回类型
        return s;
    }
    public void show(){
        System.out.println(s.getClass());//输出s的运行类型
    }
}