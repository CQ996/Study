package bao0721;

/**
 * @ClassName MemberTest
 * @Description 会员信息测试
 * @Author CQ
 * @Date 2022/7/21 16:12
 * @Version 1.0
 */
public class MemberTest {
    public static void main(String[] args) {
        Member member=new Member();
        member.xmnumber=8888;
        member.name="凯子";
        member.password=666666;
        member.birthday=19990606;
        member.xbnumber=10;
        member.show();

        Member hyj=new Member();
        hyj.xmnumber=897429;
        hyj.name="胡子";
        hyj.password=123456;
        hyj.birthday=20000101;
        hyj.xbnumber=66;
        hyj.show();
    }
}
