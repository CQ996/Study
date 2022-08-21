package august.bao0819;


import java.io.*;
/**
 * @ClassName Dome1
 * @Description 遍历某目录下的所有jpg、png文件
 * @Author CQ
 * @Date 2022/8/19 15:11
 * @Version 1.0
 */

public class Dome1 {
    public static void main(String[] args) {
        //传入需要解析的路径，文件后缀名
        findFile("C:\\Users\\CQ\\Pictures",".jpg",".png");
    }

    public static void findFile(String path,String suffix1,String suffix2) {
        File f = new File(path);//获取目标路径对象
        if(f.isFile()) {//是否存在文件
            //如果存在文件，判断文件后缀名
            if(f.getName().endsWith(suffix1) || f.getName().endsWith(suffix2)) {
                //判断通过就打印文件名
                System.out.println(f.getName());
            }
        }else {//既然不是文件，那就是目录或者null
            File[] listFiles = f.listFiles();//通过listFiles方法获取元素为文件的数组
            //注意：在获取指定目录下的文件或者文件夹时必须满足下面两个条件
            //1，指定的目录必须是存在的，
            //2，指定的必须是目录。否则容易引发返回数组为null，出现NullPointerException
            //所以先做判空处理
            if(listFiles!=null && listFiles.length>0) {
                for(File f2:listFiles) {
                    findFile(f2.getAbsolutePath(),suffix1,suffix2);//遍历获取文件的路径、两个后缀名，再递归调用本方法
                }
            }
        }
    }
}

