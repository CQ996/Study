package bao0718;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Dome
 * @Description 数组排序，从小到大；求最大值。
 * @Author CQ
 * @Date 2022/7/18 13:50
 * @Version 1.0
 */
public class Dome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个数字：");
            nums[i] = input.nextInt();
        }

        //数组排序，从小到大
        /*Arrays.sort(nums);
        System.out.print("从小到大排序：");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
        //从大到小排序
        System.out.print("从大到小排序：");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
        }*/

        //求最大值
        int max=nums[0];
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("最大值为："+max);

    }
}
