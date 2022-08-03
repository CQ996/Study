package august.ba0802.farm;

/**
 * @ClassName Crop
 * @Description 父类：玉米、苹果树
 * @Author CQ
 * @Date 2022/8/2 13:56
 * @Version 1.0
 */
public class Crop {
    public Crop(){

/*
        name="苹果树";
        //this.setName("苹果树");
        setGroTime(10);
        setHavrsTime(2);
        setNumsFruit(100);
        setStatus("成长期");
        setHarvested(true);
*/

    }
    public Crop(String name,int groTime,int havrsTime,int numsFruit,String status,boolean isHarvested){
        this.name=name;
        this.groTime=groTime;
        this.havrsTime=havrsTime;
        this.numsFruit=numsFruit;
        this.status=status;
        this.isHarvested=isHarvested;
    }

    public void show(){
        System.out.println("*****作物特性*****");
        System.out.println("你种植了"+name+",");
        System.out.println("成长期"+this.getGroTime()+"天，采摘期"+this.getHavrsTime()+"天，" +
                "果实数量"+this.getNumsFruit()+"，现在处于"+this.getStatus()+"，");
    }

    public void state(){
        System.out.println("现在"+name+"处于"+this.getStatus());
    }

    protected String name;
    private int groTime;
    private int havrsTime;
    private int numsFruit;
    private String status;
    private boolean isHarvested;

    public static final String GROW = "生长期";
    public static final String MATURE = "采摘期";
    public static final String DEAD = "已死亡";

    //public boolean isHarvested=false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroTime() {
        return groTime;
    }

    public void setGroTime(int groTime) {
        this.groTime = groTime;
    }

    public int getHavrsTime() {
        return havrsTime;
    }

    public void setHavrsTime(int havrsTime) {
        this.havrsTime = havrsTime;
    }

    public int getNumsFruit() {
        return numsFruit;
    }

    public void setNumsFruit(int numsFruit) {
        this.numsFruit = numsFruit;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isHarvested() {
        return isHarvested;
    }

    public void setHarvested(boolean harvested) {
        isHarvested = harvested;
    }







}
