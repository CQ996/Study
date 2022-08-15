package jishi0803.avgHeight;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description 创建对象数组，计算学生平均身高写法二
 * @Author CQ
 * @Date 2022/8/3 16:41
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Height ddd=new Height();
        for (int i = 0; i <5 ; i++) {
            Student ccc=new Student();
            System.out.print("请输入第"+(i+1)+"位同学的姓名、身高：");
            ccc.name=input.next();
            ccc.height=input.nextDouble();
            ddd.setAdd(ccc);
        }
        ddd.show();//调用显示方法数组
    }




}
