package august.bao0809;

import java.util.Scanner;

/**
 * @ClassName Test4
 * @Description 模拟购物方法,抛出异常，自定义异常
 * @Author CQ
 * @Date 2022/8/9 16:21
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num;
        double money;
        //模拟购物方法（需要传入：购物商品数量，银行卡余额）
        //内部逻辑：1、检查数量不能超出1份，如果超出，则抛出数量限制异常
        //        2、银行卡余额不少于100元，如果少，则抛出余额不足异常

        //测试：主方法调用并传递测试数据完成测试，如果产生异常，将捕获并给予温馨提示。
        System.out.println("请输入你的购买数量：");
        num=in.nextInt();
        if (num >=1){
            //这里我们可以通过构造器，设置信息
            throw new YEBZException("超出数量限制");
        }
        System.out.println("没毛病！");

//        System.out.println("请输入你的购买数量和银行卡余额：");
//        num=in.nextInt();
//        money=in.nextDouble();
//            try {
//                shop(num,money);
//            }catch (Exception e){
//                e.printStackTrace();
//            }

    }

//    public static void shop(int num,double money)throws Exception{
//        if(num>1){
//            Exception e1=new Exception("超出数量限制");
//            throw e1;
//        }
//        if(money<100){
//            Exception e1=new Exception("余额不足");
//            throw e1;
//        }
//
//    }

    static class YEBZException extends RuntimeException {
        public YEBZException(String message) {//构造器
            super(message);
        }
    }

}
