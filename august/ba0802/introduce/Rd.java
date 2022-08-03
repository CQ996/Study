package august.ba0802.introduce;

/**
 * @ClassName Rd
 * @Description RD类
 * @Author CQ
 * @Date 2022/8/2 17:21
 * @Version 1.0
 */
public class Rd extends Department{
    public Rd(){
        this.setDtname("研发部");
        this.setMgname("李响");
        this.setDtnum(50);
        this.setIntroduction("负责公司产品研发。");
    }

    private int project=4;

    public int getProject() {
        return project;
    }

    public void setProject(int project) {
        this.project = project;
    }

    @Override
    public void printintro() {
        super.printintro();
        System.out.println("研发项目数："+project+"个");
    }
}
