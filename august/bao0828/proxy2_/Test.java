package august.bao0828.proxy2_;

import java.lang.reflect.Proxy;

/**
 * @ClassName Test
 * @Description 模拟企业业务功能开发，并完成每个功能的性能统计
 * 需求：
 * 模拟某企业用户管理业务，需包含用户登录，用户删除，用户查询功能，并统计每个功能的耗时
 * @Author CQ
 * @Date 2022/8/27 14:51
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        UserService userService = ProxyUtil.getProxy(new UserServiceImpl());
        System.out.println(userService.login("admin", "123456"));
        userService.selectUsers();
        userService.deleteUsers();
    }
}
