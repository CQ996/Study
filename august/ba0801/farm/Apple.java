package august.ba0801.farm;

/**
 * @ClassName Apple
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/1 14:12
 * @Version 1.0
 */
public class Apple {
    public Apple(){}
    public Apple(String brand){
        this.brand=brand;
    }
    public Apple(String brand,int time1){
        this();//调用无参
        this.brand=brand;
        this.time1=time1;
    }
    String name="苹果树";
    String brand;
    String state="成长期";
    int time1=10;
    int time2=2;
    int fruit=100;
    public void show(){
        System.out.println("*****作物特性*****");
        System.out.println("你种植了"+name+",");
        System.out.println("成长期"+time1+"天，采摘期"+time2+"天，果实数量"+fruit+"个，现在处于"+state+"，");
        System.out.println(name+"属于水果作物，品种："+brand+"。");
    }
    public void state(){
        System.out.println("现在"+name+"处于"+state);
    }
}
