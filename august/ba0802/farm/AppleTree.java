package august.ba0802.farm;

/**
 * @ClassName Apple
 * @Description 苹果树类
 * @Author CQ
 * @Date 2022/8/1 14:12
 * @Version 1.0
 */
public class AppleTree extends Crop{

   public AppleTree(){

       name="苹果树";
       //this.setName("苹果树");
       this.setGroTime(10);
       this.setHavrsTime(2);
       this.setNumsFruit(100);
       this.setStatus(GROW);
       this.setHarvested(true);

   }
/*
   public AppleTree(String name,int groTime,int havrsTime,int numsFruit,String status,boolean isHarvested){
       super.setGroTime(groTime);
       this.brand=brand;
   }
   */
 /*
    public AppleTree(String name,int groTime,int havrsTime,int numsFruit,String status,boolean isHarvested){
        name="苹果树";
        this.setGroTime(10);
        this.setHavrsTime(2);
        this.setNumsFruit(100);
        this.setStatus(GROW);
        this.brand=brand;
    }
*/
    //嫁接新品种
    public void grafting(String newBrand){
        if(this.brand.equals(newBrand)){
            System.out.println("同品种果树无需嫁接！");
        }else {
            this.brand=newBrand;
            System.out.println("经过嫁接，"+super.getName()+"的品种变为："+this.brand);
        }
    }

   public AppleTree(String name,int groTime,int havrsTime,int numsFruit,String status,boolean isHarvested,String brand){
       this.name=name;
       this.setGroTime(groTime);
       this.setHavrsTime(havrsTime);
       this.setNumsFruit(numsFruit);
       this.setStatus(status);
       this.brand=brand;
       //super.setGroTime(groTime);
   }
   public AppleTree(String brand){
       this.setBrand(brand);//私有封装
       //this.brand=brand;//公有本类
   }

    public String brand;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }




    @Override//子类重写父类的方法，方法名需要相同，返回值类型需要一致或是其子类
    public void show(){

        System.out.println("*****作物特性*****");
        System.out.println("你种植了"+name+",");
        System.out.println("成长期"+this.getGroTime()+"天，采摘期"+this.getHavrsTime()+"天，" +
                "果实数量"+this.getNumsFruit()+"个，现在处于"+this.getStatus()+"，");
        //super.show();
        System.out.println(name+"属于水果作物，品种："+brand+"。");
    }

    @Override
    public void state() {
        /*super.state();*/
        System.out.println("现在"+name+"处于"+this.getStatus());
        System.out.println("已经生长了5天，距离收获还有5天！");
    }
}
