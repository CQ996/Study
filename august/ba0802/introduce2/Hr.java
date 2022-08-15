package august.ba0802.introduce2;

/**
 * @ClassName Hr
 * @Description HR类
 * @Author CQ
 * @Date 2022/8/2 17:20
 * @Version 1.0
 */
public class Hr extends Department{
    public Hr(){
        this.setDtname("人力资源部");
        this.setMgname("张红");
        this.setDtnum(5);
        this.setIntroduction("负责公司的人才招聘和培训。");
    }
    private int target=15;

    public int getTarget() {
        return target;
    }

    public void setTarget(int target) {
        this.target = target;
    }

    @Override
    public void printintro() {
        super.printintro();
        System.out.println("招聘目标："+target+"人");
    }
}
