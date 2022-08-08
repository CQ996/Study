package august.bao0808.animal;

/**
 * @ClassName Test
 * @Description 继承——动物颜色和姓名
 * @Author CQ
 * @Date 2022/8/8 18:09
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Fish fish=new Fish("粉色","小粉");
        fish.info();
        Bird bird=new Bird("白色","小白");
        bird.info();

    }
}
