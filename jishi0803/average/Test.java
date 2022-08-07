package jishi0803.average;

import java.util.Scanner;

/**
 * @ClassName Test
 * @Description 创建对象数组，计算学生平均身高写法一
 * @Author CQ
 * @Date 2022/8/5 9:28
 * @Version 1.0
 */
public class Test {
    //求平均身高方法,返回students数组中学生身高的平均值。
    static double getAvg(Student[] students){
        double sum=0;
        for (int i = 0; i < students.length; i++) {
            double height=students[i].height;
            sum+=height;
        }
        double avg=sum/students.length;
        return avg;
    }

    //（1）	声明长度为5的Student类型数组；
    //（2）	循环接收用户输入的5位同学的信息；
    //（3）	调用getAvg()方法，获取所有同学身高的平均值；
    //（4）	最后打印平均身高。
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        String[] aaa={"周小英1.58","宋健健1.86","胡伟1.74","卢俊英1.66","袁小培1.50"};
//        Student[] bbb=new Student[5];
//        String[] aaa=new String[5]
//        for (int i = 0; i <5; i++) {
//            System.out.println("请输入第"+(i+1)+"位同学的姓名、身高：");
//            aaa[i]=in.next();
/*
            double height = in.nextDouble();
            String name = in.next();
            bbb[i].height=height;
            bbb[i].name=name;
            */
//        }
        //查找.位置，再拆解字符串
        Student[] bbb=new Student[5];
        for (int i = 0; i < aaa.length; i++) {
            bbb[i]=new Student();
            int dian=aaa[i].indexOf(".");
            String height=aaa[i].substring(dian-1,dian+3);
            String name=aaa[i].substring(0,dian-2);
            //转换成double类型
            double cc=Double.parseDouble(height);
            bbb[i].name=name;
            bbb[i].height=cc;
        }

        System.out.println("平均身高为："+getAvg(bbb)+"米");

    }
}
