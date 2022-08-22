package august.bao0823.itheima_api;

/**
 * @ClassName ThreadDemo01
 * @Description 线程休眠
 * @Author CQ
 * @Date 2022/8/23 5:27
 * @Version 1.0
 */
public class ThreadDemo02 {
    //main方法是由主线程负责调度的
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 5; i++) {
            System.out.println("输出"+i);
            if(i==3){
                //让当前线程进入休眠状态：3秒
                Thread.sleep(3000);
            }
        }
    }
}
