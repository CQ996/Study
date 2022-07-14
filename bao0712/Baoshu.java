package bao0712;

/**
 * @ClassName Baoshu
 * @Description 报数游戏，输出100以内含7或者7倍数的数字。
 * @Author CQ
 * @Date 2022/7/12 16:05
 * @Version 1.0
 */
public class Baoshu {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7) {
                System.out.println(i);
            }
        }
    }
}
