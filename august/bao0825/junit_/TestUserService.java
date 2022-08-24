package august.bao0825.junit_;

import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName TestUserService
 * @Description JUnit测试方法
 * @Author CQ
 * @Date 2022/8/24 18:56
 * @Version 1.0
 */
public class TestUserService {
    //测试方法：
    //1.必须是公开的，无参数的，无返回值的方法
    //2.测试方法必须使用@Test注释标记
    @Test
    public void testloginName(){
        UserService userService = new UserService();
        String rs=userService.loginName("admin","123456");

        //进行预期结果的正确性测试，断言
        Assert.assertEquals("您的登录业务可能出现问题","登录成功",rs);
    }
    @Test
    public void testSelectNames(){
        UserService userService = new UserService();
        userService.selectNames();
    }
}
