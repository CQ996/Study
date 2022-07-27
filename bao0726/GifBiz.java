package bao0726;

/**
 * @ClassName GifBiz
 * @Description 存储和展示数据的类
 * @Author CQ
 * @Date 2022/7/26 15:55
 * @Version 1.0
 */
public class GifBiz {
    String name;
    double price;
    String address;
    public void show(){
        System.out.println("名称是:"+name+"\n"+"价格是："+price+"\n"+"产地是："+address);
    }
}
