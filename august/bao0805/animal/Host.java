package august.bao0805.animal;

/**
 * @ClassName Host
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/7 12:41
 * @Version 1.0
 */
public class Host {

    //赠送
    public void donate(Animal animal){
        System.out.println("你获赠了一只"+animal.getName());
        animal.voice();
    }
    //
    public void letVoice(Animal animal){

    }
}
