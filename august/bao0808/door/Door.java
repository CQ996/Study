package august.bao0808.door;

public abstract class Door {
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //材质
    String type;
    //价格
    double price;
    public Door(String type, double price){
        this.type=type;
        this.price=price;
    }
    //开门
    public abstract void open();
    //关门
    public abstract void close();

    public abstract void show();
}
