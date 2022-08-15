package august.bao0803.petShop;

/**
 * @ClassName Pets
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 18:12
 * @Version 1.0
 */
public class Pets {
    public Pets(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getIntimacy() {
        return intimacy;
    }

    public void setIntimacy(int intimacy) {
        this.intimacy = intimacy;
    }

    //昵称
    private String name;
    //健康值
    private int healthy=60;
    //亲密度
    private int intimacy;


    public Pets(String name,int healthy,int intimacy){
        this.name=name;
        this.healthy=healthy;
        this.intimacy=intimacy;
    }

    //输出信息
    public void print(){
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫"+name+",健康值是"+healthy+",和主人的亲密度是"+intimacy);
    }


}
