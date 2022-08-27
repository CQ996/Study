package august.bao0828.proxy2_;

/**
 * @ClassName UserServiceImpl
 * @Description 实现类
 * @Author CQ
 * @Date 2022/8/27 14:53
 * @Version 1.0
 */
public class UserServiceImpl implements UserService{
    @Override
    public String login(String loginName, String passWord) {
        //long startTime = System.currentTimeMillis();
        String rs = "登录名称和密码错误";
        if("admin".equals(loginName)  && "123456".equals(passWord)){
            rs = "登录成功";
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // long endTime = System.currentTimeMillis();
        //System.out.println("login方法耗时"+ (endTime-startTime)/1000 + "s");
        return rs;
    }

    @Override
    public void deleteUsers() {
        //long startTime = System.currentTimeMillis();
        try {
            System.out.println("你正在删除用户···");
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //long endTime = System.currentTimeMillis();
        //System.out.println("deleteUsers方法耗时"+ (endTime-startTime)/1000 + "s");
    }

    @Override
    public String selectUsers() {
        //long startTime = System.currentTimeMillis();
        String rs = "查询了10000个用户···";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //long endTime = System.currentTimeMillis();
        //System.out.println("selectUsers方法耗时"+ (endTime-startTime)/1000 + "s");
        return rs;
    }
}
