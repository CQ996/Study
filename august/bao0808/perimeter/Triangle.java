package august.bao0808.perimeter;

/**
 * @ClassName Triangle
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:28
 * @Version 1.0
 */
public class Triangle extends Shape{
    public Triangle(int dd){
        super(dd);
    }
    @Override
    public void perimeter() {
        System.out.println("等边三角形的周长是："+3*getDd());
    }
}
