package august.ba0801.virtualLife;

import java.util.Scanner;

/**
 * @ClassName Work
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/31 21:02
 * @Version 1.0
 */
public class Work {
    Scanner input=new Scanner(System.in);
    String[] siteList = {"咖啡厅", "便利店", "网吧", "超市", "西餐厅"};//打工地点列表
    double[] moeny={100.0,80.0,120.0,110.0,150.0};
    int[] power={25,20,35,30,35};
    //展示工作地点的方法
    public void showSites() {
        System.out.println("*********工作地点*********");
        for (int i = 0; i < siteList.length; i++) {
            System.out.println((i+1)+"."+siteList[i]);
        }
        System.out.println("请输入地点编号：");
        int choice=input.nextInt();
        initialSite(choice);
    }
    //打工地点初始化方法,根据传入的打工地点的编号，获取该打工地点的薪资和体力消耗值
    public double[] initialSite(int siteNum) {
        double[] arry=new double[5];
        arry[0]=moeny[siteNum];
        arry[1]=power[siteNum];
        return arry;
    }

}
