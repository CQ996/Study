package august.bao0809;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @ClassName EcmDef
 * @Description 输入两个数，判断 输入个数异常 输入数字格式异常 计算除0异常
 * @Author CQ
 * @Date 2022/8/9 18:30
 * @Version 1.0
 */
public class EcmDef {
    public static void main(String[] args) {
        String n1;
        String n2;
        int sel=0;
        String[] num = new String[sel];
        Scanner in=new Scanner(System.in);
        System.out.println("请选择输几个参数( 1 / 2 )：");
        sel=in.nextInt();
        if(sel==1){
            num = new String[sel];
            System.out.println("请输入一个参数：");
            n1= in.next();
            num[0]=n1;
        }else if(sel==2){
            num = new String[sel];
            System.out.println("请输入第一个参数：");
            n1= String.valueOf(in.nextInt());
            num[0]=n1;
            System.out.println("请输入第二个参数：");
            n2= in.next();
            num[1]=n2;
        }
        try {
            //验证参数个数是否为两个参数
            if(num.length !=2){
                //不是抛出数组异常
                throw new ArrayIndexOutOfBoundsException("参数个数不正确！");
            }
            //先把接收到的参数转成整数
            int a1=Integer.parseInt(num[0]);
            int a2=Integer.parseInt(num[1]);

            double result=cal(a1,a2);//该方法可能抛出算数异常：ArithmeticException

            System.out.println("计算结果是："+result);
        }catch (ArrayIndexOutOfBoundsException e){//数组越界异常
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){//数字格式异常
            System.out.println("数字格式不正确，请输入整数!");
        }catch (ArithmeticException e){//算数异常
            System.out.println("出现了除0的异常");
        }

    }

    public static double cal(int a1, int a2) {
        return a1 / a2;
    }
}
