package bao0726;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName Sort
 * @Description 用数组给游记标题排序,添加游记其他信息
 * @Author CQ
 * @Date 2022/7/26 22:41
 * @Version 1.0
 */
public class Sort {
    Scanner input=new Scanner(System.in);
    String[] titles ={"版纳雨林游","北海道冬日约会","马背上的乘风破浪","彩云之南","来三亚摆拍吧"};
    //作者
    String[] names=new String[5];
    //行程天数
    int[] days=new int[5];
    //游记内容
    String[] content=new String[5];
    //虾币数
    int[] xiabi=new int[5];
    public void show1(){
        System.out.println("********排序前*******");
        for (int i = 0; i < 5; i++) {
            System.out.println(titles[i]);
        }
    }
    /*
    public void paixu(String[] aaa){
        for (int i = 0; i < aaa.length; i++) {
            titles =aaa;
        }
    }
    */
    public void show2(){
        System.out.println("********排序后*******");
        Arrays.sort(titles);
        for (int i = 0; i < 5; i++) {
            System.out.println(titles[i]);
        }
    }

    public void add(){
        String[] ccc={"请添加游记信息："};
        for (int i = 0; i < titles.length ; i++) {
            System.out.println("请添加第"+(i+1)+"篇游记作者：");
            names[i]= input.next();
            System.out.println("请添加第"+(i+1)+"篇游记行程天数：");
            days[i]= input.nextInt();
            System.out.println("请添加第"+(i+1)+"篇游记虾币数：");
            xiabi[i]= input.nextInt();
            System.out.println("请添加第"+(i+1)+"篇游记内容：");
            content[i]= input.next();
        }
    }
    public void show3(){
        for (int i = 0; i < titles.length; i++) {
            System.out.println("标题："+titles[i]+"\t"+"作者："+names[i]+"\t"+"行程天数："+days[i]+"\t"+"虾币数："+xiabi[i]);
            System.out.println("游记内容："+content[i]);
            System.out.println("*********************");
        }

    }

}
