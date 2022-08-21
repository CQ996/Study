package august.bao0819.test1;

import java.io.*;

/**
 * @ClassName Test2
 * @Description File的常用功能演示
 * @Author CQ
 * @Date 2022/8/19 14:47
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        //File的一些常用功能:

        File f1 = new File("2.txt");
        File f2 = new File("6.txt");
        //delete()删除此抽象路径名表示的文件或目录。
        //renameTo(File dest)文件重命名
//        boolean r1 = f1.renameTo(f2);//
//        boolean r2 = f2.delete();
//        System.out.println("结果为: " + r2);

        //getAbsoluteFile()获取文件的绝对路径（抽象路径名）
        //getAbsolutePath()获取文件的绝对路径（字符串）
//        File f3 = new File("d:/1.txt");
//        String path = f3.getAbsolutePath();
//        File f4 = f3.getAbsoluteFile();
//        System.out.println( path );
//        System.out.println( f4 );

        //1、getPath()：
        //返回定义时的路径，(就是你写什么路径，他就返回什么路径)
        //2、getAbsolutePath()：
        //返回绝对路径，但不会处理“.”和“..”的情况
        //3、getCanonicalPath()：
        //返回的是规范化的绝对路径，相当于将getAbsolutePath()中的“.”和“..”解析成对应的正确的路径

        //getName() 返回由此抽象路径名表示的文件或目录的名称。
//        File f5 = new File("d:/1.txt");
//        String fileName = f5.getName();
//        String path = f5.getPath();
//        System.out.println(fileName);
//        System.out.println(path);

        //getParent()获取文件的父路径（字符串），如果此路径名没有指定父目录，则返回 null
        //getParentFile()获取文件的父路径（抽象路径名），如果此路径名没有指定父目录，则返回 null
//        File f5 = new File("D:\\j108\\workspace1\\images");
//        String parent = f5.getParent();
//        File parentFile = f5.getParentFile();
//        System.out.println( parent);
//        System.out.println( parentFile);

        //isDirectory()判断此抽象路径名表示的文件是否是一个目录。
        //isFile()判断此抽象路径名表示的文件是否是一个标准文件
//        File f5 = new File("D:\\j108\\workspace1\\images");
//        System.out.println( f5.isDirectory() );
//        System.out.println( f5.isFile() );

        //list()list(FilenameFilter filter)
        //返回由包含在目录中的文件和目录的名称所组成的字符串数组，这一目录是通过满足指定过滤器的抽象路径名来表示的。
        File f6 = new File("d:/");
        String[] list = f6.list();
        for (String f : list){
            System.out.println("解析字符串: " + f);
        }
        //listFiles()listFiles(FilenameFilter filter)
        //返回表示此抽象路径名所表示目录中的文件和目录的抽象路径名数组，这些路径名满足特定过滤器。
        File f7 = new File("d:/");
        File[] files = f7.listFiles();
        for (File f : files){
            System.out.println("解析对象: " + f);
        }

    }
}
