package august.bao0808.animal;

/**
 * @ClassName Fish
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:00
 * @Version 1.0
 */
public class Fish extends Animal{

    public Fish(String color, String name) {
        super(color, name);
    }
    //String type;
    @Override
    public void info() {
        System.out.println("我叫"+getName()+"，是一只："+getColor()+"的鱼");
    }
}
