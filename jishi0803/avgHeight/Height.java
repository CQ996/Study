package jishi0803.avgHeight;

/**
 * @ClassName Height
 * @Description TODO
 * @Author CQ
 * @Date 2022/8/3 17:13
 * @Version 1.0
 */
public class Height {
    double average;
    //定义对象为数组
    Student[] aaa =new Student[5];
    double sum=0.0;
    //以Student为模板定义一个对象 students
    public double setAdd(Student students){
        for (int i = 0; i < aaa.length; i++) {
            if(aaa[i]==null){
                aaa[i]=students;
                sum+=aaa[i].height;
                break;
            }
        }
        average=sum/5;
        return average;
    }
    public void show(){
        System.out.print("平均身高是："+average+"米");
    }

}
