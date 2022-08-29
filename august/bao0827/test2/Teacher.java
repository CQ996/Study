package august.bao0827.test2;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/29 10:28
 * @Version 1.0
 */
public class Teacher {

    private Integer tid;
    private String tname;

    //构造方法1: 带参.
    public Teacher(Integer tid, String tname) {
        this.tid = tid;
        this.tname = tname;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    //模拟其他方法:
    private void teach(){
        System.out.println("模拟上课1.....");
    }

    private String teach(String subName){
        System.out.println("模拟上课2....."+ subName);
        return "OK";
    }
}
