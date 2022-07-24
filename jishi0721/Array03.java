package jishi0721;

import java.util.Arrays;

/**
 * @ClassName Array03
 * @Description 定义两个数组，首先把两个数组合并成一个新数组，然后把新数组中的所有元素逆序排列
 * @Author CQ
 * @Date 2022/7/21 9:40
 * @Version 1.0
 */
public class Array03 {
    public static void main(String[] args) {
        int []array1={10,20,30};
        int []array2={40,50,60};
        //创建合并数组，其长度是array1和array2的长度之和
        int []arraySum=new int[array1.length + array2.length];
        System.out.print("第一个数组中的元素：");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+ "    ");
        }
        System.out.println("\n");
        System.out.print("第二个数组中的元素：");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+ "    ");
        }
        System.out.println("\n");
        System.out.print("两个数组合并后：");
        // 以array1和array2中的元素为基础为合并数组填充元素
        for (int i = 0; i < arraySum.length; i++) {
            if (i < array1.length) {
                arraySum[i] = array1[i];
            } else {
                arraySum[i] = array2[i - array1.length];
            }
        }
        // 遍历合并数组中的元素
        for (int i = 0; i < arraySum.length; i++) {
            System.out.print(arraySum[i] + "    ");
        }
        System.out.println("\n");
        System.out.print("逆序后：");
        Arrays.sort(arraySum);
        for (int i = arraySum.length-1; i >=0; i--) {
            System.out.print(arraySum[i] + "    ");
        }

    }
}
