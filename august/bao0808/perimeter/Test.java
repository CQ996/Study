package august.bao0808.perimeter;

/**
 * @ClassName Test
 * @Description 继承--抽象求圆和三角形的周长
 * @Author CQ
 * @Date 2022/8/8 18:34
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Shape shape;
        shape=new Circle(4);
        shape.perimeter();
        shape=new Triangle(4);
        shape.perimeter();
    }
}
