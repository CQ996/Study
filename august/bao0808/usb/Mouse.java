package august.bao0808.usb;

/**
 * @ClassName Mouse
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 18:43
 * @Version 1.0
 */
public class Mouse implements Computer{

    @Override
    public void press() {
        System.out.println("点击鼠标！");
    }

    @Override
    public void work() {
        System.out.println("鼠标进行操作！");
    }
}
