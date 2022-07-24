package bao0722;

/**
 * @ClassName TouristRoutes
 * @Description 旅游路线类
 * @Author CQ
 * @Date 2022/7/22 15:19
 * @Version 1.0
 */
public class TouristRoutes {
    String []name={"台湾5日环岛游","3天看遍云南绮丽秋色","北疆大环线7日游"};
    String []road={"松山文创园~土林夜市","石林风景区~大理古城","新疆国际大巴扎~可可托海"};
    double []price={2000.0,3000.0,4000.0};
    public void show(){
        for (int i = 0; i <3; i++) {
            System.out.println("【线路名称】："+name[i]);
            System.out.println("【景区】："+road[i]);
            System.out.println("【价格（元）】："+price[i]);
            System.out.println("****************************");
        }

    }
}
