package bao0722;

/**
 * @ClassName Customer
 * @Description 客户积分回馈类
 * @Author CQ
 * @Date 2022/7/22 9:07
 * @Version 1.0
 */
public class Customer {
    int integral;
    String card;
    public void show(){
        System.out.println("客户的积分为："+integral+"，会员卡种类为："+card);
        if(card.equals("金卡") && integral>1000){
            System.out.println("回馈积分500分！");
        }else if(card.equals("普卡") && integral>5000){
            System.out.println("回馈积分500分！");
        }
    }


}
