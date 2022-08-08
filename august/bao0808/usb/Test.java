package august.bao0808.usb;

/**
 * @ClassName Test
 * @Description 继承usb多接口实现鼠标、键盘工作
 * @Author CQ
 * @Date 2022/8/8 18:45
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Mouse mouse=new Mouse();
        mouse.press();
        mouse.work();
        Keyboard keyboard=new Keyboard();
        keyboard.press();
        keyboard.work();
    }
}
