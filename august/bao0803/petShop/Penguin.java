package august.bao0803.petShop;

/**
 * @ClassName Penguin
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 18:08
 * @Version 1.0
 */
public class Penguin extends Pets{
    public Penguin(){

    }
    //性别
    String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public static final String SEX_MALE="Q仔";
    public static final String SEX_FEMALE="Q妹";


    public Penguin(String name,int healthy,int intimacy,String sex){
        super(name,healthy,intimacy);
        this.sex=sex;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("性别是"+sex);
    }

}
