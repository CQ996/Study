package august.bao0803.petShop;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 18:08
 * @Version 1.0
 */
public class Dog extends Pets{
    public Dog(){

    }
    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    //品种
    private String varieties;


    public Dog(String name,int healthy,int intimacy,String varieties){
        super(name,healthy,intimacy);
        this.varieties=varieties;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("我是一只"+varieties);
    }

}
