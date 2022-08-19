package august.bao0819.test1;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @ClassName Test3
 * @Description 找出D盘下列表文件中的所有png图片
 * @Author CQ
 * @Date 2022/8/19 16:29
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {

        //list(FilenameFilter filter) , listFiles(FilenameFilter filter)

        //需求: 找出D盘下列表文件中的所有png图片.
        MyFilter filter1 = new MyFilter();

        File f1 = new File("d:/");
        String[] list = f1.list(filter1);
        for(String file : list){
            System.out.println("筛选的文件为: " + file);
        }

        //练习:  解析D盘下所有目录下的png。 递归算法.

    }
}

//自定义过滤器:
class MyFilter implements FilenameFilter {

    //返回值决定是否接受该文件:
    @Override
    public boolean accept(File dir, String name) {
        if( name.endsWith(".png") ){
            return true;
        }else{
            return false;
        }
    }
}
