package bao0720;

import java.util.Scanner;

/**
 * @ClassName LuckyDraw016
 * @Description 幸运抽奖菜单
 * @Author CQ
 * @Date 2022/7/20 14:19
 * @Version 1.0
 */
public class LuckyDraw016017018 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String answer="";
        int sum=0;
        int max = 9999;
        int min = 1000;
        int random=0;
        String []name=new String[1];
        int []password=new int[1];
        int []membership=new int[1];
        int lucky=0;
        do{
            String menu="奖客富翁系统";
            System.out.println("******欢迎进入"+menu+"******");
            String menu1="注册";
            String menu2="登录";
            String menu3="抽奖";
            System.out.println("\t1、"+menu1);
            System.out.println("\t2、"+menu2);
            System.out.println("\t3、"+menu3);
            System.out.println("**********************************");
            System.out.println("请选择菜单：");
            int num=input.nextInt();
            switch (num){
                case 1:
                    System.out.println("["+menu+">"+menu1+"]");
                    System.out.println("请填写个人注册信息");
                    System.out.print("用户名：");
                    name[sum]= input.next();
                    System.out.print("密码：");
                    password[sum]=input.nextInt();
                    System.out.print("\n");
                    System.out.println("注册成功，请记住您的会员卡号");
                    //随机生成1000~9999之间会员号
                    membership[sum] = (int)(Math.random()*(max-min))+min;
                    System.out.println("用户名\t密码\t\t会员卡号");
                    System.out.print(name[sum]+"\t\t");
                    System.out.print(password[sum]+"\t\t");
                    System.out.println(membership[sum]);
                    break;
                case 2:
                    System.out.println("["+menu+">"+menu2+"]");
                    System.out.print("请输入用户名：");
                    String name2= input.next();
                    System.out.print("请输入密码：");
                    int password2=input.nextInt();
                    if(name2.equals(name[sum]) && password2==password[sum]){
                        System.out.println("欢迎您："+name[sum]);
                    }
                    break;
                case 3:
                    System.out.println("["+menu+">"+menu3+"]");
                    System.out.println("请输入您的会员卡号：");
                    int membership2=input.nextInt();
                    System.out.print("本日的幸运数字为：");
                    for (int i = 1; i <=5; i++) {
                        random = (int)(Math.random()*(max-min))+min;
                        System.out.print(random+"\t");
                        if (random==membership2){
                            lucky++;
                        }
                    }
                        if(lucky>0){
                            System.out.print("恭喜，您是本日的幸运会员！");
                        }else {
                            System.out.print("抱歉，您不是本日的幸运会员。");
                        }
                    break;
                default:
                    System.out.println("您的输入有误！");
            }
            System.out.println("继续吗？（y/n）");
            answer=input.next();
        }while (answer.equals("y"));
            System.out.println("系统退出，谢谢使用！");
    }
}
