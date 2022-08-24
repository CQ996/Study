package august.bao0825.junit_;

import org.junit.*;

/**
 * @ClassName TestUserService
 * @Description JUnit测试方法、常用注解
 * @Author CQ
 * @Date 2022/8/24 18:56
 * @Version 1.0
 */
public class TestUserService {
    //只能修饰实例方法
    @Before
    public void before(){
        System.out.println("=====before每一个测试方法执行前执行一次====");
    }
    @After
    public void after(){
        System.out.println("=====after每一个测试方法执行后执行一次====");
    }
    //修饰静态方法
    @BeforeClass
    public static void beforeClass(){
        System.out.println("=====beforeClass所有测试方法前执行一次====");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("=====afterClass所有测试方法后执行一次====");
    }
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
