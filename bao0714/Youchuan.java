package bao0714;

import java.util.Scanner;

public class Youchuan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
                int sum=0;//求和总人数
                for(int i=1;i<=10;i++){
                    System.out.println("请输入第"+i+"班游船人数：");
                    int num=input.nextInt();

                    if(sum>=5000){
                        System.out.println("现已停船，岛上人数超过5000人");
                        break;
                    }
                    sum+=num;
                }
        System.out.println("今日上岛人数："+sum);
    }
}
