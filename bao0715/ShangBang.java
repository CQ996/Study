package bao0715;

import java.util.Scanner;

/**
 * @ClassName ShangBang
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/15 16:25
 * @Version 1.0
 */
public class ShangBang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //输入游记
        String[]yj=new String[5];
        for (int i = 0; i <yj.length; i++) {
            System.out.println("第"+(i+1)+"篇游记标题：");
            yj[i]= input.next();;
        }
        //打印游记
        for (int i = 0; i <yj.length; i++) {
            System.out.println("*****本月上榜游记*****");
            System.out.println(yj[i]+"\t");
        }

    }


}
