package bao0728;

import java.util.Scanner;

/**
 * @ClassName Demo1
 * @Description StringBuffer的追加方法
 * @Author CQ
 * @Date 2022/7/28 13:49
 * @Version 1.0
 */
public class Demo1 {
    public static void main(String[] args) {
        double[]scores=new double[3];
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入评分：");
            scores[i]=input.nextDouble();
        }
        //输出
        StringBuffer sb=new StringBuffer("【");
        for (int i = 0; i < scores.length; i++) {
            sb.append(scores[i]);
            sb.append("#");
        }
        sb.append("】");
        System.out.println(sb);

        /*StringBuffer buffer = new StringBuffer("hello,");    // 创建一个 StringBuffer 对象
        String str = "World!";
        buffer.append(str);    // 向 StringBuffer 对象追加 str 字符串
        System.out.println(buffer);    // 输出：Hello,World!*/
    }
}
