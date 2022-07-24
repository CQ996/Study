package bao0722;

/**
 * @ClassName TouristsNumber
 * @Description 客流量类——计算三天的总客流量，日均客流量
 * @Author CQ
 * @Date 2022/7/22 15:35
 * @Version 1.0
 */
public class TouristsNumber {
    int day1;
    int day2;
    int day3;
    public void show(){
        int sum=(day1+day2+day3);
        int average=sum/3;
        System.out.println("三天总客流量为："+sum);
        System.out.println("日均客流量为："+average);
    }
}
