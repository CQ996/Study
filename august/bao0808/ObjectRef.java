package august.bao0808;

/**
 * @ClassName ObjectRef
 * @Description 引用和对象的详细解说
 * @Author CQ
 * @Date 2022/8/8 5:40
 * @Version 1.0
 */
public class ObjectRef {

    //'''基本类型的参数传递'''
    public static void testBasicType(int m) {
        System.out.println("m=" + m);//m=50
        m = 100;
        System.out.println("m=" + m);//m=100
    }
   //'''参数为对象，不改变引用的值'''
           //'''s即sMain指向的对象执行了append方法，在原来的字符串上加了段“_add”'''

    public static void add(StringBuffer s) {
        s.append("_add");
    }

    //'''参数为对象，改变引用的值 '''
            //'''引用变量指向了一个新的对象，已经不是sMain指向的对象了'''
    public static void changeRef(StringBuffer s) {
        s = new StringBuffer("Java");
    }

    public static void main(String[] args) {
        int i = 50;
        testBasicType(i);
        System.out.println(i);//'''i=50'''
        StringBuffer sMain = new StringBuffer("init");
        System.out.println("sMain=" + sMain.toString());//'''sMain=init'''
        add(sMain);
        System.out.println("sMain=" + sMain.toString());//'''sMain=init_add'''
        changeRef(sMain);
        System.out.println("sMain=" + sMain.toString());//'''sMain=Java'''
    }
}
