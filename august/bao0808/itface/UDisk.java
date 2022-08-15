package august.bao0808.itface;

/**
 * @ClassName UDisk
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 15:48
 * @Version 1.0
 */
//模拟USBV2接口的优盘
public class UDisk implements USBV2{
    @Override
    public void in() {
        System.out.println("自动工作");
    }

    @Override
    public void out() {
        System.out.println("U盘拔出");
    }

    @Override
    public void aiusb() {
        System.out.println("U盘插入");
    }
}
