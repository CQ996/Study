package august.bao0809;

/**
 * @ClassName NullPointer1
 * @Description 模拟空指针异常
 * @Author CQ
 * @Date 2022/8/9 17:39
 * @Version 1.0
 */
public class NullPointer1 {
    public static void main(String[] args) {
        String name=null;
        try {
            System.out.println(name.length());
        }catch (NullPointerException p){
                    System.out.println("空指针异常:" + p);
                }
    }
}
