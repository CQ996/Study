package august.bao0825.junit_;

/**
 * @ClassName UserService
 * @Description 业务方法:JUnit测试方法
 * @Author CQ
 * @Date 2022/8/24 18:50
 * @Version 1.0
 */
public class UserService {
    public String loginName(String loginName,String passWord){
        if("admin".equals(loginName) && "123456".equals(passWord)){
            return "登录成功";
        }else {
            return "用户名或者密码有问题";
        }
    }
    public void selectNames(){
        System.out.println(10/0);
        System.out.println("查询全部用户名称成功！");
    }
}
