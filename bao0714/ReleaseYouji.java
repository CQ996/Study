package bao0714;
import java.util.Scanner;

public class ReleaseYouji {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.print("请输入标题：");
            String title=input.next();
            System.out.print("请输入行程天数：");
            int days=input.nextInt();
            System.out.print("请输入游记内容：");
            String content=input.next();
            System.out.print("*****第"+i+"篇游记*****");
            //随机生成1~5位数字
            int xiabi=(int)(Math.random()*5+1);
            System.out.print("标题："+title);
            System.out.print("行程天数："+days);
            System.out.println("虾币："+xiabi);
            System.out.println("游记内容："+content);
        }

    }
}
