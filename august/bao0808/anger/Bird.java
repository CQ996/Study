package august.bao0808.anger;

/**
 * @ClassName Bird
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:52
 * @Version 1.0
 */
public abstract class Bird {
    public void fly(){
        System.out.println("弹射飞行");
        System.out.println("嗷~~~");
    }
    public abstract void attack();
}
