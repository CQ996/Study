package august.bao0827.reflect_method;

/**
 * @ClassName Dog
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/26 18:54
 * @Version 1.0
 */
public class Dog {
    private String name;
    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println("狗跑得很快~~");
    }

    private String eat(String name){
        System.out.println("狗吃"+name);
        return "吃得很开心";
    }

    public static void inAddr(){
        System.out.println("在我旁边有一群单身狗");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
