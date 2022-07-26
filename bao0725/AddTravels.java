package bao0725;

/**
 * @ClassName AddTravels
 * @Description 游记类——通过带参方法 循环添加游记标题 再输出
 * @Author CQ
 * @Date 2022/7/25 17:05
 * @Version 1.0
 */
public class AddTravels {
    String answer;
    String[] titles=new String[4];

    /**
     *
     * @param title 定义游记标题参数
     */
    public void add(String title){
        for (int i = 0; i < titles.length; i++) {
            if(titles[i]==null){
                titles[i]=title;
                break;
            }
        }
    }
    public void show(){
        System.out.println("********我的游记********");
        for (int i = 0; i < titles.length; i++) {
            if(titles[i]!=null){
                System.out.println(titles[i]);
            }
        }
    }

}
