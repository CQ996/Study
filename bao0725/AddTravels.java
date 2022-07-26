package bao0725;

import java.util.Scanner;

/**
 * @ClassName AddTravels
 * @Description 游记类——通过带参方法 循环添加游记标题 再输出
 * @Author CQ
 * @Date 2022/7/25 17:05
 * @Version 1.0
 */
public class AddTravels {
    String answer;
    String[] titles=new String[4];
    Scanner input=new Scanner(System.in);
    public void add(String title){
        for (int i = 0; i < titles.length; i++) {
            if(titles[i]==null){
                titles[i]=title;
                break;
            }
        }
    }
    public void youji(){
        for (int i = 1; i <=4; i++) {
            System.out.println("请输入游记标题：");
            String title=input.next();
            add(title);
            if(i==4){
                break;
            }
            System.out.println("是否继续发布游记？(y/n)");
            answer=input.next();
            if(!answer.equals("y")){
                break;
            }
        }
    }
    public void show(){
        System.out.println("********我的游记********");
        for (int i = 0; i < titles.length; i++) {
            if(titles[i]!=null){
                System.out.println(titles[i]);
            }
        }
    }
    public void modify(){
        while (2>1){
            int i=0;
            i++;
            System.out.println("请输入需要修改的游记标题：");
            String title=input.next();
            if (title.equals(titles[i])){
                System.out.println("请输入新标题：");
                titles[i]=input.next();
                System.out.println("*******修改结果*******");
                System.out.println("游记标题修改成功");
                break;
            }else {
                System.out.println("没有这个标题！");
            }
        }
    }
}
