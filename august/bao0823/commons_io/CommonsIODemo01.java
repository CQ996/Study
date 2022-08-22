package august.bao0823.commons_io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @ClassName CommonsIODemo01
 * @Description 第三方IO包
 * @Author CQ
 * @Date 2022/8/22 16:46
 * @Version 1.0
 */
public class CommonsIODemo01 {
    public static void main(String[] args) throws Exception {
        //1.完成文件的复制
        IOUtils.copy(new FileInputStream("C:\\Users\\CQ\\Pictures\\1.jpg"),
                new FileOutputStream("C:\\Users\\CQ\\Pictures\\9.jpg"));
        //2.完成文件复制到某个文件夹下！
        FileUtils.copyFileToDirectory(new File("C:\\Users\\CQ\\Pictures\\1.jpg"),new File("D:\\aaa"));
        //3.完成文件夹复制到某个文件夹下！
        FileUtils.copyDirectoryToDirectory(new File("C:\\Users\\CQ\\Pictures"),new File("D:\\bbb"));
        //4.删除文件夹
        FileUtils.deleteDirectory(new File("D:\\bbb"));

        //jdk1.7 自己也做了一些一行代码完成复制的操作：New IO的技术
        //Files.copy(Path.of("C:\\Users\\CQ\\Pictures\\1.jpg"),Path.of("C:\\Users\\CQ\\Pictures\\9.jpg"));
    }
}
