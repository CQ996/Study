package august.enum_;

/**
 * @ClassName EnumDetail
 * @Description enum实现接口
 * @Author CQ
 * @Date 2022/8/14 8:39
 * @Version 1.0
 */
public class EnumDetail {
    //1.因为enum隐式继承Enum，而java是单继承机制，所以不能再继承其他类了
    //2.enum实现的枚举类和普通类一样，可以实现多接口
    public static void main(String[] args) {
        Music.CLASSICMUSIC.playing();
    }
}
interface Iplaying{
    public void playing();
}

enum Music implements Iplaying{
    CLASSICMUSIC;
    @Override
    public void playing() {
        System.out.println("播放音乐~~");
    }
}