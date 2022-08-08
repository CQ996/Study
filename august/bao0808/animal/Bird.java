package august.bao0808.animal;

/**
 * @ClassName Bird
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:00
 * @Version 1.0
 */
public class Bird extends Animal{
    public Bird(String color, String name) {
        super(color, name);
    }

    @Override
    public void info() {
        System.out.println("我叫"+getName()+"，是一只："+getColor()+"的鸟");
    }
}
