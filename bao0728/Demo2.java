package bao0728;

import java.util.Scanner;

/**
 * @ClassName Demo2
 * @Description 利用StringBuffer类和insert类实现在手机号插入空格
 * @Author CQ
 * @Date 2022/7/28 14:01
 * @Version 1.0
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入手机号：");
        String phone=input.next();
        StringBuffer sb=new StringBuffer(phone);
        int pos=sb.length()-1;
        while (pos-3>0){
            sb.insert(pos-3," ");
            int index=sb.indexOf(" ");
            pos=index-1;
        }
        System.out.println(sb);
    }
}
