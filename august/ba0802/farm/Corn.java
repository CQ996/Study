package august.ba0802.farm;

/**
 * @ClassName Corn
 * @Description 玉米类
 * @Author CQ
 * @Date 2022/8/1 14:12
 * @Version 1.0
 */
public class Corn extends Crop{
    public Corn(){

        name="玉米";
        this.setGroTime(8);
        this.setHavrsTime(3);
        this.setNumsFruit(200);
        this.setStatus(GROW);
        this.setHarvested(true);

    }

/*
    public Corn(int groTime,int havrsTime,int numsFruit,String status,boolean isHarvested,double money){
        name="玉米";
        this.setGroTime(8);
        this.setHavrsTime(3);
        this.setNumsFruit(200);
        this.setStatus(GROW);
        this.setHarvested(true);
        this.money=getMoney(money);
    }
*/

    public double money;

    public double getMoney(double money) {
        return this.money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


    @Override
    public void show(){
        /*
        System.out.println("*****作物特性*****");
        System.out.println("你种植了"+name+",");
        System.out.println("成长期"+this.getGroTime()+"天，采摘期"+this.getHavrsTime()+"天，" +
                "产量"+this.getNumsFruit()+"斤，现在处于"+this.getStatus()+"，");
        */
        super.show();
        System.out.println(name+"属于农作物，收割机费用："+money+"元。");
    }

    @Override
    public void state() {
        super.state();
        System.out.println("已经生长了7天，距离收获还有1天！");
    }
}
