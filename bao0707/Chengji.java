package bao0707;

import java.util.Scanner;

public class Chengji {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("STB的成绩：");
        int STB=input.nextInt();
        System.out.println("Java的成绩：");
        int Java=input.nextInt();
        System.out.println("SQL的成绩：");
        int SQL=input.nextInt();
        System.out.println("————————————————————————");
        System.out.println("STB\t\tJava\t\tSQL");
        System.out.println(STB+"\t\t"+Java+"\t\t\t"+SQL);
        System.out.println("————————————————————————");
        int cha=Java-SQL;
        double pjf=(STB+Java+SQL)/3;
        System.out.println("Java和SQL的成绩差："+cha);
        System.out.println("3门课的平均分是："+pjf);
    }
}
