package jishi0803;

import jishi0803.Array;

import java.util.Arrays;

/**
 * @ClassName Array03
 * @Description 【写法二】定义两个数组，首先把两个数组合并成一个新数组，然后把新数组中的所有元素逆序排列
 * @Author CQ
 * @Date 2022/8/5 9:09
 * @Version 1.0
 */
public class Array03 {
    public static void main(String[] args) {
        int[] array1={10,20,30};
        int[] array2={40,50,60};
        int[] array3=new int[6];
        for (int i = 0; i < array1.length; i++) {
            array3[i]=array1[i];
        }
        for (int i = 0; i < array3.length; i++) {
            if(array3[i]==0){
                array3[i]=array2[i-3];
            }
        }
        System.out.println("合并后数组为：");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]+" ");
        }
        System.out.println("逆序后数组为：");
        Arrays.sort(array3);
        for (int i = array3.length-1; i >=0 ; i--) {
            System.out.print(array3[i]+" ");
        }
    }
}
