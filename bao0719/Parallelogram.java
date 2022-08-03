package bao0719;

/**
 * @ClassName Parallelogram
 * @Description 双循环输出平行四边形
 * @Author CQ
 * @Date 2022/7/19 15:25
 * @Version 1.0
 */
public class Parallelogram {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 5-i; j >=1 ; j--) {
                System.out.print(" ");
            }
            System.out.println("*****");
        }
    }
}
