package august.bao0822;

import java.io.File;

/**
 * @ClassName RecursionDome1
 * @Description 去D盘搜索 WeChat.exe 文件
 * @Author CQ
 * @Date 2022/8/22 3:00
 * @Version 1.0
 */
public class RecursionDemo1 {
    public static void main(String[] args) {
        //2.传入目录和文件名
        searchFile(new File("D:/"),"WeChat.exe");
    }

    /**
     * 1.搜索某个目录下的所有文件，找到目标文件
     * @param dir   被搜索的源目录
     * @param fileName 被搜索的文件名称
     */
    public static void searchFile(File dir,String fileName){
        //3.判断dir是否是目录
        if(dir!=null && dir.isDirectory()){
            //4.提取当前目录下对象
            File[] files = dir.listFiles();
            //5.判断是否空文件夹
            if(files!=null && files.length>0){
                for (File file :files) {
                    //6.判断当前遍历的一级文件对象是文件还是目录
                    if(file.isFile()){
                        //7.判断文件名，是就输出
                        if(file.getName().contains(fileName)){
                            System.out.println("找到了"+file.getAbsolutePath());
                        }
                    }else{
                        //8.判断是文件夹，就继续找
                        searchFile(file,fileName);
                    }
                }

            }
        }else {
            System.out.println("搜索的不是文件夹");
        }
    }
}
