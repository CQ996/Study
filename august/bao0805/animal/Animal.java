package august.bao0805.animal;

/**
 * @ClassName Animal
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/7 12:43
 * @Version 1.0
 */
public class Animal {
    public Animal(String name,String voice){
        this.name=name;
        this.voice=voice;
    }
    public Animal(){

    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //宠物
    private String name;
    //声音
    private String voice;
    //叫声
    public void voice(){
        System.out.println(name+"发出了"+voice+"叫声。");
    }

}
