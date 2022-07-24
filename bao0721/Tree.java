package bao0721;

/**
 * @ClassName Tree
 * @Description 树类
 * @Author CQ
 * @Date 2022/7/21 14:31
 * @Version 1.0
 */
public class Tree {
    public String type;
    public int diameter;
    public int height;
    public int water;

    public void storesWater(){
        System.out.println("每颗"+type+"都能在旱季为周围动物提供"+water+"升水源");
    }
    public void fruit(){
        System.out.println("每颗"+type+"都能结出丰硕的果实");
    }
    public void Spermatogenesis(){
        System.out.println("每颗"+type+"都能长成树妖精！");
        System.out.println("每颗"+type+"结出的果实会孵化出很多“方凯”");
    }

    //显示信息方法
    public void show(){
        System.out.println(type+"的直径："+diameter+"，高度为："+height+"，储水量为："+water);
    }
}
