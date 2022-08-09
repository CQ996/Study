package august.bao0809;

import java.util.Scanner;

/**
 * @ClassName Achievement
 * @Description 模拟输入成绩，自定义异常
 * @Author CQ
 * @Date 2022/8/9 17:43
 * @Version 1.0
 */
public class Achievement {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入考试成绩：");
        int num=in.nextInt();
        if(num<0 || num>100){
            throw new FenException("请输入正确的成绩信息！");
        }
        System.out.println("你的考试分数为："+num);
    }

    public static class FenException extends RuntimeException{
        public FenException(String xinxi){
            super(xinxi);
        }
    }
}
