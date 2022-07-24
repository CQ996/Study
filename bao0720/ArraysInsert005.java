package bao0720;

import java.util.Scanner;

/**
 * @ClassName ArraysInsert
 * @Description 数组插入数据，保持升序
 * @Author CQ
 * @Date 2022/7/20 9:38
 * @Version 1.0
 */
public class ArraysInsert005 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []score={99,85,82,63,60,0};
        System.out.println("请输入新增成绩：");
        int insertNum=input.nextInt();
        int index= score.length;//存储插入位置,目前是5
        for (int i = 0; i < score.length; i++) {
            if(insertNum>score[i]){
                index=i;
                break;//停止循环
            }
        }
        //循环移动位置 插入位置后元素依次后移
        for (int i=score.length-1;i>=index;i--){
            score[i]=score[i-1];
        }
        score[index]=insertNum;
        System.out.println("插入成绩的下标是："+index);
        System.out.println("插入后的成绩是：");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i]+"\t");
        }
    }

}
