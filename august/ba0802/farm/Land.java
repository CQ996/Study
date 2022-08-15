package august.ba0802.farm;

/**
 * @ClassName Land
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/4 14:09
 * @Version 1.0
 */
public class Land {

    boolean idle=true;//土地空闲
    //定义父类的对象，实例化子类的对象
    //Crop crop=new AppleTree();
    public void pland(Crop crop){
        if(idle==false){
            System.out.println("该土地被占用");
        }else {
            crop.show();
            idle=false;
        }
    }
/*
    public void pland(Corn corn){
        if(idle==false){
            System.out.println("该土地被占用");
        }else {
            corn.show();
            System.out.println("种植玉米");
            idle=false;
        }
    }
    */
}
