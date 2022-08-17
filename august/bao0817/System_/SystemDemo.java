package august.bao0817.System_;

import java.util.Arrays;

/**
 * @ClassName SystemDemo
 * @Description System类的使用：获取时间，拷贝数组
 * @Author CQ
 * @Date 2022/8/17 0:09
 * @Version 1.0
 */
public class SystemDemo {
    public static void main(String[] args) {

        //1.计算机认为时间有起源，返回1970-1-1 00:00:00 走到此刻的总的毫秒值：时间毫秒值
        long startTime=System.currentTimeMillis();
        System.out.println(startTime);
        //进行时间的计算：性能分析
        for (int i = 0; i < 100000; i++) {
            System.out.println("输出"+i);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("10万次for循环用了"+(endTime-startTime)/1000.0+"s");
        //2.数组拷贝
        /*
        arraycopy(Object src,//被拷贝的数组
                  int  srcPos,//从哪个索引位置开始拷贝
                  Object dest,//复制的目标数组
                  int destPos,//粘贴位置
                  int length);//拷贝元素的个数
        **/
        int[] arr1={10,20,30,40,50,60};
        int[] arr2=new int[6];//[0,0,0,0,0,0]==>[0,0,40,50,60,0]
        System.arraycopy(arr1,3,arr2,2,3);
        System.out.println(Arrays.toString(arr2));
        //3.JVM虚拟机终止：0正常终止，非0异常终止记录后台
        System.exit(0);



    }
}
