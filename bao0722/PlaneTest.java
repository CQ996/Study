package bao0722;

/**
 * @ClassName PlaneTest
 * @Description return、局部变量、成员变量测试
 * @Author CQ
 * @Date 2022/7/22 14:01
 * @Version 1.0
 */
public class PlaneTest {
    public static void main(String[] args) {
        Plane plane=new Plane();
        plane.moveleft();
        plane.moveright();
        int num=plane.launch();
        System.out.println(plane.getcolor());
        System.out.println("发射子弹："+num);
        System.out.println("炼制仙丹需要"+plane.multiplication()+"天");
    }
}
