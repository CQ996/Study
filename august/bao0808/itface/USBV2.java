package august.bao0808.itface;

/**
 * @ClassName USBV2
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 15:31
 * @Version 1.0
 */
public interface USBV2 extends USB,AI{
    //引用父接口中的所有成员：

    @Override
    void aiusb();

    @Override
    void in();

    @Override
    void out();
}
