package bao0718;

import java.util.Scanner;

/**
 * @ClassName FanInteraction
 * @Description 插入新的粉丝互动数据，依然保持从多到少排序
 * @Author CQ
 * @Date 2022/7/18 15:51
 * @Version 1.0
 */
public class FanInteraction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []fans=new int[7];
        fans=new int[]{326,301,278,232,205,178,0};
        System.out.println("原粉丝互动数：");
            for(int i=0;i<fans.length;i++){
                System.out.print(fans[i]+"\t");
        }
        int index= fans.length;//存储插入位置 7
        System.out.println("\n新插入粉丝互动数：");
        int insertNum= input.nextInt();//输入遗漏的数字
        for (int i = 0; i < fans.length; i++) {
            if(insertNum>fans[i]){
                index=i;//比如插入299，此时index=3
                break;//如果break不写，会继续循环
            }
        }
        //把7的位置空出来 此时假设插入299，index=3
        //循环移动位置 插入位置后元素依次后移
        for (int i = fans.length-1; i >=index ; i--) {
            fans[i]=fans[i-1];
        }
        //插入新数字
        fans[index]=insertNum;
        //正常打印
        System.out.println("\n更新后的粉丝互动数：");
        for (int i = 0; i < fans.length ; i++) {
            System.out.print(fans[i]+"\t");
        }

    }



}
