package bao0721;

/**
 * @ClassName Monkey
 * @Description 定义类——猴子
 * @Author CQ
 * @Date 2022/7/21 14:01
 * @Version 1.0
 */
public class Monkey {
    //属性和方法
    public String name;//名称
    public String type;//种类
    public String color;//颜色
    public int taillength;//尾长
    //跳跃方法
    public void jump(){
        System.out.println("小猴子"+name+"正在跳来跳去");
    }
    //爬树方法
    public void clmb(){
        System.out.println("小猴子"+name+"正在爬树");
    }
    //显示信息方法
    public void show(){
        System.out.println("小猴子名称："+name+"，种类："+type+"，颜色："+color+"，尾长："+taillength);
    }
}
