package august.bao0808.qq;

/**
 * @ClassName Message
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/8 19:00
 * @Version 1.0
 */
public class Message implements QQ {
    @Override
    public void send() {
        System.out.println("使用QQ发送文字消息");
    }
}
