package bao0722;

/**
 * @ClassName Plane
 * @Description 飞机类——return、局部变量、成员变量
 * @Author CQ
 * @Date 2022/7/22 13:57
 * @Version 1.0
 */
public class Plane {
    String color="白色";
    public String getcolor(){
        String color="蓝色";
        return "飞机的颜色是"+this.color;
    }

    public void moveleft(){
        moveright();
        System.out.println("飞机向左移动5个像素");
    }
    public void moveright(){
        System.out.println("飞机向右移动5个像素");
    }
    public int launch(){
        int bullet=(int)(Math.random()*1000)+1;
        //返回int类型数据
        return bullet;
    }
    public int multiplication(){
        int a=(int)(Math.random()*10)+1;
        int b=(int)(Math.random()*10)+1;
        int result=a*b;
        return result;
    }
}
