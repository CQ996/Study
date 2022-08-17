package august.bao0817.generic_;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenericDome02
 * @Description 泛型使用细节
 * @Author CQ
 * @Date 2022/8/17 10:59
 * @Version 1.0
 */
public class GenericDetail {
    public static void main(String[] args) {
        //1.泛型只能是引用数据类型
        //2.在给泛型指定类型后,可以传入该类新或其子类型
        //因为 E 指定了 A 类型，构造器传入了new A()
        pig<A> apig = new pig<A>(new A());
            apig.f();
        pig<A> apig2 = new pig<A>(new B());
            apig2.f();
        //3.泛型的使用形式
        //编译器会进行类型推断，右边泛型可以为空
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();

        //4.泛型默认是Object
        ArrayList arrayList = new ArrayList();//等价下面
        //ArrayList<Object> arrayList = new ArrayList<>();

        //Tiger tiger = new Tiger();
    }
}
class Tiger<E>{
    E e;

    public Tiger(E e) {
        this.e = e;
    }
}

class A{}
class B extends A{}

class pig<E>{
    E e;

    public pig(E e) {
        this.e = e;
    }
    public void f(){
        System.out.println(e.getClass());
    }
}