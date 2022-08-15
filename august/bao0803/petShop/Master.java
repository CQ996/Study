package august.bao0803.petShop;

/**
 * @ClassName Master
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/4 16:23
 * @Version 1.0
 */
public class Master {
    //喂食
    public void feed(Pets pets,Food food){
        System.out.println("主人给"+pets.getName()+"喂了"+food.getName());
    }

}
