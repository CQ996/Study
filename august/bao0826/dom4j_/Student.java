package august.bao0826.dom4j_;

/**
 * @ClassName Contact
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/26 14:16
 * @Version 1.0
 */
public class Student {
    public Student() {
    }

    public Student(String name, int id, boolean vip, char gender, String email) {
        this.name = name;
        this.id = id;
        this.vip = vip;
        this.gendar = gender;
        this.email = email;
    }

    private String name;
    private int id;
    private boolean vip;
    private char gendar;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public char getGendar() {
        return gendar;
    }

    public void setGendar(char gendar) {
        this.gendar = gendar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", vip=" + vip +
                ", gendar=" + gendar +
                ", email='" + email + '\'' +
                '}';
    }
}
