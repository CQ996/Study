package august.bao0810;

import java.util.Scanner;

/**
 * @ClassName Console
 * @Description 输入数字提示输入异常
 * @Author CQ
 * @Date 2022/8/10 14:57
 * @Version 1.0
 */
public class Console {
    static int num;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入课程代号（1~3之间的数字）：");
        num=in.nextInt();
//        switch (num){
//            case 1:
//                System.out.println("C#课");
//                break;
//            case 2:
//                System.out.println("Java课");
//                break;
//            case 3:
//                System.out.println("C++课");
//                break;
//            default:
//                throw new inputException("你输错啦！");
//        }

//        if(num==1){
//            System.out.println("C#课");
//        }else if(num==2){
//            System.out.println("Java课");
//        }else if(num==3){
//            System.out.println("C++课");
//        }else {
//            throw new inputException("你输错啦！");
//        }
//        System.out.println("欢迎提出建议");

        try {
            if(num==1){
                System.out.println("C#课");
            }else if(num==2){
                System.out.println("Java课");
            }else if(num==3){
                System.out.println("C++课");
            }else {
                aaa();
                throw new inputException("你输错啦！");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("欢迎提出建议");
        }

    }
    static class inputException extends RuntimeException {
        public inputException(String message) {//构造器
            super(message);
        }
    }
    public static void aaa()throws Exception{
        Exception bbb=new Exception("你输错啦！");
        throw bbb;
    }
}
