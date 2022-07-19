package bao0719;

/**
 * @ClassName Demo
 * @Description
 * ①用for双循环输出9行每行9个*符号
 * ②用for双循打印*直角三角形
 * ③九九乘法表
 * @Author CQ
 * @Date 2022/7/19 13:49
 * @Version 1.0
 */
public class Demo {
    public static void main(String[] args) {
        //外循环执行一次，会让内循环执行一整轮
        /*
        for (int i = 1; i <= 9; i++) {
            //内循环打印一行9个*符号
            for (int j = 1; j <=9 ; j++) {
                System.out.print("*\t");
            }
            //换行
            System.out.println("");
        }*/

        //用*打印直角三角形
        /*
        for (int i = 1; i <= 9; i++) {
            //内循环每次打印i个*符号
            for (int j = 1; j <=i ; j++) {
                System.out.print("*\t");
            }
            //换行
            System.out.println("");
        }*/

        //打印九九乘法表

        for (int i = 1; i <= 9; i++) {
            //
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            //换行
            System.out.println("");
        }

    }
}
