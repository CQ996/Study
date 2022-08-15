package august.bao0808.usb;

/**
 * @ClassName Keyboard
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:44
 * @Version 1.0
 */
public class Keyboard implements Computer{

    @Override
    public void press() {
        System.out.println("敲击按键！");
    }

    @Override
    public void work() {
        System.out.println("键盘进行输入！");
    }
}
