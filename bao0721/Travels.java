package bao0721;

/**
 * @ClassName Travels
 * @Description 修改游记类
 * @Author CQ
 * @Date 2022/7/21 16:23
 * @Version 1.0
 */
public class Travels {
    String titlename;
    String author;
    int days;
    int xiabi;
    String content;
    public void show(){
        System.out.println("标题："+titlename+"   "+"作者："+author+"   "+"行程天数："+days+"   "+"虾币："+xiabi+"   ");
        System.out.println("游记内容:"+content);
    }
}
