package ChengqianJishi0713;
import java.util.Scanner;
/**
 * @ClassName Pingjun
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/14 8:54
 * @Version 1.0
 */

public class Pingjun{
    public static void main(String[] args){
        Scanner pingjun = new Scanner(System.in);
        System.out.println("请输入需要计算的科目（人）数");
        int shuliang = pingjun.nextInt();//单位数必须是个整数，所以用int声明变量
        double num = 0;
        //声明变量i来完成循环，如果i小于或等于shuliang（之前接收的用户输入的单位数），那么i++
        for(int i = 1;i <= shuliang;i++){
            System.out.println("请输入第" + i + "个科目（人）成绩");
            //分数（单位的值）可能是个小数，所以用double声明变量来接收
            double chengji = pingjun.nextDouble();
            num = num + chengji;
        }
        double avg=num / shuliang;
        System.out.println(avg);
    }
}

