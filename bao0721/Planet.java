package bao0721;

/**
 * @ClassName Planet
 * @Description 行星类1——定义属性
 * @Author CQ
 * @Date 2022/7/21 15:01
 * @Version 1.0
 */
public class Planet {
    public String name;//名称
    public int diameter;//直径
    public int rotationDay;//自转周期
    public int gongzhuan;//公转
    public String remark;//简述

    //自转
    public void rotation(){
        System.out.println(name+"自转一周需要"+rotationDay+"日");
    }
    //公转
    public void gongZhuans(){
        System.out.println(name+"公转一周需要"+gongzhuan+"日");
    }
    //信息
    public void show(){
        System.out.println("名称"+name+"直径"+diameter+"自转周期"+rotationDay+"公转周期"+rotationDay);
        System.out.println("简述："+remark);
    }
}
