package bao0725;

/**
 * @ClassName Kuangshen
 * @Description 可变参数的传参
 * @Author CQ
 * @Date 2022/7/25 9:40
 * @Version 1.0
 */
public class Kuangshen {
    public static void main(String[] args) {
        /*
        for (int i = 0; i < args.length; i++) {
            System.out.println("args【"+i+"】:"+args[i]);
        }
        */
        Kuangshen kuangshen = new Kuangshen();
        kuangshen.test(1,2,3,4,5);
    }
    //一个方法只能有一个可变参数，且必须是最后声明
    public void test(int...i){
        System.out.println(i[0]);
        System.out.println(i[1]);
        System.out.println(i[2]);
        System.out.println(i[3]);


    }
}
