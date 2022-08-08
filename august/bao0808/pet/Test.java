package august.bao0808.pet;

/**
 * @ClassName Test
 * @Description 用继承、重写调用主人给宠物喂食。
 * @Author CQ
 * @Date 2022/8/8 18:18
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Pet pet;
        Host host=new Host();
        pet=new Dog();
        host.feed(pet);
        pet=new Cat();
        host.feed(pet);

    }

}
