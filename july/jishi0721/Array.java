package july.jishi0721;

import java.util.Scanner;
import java.util.Arrays;
/**
 * @ClassName Array
 * @Description 循环入数组的值，要求对数组降序排序输出，求出数组中所有的数之和，求最大值，最小值，平均值。
 * @Author CQ
 * @Date 2022/7/21 8:42
 * @Version 1.0
 */
public class Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        double average=0.0;
        //int []array={9,1,0,4,2,6,3,8,7,5};

        System.out.println("请录入数组的值：");
        int []array=new int[10];
        for (int i = 0; i < array.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数：");
            array[i]= input.nextInt();
        }

        System.out.println("数组中的数为：");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n");
        System.out.println("升序排序后为：");
        //先升序
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("\n");
        //再降序
        System.out.println("降序排序后为：");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]+"\t");
        }
        System.out.println("所有数之和为：");
        for (int i = array.length-1; i >=0; i--) {
            sum+=array[i];
        }
        System.out.println(sum);
        System.out.println("最小值为：");
        int min=array[0];
        for (int i = array.length-1; i >=0; i--) {
            if (min>array[i]){
                min=array[i];
            }
        }
        System.out.println(min);
        System.out.println("最大值为：");
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println(max);
        System.out.println("平均值为：");
        average=(double)sum/array.length;
        System.out.println(average);
    }
}
