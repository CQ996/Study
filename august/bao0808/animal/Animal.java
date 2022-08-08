package august.bao0808.animal;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 17:59
 * @Version 1.0
 */
public abstract class Animal {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal (String color,String name){
        this.color=color;
        this.name=name;
    }

    private String color;
    private String name;

    public abstract void info();
}
