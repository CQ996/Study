package august.bao0819.test1;

import java.io.*;

/**
 * @ClassName Test1
 * @Description File表示文件或目录
 * @Author CQ
 * @Date 2022/8/19 14:03
 * @Version 1.0
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //借助java语言操作文件或文件夹.
        //需求: java中如何表示一个文件.或目录. 注: File类.
        //绝对路径: 真实路径.
        // 路径的分隔符:  "d:\\1.txt"  或者 "d:/1.txt"
        File f1 = new File("d:"+ File.separator +"1.txt");
        File f2 = new File("d:"+ File.separator +"vms");
        File f3 = new File("d:/" , "1.txt");

        //相对路径: 地址相对项目根目录存放.
        File f4 = new File("2.txt");
        File f5 = new File("images");

        //创建1个新文件:
        boolean r1 = f4.createNewFile();//createNewFile()根据抽象路径创建一个新的空文件，当抽象路径制定的文件存在时，创建失败。返回false
        //创建新目录:
        // f5.mkdirs(); 创建多层目录.
        f5.mkdir(); //创建单个目录.

        //检查文件是否存在:
        boolean r2 = f5.exists();
        System.out.println("f5是否存在: "+ r2);
    }
}
