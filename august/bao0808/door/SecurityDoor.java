package august.bao0808.door;

/**
 * @ClassName SecurityDoor
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 16:58
 * @Version 1.0
 */
public class SecurityDoor extends Door implements Lock {
    @Override
    public void Lock() {
        System.out.println("防盗门上了锁！");
    }

    @Override
    public void Unlock() {
        System.out.println("防盗门开了锁！");
    }

    @Override
    public void open() {
        System.out.println("防盗门开门！");
    }

    @Override
    public void close() {
        System.out.println("防盗门关门！");
    }

    public SecurityDoor(String type, double price){
        super(type,price);
    }

    @Override
    public void show() {
        System.out.println("防盗门的材质是"+getType()+"，价格是"+getPrice());
    }
}
