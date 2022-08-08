package august.bao0808.qq;

/**
 * @ClassName Test
 * @Description 继承接口实现QQ发送不同形式的消息
 * @Author CQ
 * @Date 2022/8/8 19:06
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Message me = new Message();
        me.send();
        Voice vo = new Voice();
        vo.send();
        Video vi = new Video();
        vi.send();
    }
}
