package bao0721;

import java.util.Scanner;

/**
 * @ClassName TravelsTest
 * @Description 修改游记测试
 * @Author CQ
 * @Date 2022/7/21 16:29
 * @Version 1.0
 */
public class TravelsTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Travels travels=new Travels();
        System.out.println("*****修改前*****");
        travels.titlename="版纳雨林游";
        travels.author="极火虾";
        travels.days=6;
        travels.xiabi=5;
        travels.content="西双版纳拥有珍惜的热带雨林！";
        travels.show();

        String titleinput;
        String []title={"版纳雨林游","四川骑熊猫","海南吃海鲜"};
        int choice;

        for (int i = 0; i <title.length; i++) {
            System.out.println("请输入需要修改的游记标题：");
            titleinput=input.next();
            if(titleinput.equals(title[i])){
                System.out.println("选择修改内容（1、行程天数。2、游记内容）：");
                choice=input.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("请重新输入行程天数：");
                        travels.days=input.nextInt();
                        break;
                    case 2:
                        System.out.println("请重新输入游记内容：");
                        travels.content=input.next();
                        break;
                    default:
                        System.out.println("您的输入有误");
                }
            }else{
                System.out.println("对不起，未查询到标题为"+titleinput+"的游记");
            }
            break;
        }
        System.out.println("*****修改结果*****");
        travels.show();
    }
}
