package bao0725;

import java.util.Scanner;

/**
 * @ClassName AddTravelsTest
 * @Description 循环添加游记标题再输出测试
 * @Author CQ
 * @Date 2022/7/25 17:10
 * @Version 1.0
 */
public class AddTravelsTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        AddTravels addTravels=new AddTravels();
        for (int i = 1; i <=4; i++) {
            System.out.println("请输入游记标题：");
            String title=input.next();
            addTravels.add(title);
            if(i==4){
                break;
            }
            System.out.println("是否继续发布游记？(y/n)");
            addTravels.answer=input.next();
            if(!addTravels.answer.equals("y")){
                break;
            }
        }
            addTravels.show();

            while (2>1){
                int i=0;
                i++;
                System.out.println("请输入需要修改的游记标题：");
                String title=input.next();
                if (title.equals(addTravels.titles[i])){
                    System.out.println("请输入新标题：");
                    addTravels.titles[i]=input.next();
                    System.out.println("*******修改结果*******");
                    System.out.println("游记标题修改成功");
                    break;
                }else {
                    System.out.println("没有这个标题！");
                }
            }



    }
}
