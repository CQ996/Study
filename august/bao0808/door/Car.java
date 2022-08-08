package august.bao0808.door;

/**
 * @ClassName Car
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 17:42
 * @Version 1.0
 */
public class Car implements Lock{

    @Override
    public void Lock() {
        System.out.println("车上了锁！");
    }

    @Override
    public void Unlock() {
        System.out.println("车开了锁！");
    }
}
