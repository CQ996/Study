package bao0728.orderingMgr;

/**
 * @ClassName OrderingSet
 * @Description 添加订单的6个属性
 * @Author CQ
 * @Date 2022/7/28 21:08
 * @Version 1.0
 */
public class OrderingSet {
    //订餐人姓名
    String[] name=new String[4];
    //选择菜品信息
    String[] dishMegs=new String[4];
    //菜品单价
    double[] priceCai=new double[4];
    //点赞信息
    int[] praise={0,0,0,0};
    //送餐时间
    int[] times=new int[4];
    //送餐地址
    String[] addresses=new String[4];
    //订单状态： 0：已预订 1：已完成
    int[] states= new int[4];
    //总金额
    double[] sumPrices=new double[4];


}
