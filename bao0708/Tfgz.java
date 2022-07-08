package bao0708;

import java.util.Scanner;

public class Tfgz {
    public static void main(String[] args) {
        System.out.println("酒店退费规则");
        System.out.println("****************");
        Scanner input=new Scanner(System.in);
        //定义扣费比例
        double seven=0;
        System.out.println("距离入住日期7天或以上：扣除金额"+seven*100+"%");
        double four=0.2;
        System.out.println("距离入住日期4天或以上：扣除金额"+four*100+"%");
        double one=0.4;
        System.out.println("距离入住日期1天或以上：扣除金额"+one*100+"%");
        double zero=1;
        System.out.println("距离入住日期1天或以上：扣除金额"+zero*100+"%");
        //输入酒店费用以及距离入住天数
        System.out.print("请输入已缴纳酒店费用：");
        int zfy=input.nextInt();
            System.out.print("请输入距入住天数：");
        int day=input.nextInt();
        //根据退住天数输出扣费金额和退费金额
        if(day>=7){
            System.out.print("扣除费用："+(zfy*seven)+"元，实际退费金额"+(zfy-zfy*seven)+"元");
        }else if (day>=4) {
            System.out.print("扣除费用："+(zfy*four)+"元，实际退费金额"+(zfy-zfy*four)+"元");
        } else if (day>=1) {
            System.out.print("扣除费用："+(zfy*one)+"元，实际退费金额"+(zfy-zfy*one)+"元");
        } else if (day<1) {
            System.out.print("扣除费用："+(zfy*zero)+"元，实际退费金额"+(zfy-zfy*zero)+"元");
        }

    }
}
