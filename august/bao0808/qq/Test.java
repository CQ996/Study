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
        QQ me = new Message();
        QQ vo = new Voice();
        QQ vi = new Video();
        fs(me);
        fs(vo);
        fs(vi);
    }
    //采用多态 将父接口类型作为参数类型
    public static void fs(QQ type){
        type.send();
    }
}
