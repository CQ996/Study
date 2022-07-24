package bao0720;

import java.util.Scanner;

/**
 * @ClassName Array
 * @Description 键盘任意输入数字，和数据中的数字对比是否存在。
 * @Author CQ
 * @Date 2022/7/20 8:51
 * @Version 1.0
 */
public class Array001 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []array={8,4,2,1,23,344,12};
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("第一个数是："+array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            sum +=array[i];
        }
        System.out.println("所有数求和："+sum);
        System.out.println("请输入一个任意数字：");
        int num= input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(num==array[i]){
                System.out.println("数列中已包含此数。");
            }else {
                System.out.println("数列中不包含此数。");
            }
        }
    }
}
