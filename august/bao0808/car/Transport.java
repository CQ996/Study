package august.bao0808.car;

/**
 * @ClassName Transport
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 14:18
 * @Version 1.0
 */
public abstract class Transport {
    public Transport(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Transport(String name,String color,double price){

    }
    private String name;
    private String color;
    private double price;
    public abstract void run();
}
