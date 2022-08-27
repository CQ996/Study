package august.bao0828.proxy_;

/**
 * @ClassName Star
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/27 13:54
 * @Version 1.0
 */
public class Star implements Skill{
    public Star() {
    }

    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void jump() {
        System.out.println(name+"开始跳舞");
    }

    @Override
    public void sing() {
        System.out.println(name+"开始唱歌");
    }
}
