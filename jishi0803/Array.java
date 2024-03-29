package jishi0803;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Array
 * @Description 键盘接收10个整数，保存在数组中，对这10个整数从小到大进行排序并输出。
 * @Author CQ
 * @Date 2022/8/3 16:23
 * @Version 1.0
 */
public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入10个整数：");
        int[] array=new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数：");
            array[i]= input.nextInt();
        }

        System.out.println("10个整数从小到大排序：");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }
}
