package august.ba0802.introduce;

/**
 * @ClassName Department
 * @Description 部门类
 * @Author CQ
 * @Date 2022/8/2 17:20
 * @Version 1.0
 */
public class Department {
    public String getDtname() {
        return dtname;
    }

    public void setDtname(String dtname) {
        this.dtname = dtname;
    }

    public int getDtnum() {
        return dtnum;
    }

    public void setDtnum(int dtnum) {
        this.dtnum = dtnum;
    }

    public String getMgname() {
        return mgname;
    }

    public void setMgname(String mgname) {
        this.mgname = mgname;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    private String dtname;//部门名称
    private String mgname;//经理名称
    private int dtnum;//部门人数
    private String introduction;//职责介绍

    //部门介绍方法
    public void printintro(){
        System.out.println("部门名称："+dtname);
        System.out.println("经理："+mgname);
        System.out.println("员工人数："+dtname);
        System.out.println("部门职责："+introduction);
    }
}
