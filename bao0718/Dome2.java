package bao0718;

import java.util.Scanner;

/**
 * @ClassName Dome2
 * @Description 扑克从大到小排序，中间插入一位
 * @Author CQ
 * @Date 2022/7/18 14:26
 * @Version 1.0
 */
public class Dome2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int []cards=new int[7];
        cards=new int[]{13,11,10,7,6,4,0};
        //int[]insertCards=new int[7];
        System.out.println("原扑克点数：");
        for (int i = 0; i < cards.length; i++) {
            System.out.print(cards[i]+"\t");
        }
        int index= cards.length;//存储插入位置 7
        System.out.println("\n新插入扑克点数：");
        int insertNum=input.nextInt();
        for (int i = 0; i < cards.length; i++) {
            if(insertNum>cards[i]){
                index=i;//index=3
                break;//如果break不写，会继续循环
            }
        }
        //把7的位置空出来 index=3
        //循环移动位置 插入位置后元素依次后移
        for (int i = cards.length-1; i >=index ; i--) {
            cards[i]=cards[i-1];
        }
        //插入数据
        cards[index]=insertNum;
        System.out.println("现扑克点数位置：");
        for (int i = 0; i < cards.length ; i++) {
            System.out.print(cards[i]+"\t");
        }
    }
}
