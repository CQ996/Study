package bao0725;

import java.util.Scanner;

/**
 * @ClassName GifBizTest
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/25 16:40
 * @Version 1.0
 */
public class GifBizTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        GifBiz gifBiz=new GifBiz();//实例化纪念品对象
        for (int i = 1; i <=5; i++) {
            System.out.println("请输入第"+i+"个纪念品名字");
            String name=input.next();
            gifBiz.add(name);
        }
        gifBiz.show();
        System.out.println("请输入开始查找位置：");
        int start=input.nextInt();
        System.out.println("请输入结束查找位置：");
        int end=input.nextInt();
        System.out.println("请输入纪念品名称：");
        String name=input.next();

        boolean flag=gifBiz.searchGif(start,end,name);
        if(flag){
            System.out.println("存在此纪念品");
        }else {
            System.out.println("不存在此纪念品");
        }
    }
}
