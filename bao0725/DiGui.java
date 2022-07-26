package bao0725;

/**
 * @ClassName DiGui
 * @Description 递归——A方法调用A方法，也就是自己调用自己
 *              大计算不要使用递归，会栈溢出
 * @Author CQ
 * @Date 2022/7/25 10:51
 * @Version 1.0
 */
public class DiGui {
    public static void main(String[] args) {
        System.out.println(f(5));
    }
    //求阶乘方法
    //5! 5*4*3*2*1=120
    //这里的 边界条件：当n等于1时f方法有值；
    //      前阶段：  当n不等于1时，f方法不停调用自身f方法
    //      返回阶段：这里是n*(n-1)
    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
