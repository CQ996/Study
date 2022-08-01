package august.ba0801.farm;

/**
 * @ClassName Corn
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/1 14:12
 * @Version 1.0
 */
public class Corn {
    public Corn(){

    }
    public Corn(double money){
        this.money=money;
    }
    public Corn(double money,int time1){
        this.money=money;
        this.time1=time1;
    }
    String name="玉米";
    String state="成长期";
    int time1=8;
    int time2=3;
    int fruit=200;
    double money;
    public void show(){
        System.out.println("*****作物特性*****");
        System.out.println("你种植了"+name+",");
        System.out.println("成长期"+time1+"天，采摘期"+time2+"天，产量"+fruit+"斤，现在处于"+state+"，");
        System.out.println(name+"属于农作物，收割机费用："+money+"元。");
    }
    public void state(){
        System.out.println("现在"+name+"处于"+state);
    }
}
