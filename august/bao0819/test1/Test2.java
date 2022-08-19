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
        //delete() renameTo(File dest)
//        boolean r1 = f1.renameTo(f2);
//        boolean r2 = f2.delete();
//        System.out.println("结果为: " + r2);

        //getAbsoluteFile() getAbsolutePath()
//        File f3 = new File("d:/1.txt");
//        String path = f3.getAbsolutePath();
//        File f4 = f3.getAbsoluteFile();
//        System.out.println( path );
//        System.out.println( f4 );

        //getName()getPath()
//        File f5 = new File("d:/1.txt");
//        String fileName = f5.getName();
//        String path = f5.getPath();
//        System.out.println(fileName);
//        System.out.println(path);

        //getParent() getParentFile()
//        File f5 = new File("D:\\j108\\workspace1\\images");
//        String parent = f5.getParent();
//        File parentFile = f5.getParentFile();
//        System.out.println( parent);
//        System.out.println( parentFile);

        //isDirectory() isFile()
//        File f5 = new File("D:\\j108\\workspace1\\images");
//        System.out.println( f5.isDirectory() );
//        System.out.println( f5.isFile() );

        //list()list(FilenameFilter filter)
        File f6 = new File("d:/");
        String[] list = f6.list();
        for (String f : list){
            System.out.println("解析字符串: " + f);
        }
        //listFiles()listFiles(FilenameFilter filter)
        File f7 = new File("d:/");
        File[] files = f7.listFiles();
        for (File f : files){
            System.out.println("解析对象: " + f);
        }

    }
}
