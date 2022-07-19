package bao0718;

import java.util.Scanner;

/**
 * @ClassName ChengFa
 * @Description for双循环乘法口诀表
 * @Author CQ
 * @Date 2022/7/18 17:18
 * @Version 1.0
 */
public class ChengFa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //外层循环控制行数为9行
        for (int i = 1; i <= 9; i++){
            String multiply = " ";
            //内层循环控制列数为9列
            for (int j = 1 ; j <= i ; j++){
                ////字符串拼接，j为列第一个数字，i为行第二个数字，在加上i乘以j就等于数值
                multiply += j + "*" + i + "=" + (i*j) + " ";
            }
            //每打印完一行内容后，进行换行操作，循环内打印
            System.out.println(multiply);
        }
    }
}
