package august.bao0808.itface;

/**
 * @ClassName Test
 * @Description 多接口继承——USB功能
 * @Author CQ
 * @Date 2022/8/8 15:50
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        //模拟接口的使用
        //1、接口不能直接使用
        //2、通过扩展子类方法后，使用
        UDisk u1=new UDisk();
        u1.in();
        u1.out();
        u1.aiusb();
    }
}
