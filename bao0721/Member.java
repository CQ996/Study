package bao0721;

/**
 * @ClassName Member
 * @Description 会员信息类
 * @Author CQ
 * @Date 2022/7/21 16:03
 * @Version 1.0
 */
public class Member {
    int xmnumber;
    String name;
    int password;
    int birthday;
    int xbnumber;

    public void show(){
        System.out.println("会员"+name+"信息为:");
        System.out.println("虾米号:"+xmnumber+"，昵称："+name+"，密码:"+password+"，虾币数："+xbnumber);
    }
}
