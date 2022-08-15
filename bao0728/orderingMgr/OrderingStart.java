package bao0728.orderingMgr;

/**
 * @ClassName OrderingMgr
 * @Description 吃货大联盟订餐系统
 * @Author CQ
 * @Date 2022/7/28 21:11
 * @Version 1.0
 */
public class OrderingStart {
    public static void main(String[] args) {
        OrderingUtil oUtil=new OrderingUtil();
        oUtil.initial();
        oUtil.startMenu();
    }
}
