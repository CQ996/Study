package august.bao0808.perimeter;

/**
 * @ClassName Circle
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:27
 * @Version 1.0
 */
public class Circle extends Shape{
    public Circle(int dd){
        super(dd);
    }
    @Override
    public void perimeter() {
        System.out.println("圆的周长是："+3.1415926*getDd());
    }
}
