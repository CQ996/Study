package bao0726;

/**
 * @ClassName Price
 * @Description 数组传参求纪念品平均价和最大价格
 * @Author CQ
 * @Date 2022/7/26 15:19
 * @Version 1.0
 */
public class Price {
    double money;
    double sum;
    public double getvge(double[] moneys){
        for (int i = 0; i < moneys.length; i++) {
            money = moneys[i];
            sum +=money;
        }
        double vge=sum/moneys.length;
        return vge;
    }
    public double getmax(double[] moneys){
        double max=moneys[0];
        for (int i = 0; i < moneys.length; i++) {
            if(max<moneys[i]){
                max=moneys[i];
            }
        }
        return max;
    }
}
