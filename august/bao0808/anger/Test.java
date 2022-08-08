package august.bao0808.anger;

/**
 * @ClassName Test
 * @Description 继承抽象类实现不同小鸟不同攻击方式
 * @Author CQ
 * @Date 2022/8/8 18:56
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Bird bird;
        bird=new Blues();
        bird.fly();
        bird.attack();
        bird=new Chuck();
        bird.fly();
        bird.attack();
    }
}
