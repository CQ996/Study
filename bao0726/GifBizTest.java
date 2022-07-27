package bao0726;

import java.util.Scanner;

/**
 * @ClassName GifBizTest
 * @Description 输出测试
 * @Author CQ
 * @Date 2022/7/26 16:03
 * @Version 1.0
 */
public class GifBizTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        GifBus ddd=new GifBus();
        for (int i = 0; i <3 ; i++) {
            GifBiz ccc=new GifBiz();
            System.out.println("请输入名称：");
            ccc.name=input.next();
            System.out.println("请输入价格：");
            ccc.price=input.nextDouble();
            System.out.println("请输入产地：");
            ccc.address=input.next();
            ddd.setAdd(ccc);
        }
        ddd.getGif();//调用显示方法数组

    }
}
