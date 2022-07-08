package bao0706;

public class HelloMoney {
    public static void main(String[]args){
        //原本金额200元 旺季上调50%
        //定义变量并赋值
        //int money=200;
        int money=200;
        System.out.println("淡季酒店金额："+money+"元");
        //旺季酒店价格上调50%
        money=(int)(money+money*0.5);
        System.out.println("旺季酒店金额："+money+"元");
        //final定义常量全部大写
        //只能赋值一次，定义常量并赋值或者定义常量后赋值
    }
}
