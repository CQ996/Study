package ChengqianJishi;

/**
 * @ClassName Dome9
 * @Description 编程计算1至50之间3的倍数的值之和。要求：代码规范，有注释，
 * 能正确运行出结果，将.java源文件打包后，以自己的名字命名提交。
 * @Author CQ
 * @Date 2022/7/13 15:15
 * @Version 1.0
 */
public class Dome9 {
    public static void main(String[] args) {
        //定义i初始值为1；i循环条件不大于50；i自增；
        int sum=0;
        for (int i = 1; i <= 50; i++) {
                //限制i为3的倍数
            if (i%3==0){
                //sum=sum+i
                sum=sum+i;
                //输出求和
                System.out.println(sum);
            }
        }
    }
}
