package august.bao0808.perimeter;

/**
 * @ClassName Shape
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:27
 * @Version 1.0
 */
public abstract class Shape {
    public Shape(){

    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    private int dd;

    public Shape(int dd){
        this.dd=dd;
    }
    public abstract void perimeter();
}
