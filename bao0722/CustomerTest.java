package bao0722;

/**
 * @ClassName CustomerTest
 * @Description 客户积分回馈类测试
 * @Author CQ
 * @Date 2022/7/22 9:41
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer=new Customer();
        customer.integral=1200;
        customer.card="金卡";
        customer.show();
    }
}
