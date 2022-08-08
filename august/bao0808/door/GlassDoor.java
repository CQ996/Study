package august.bao0808.door;

/**
 * @ClassName GlassDoor
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 17:03
 * @Version 1.0
 */
public class GlassDoor extends Door{

    @Override
    public void open() {
        System.out.println("玻璃门开门！");
    }

    @Override
    public void close() {
        System.out.println("玻璃门关门！");
    }

    public GlassDoor(String type, double price){
        super(type,price);
    }

    @Override
    public void show() {
        System.out.println("防盗门的材质是"+type+"，价格是"+price);
    }
}
