package august.bao0822.test;

import java.io.File;

/**
 * @ClassName Test3
 * @Description 针对D:盘查找磁盘目录下的所有文件: mp4 文件.
 * @Author CQ
 * @Date 2022/8/22 10:05
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        //针对D:盘查找磁盘目录下的所有文件: mp4 文件.
        //推荐:  递归实现方式.
        //1.指定起始位置:
        File f1 = new File("d:/");
        task(f1);
    }
    //2.重复传递执行的任务-方法封装.  注:  根据目录找MP4.
    //3.有一个结束终点的条件.
    public static void task(File parentPath){
        //查看所有子目录:
        File[] childList = parentPath.listFiles();

        //如果子目录为空: 直接返回结束.
        if(childList == null || childList.length == 0 ){
            return;
        }
        //不为空: 循环检查过滤每一个文件. :  1.是MP4文件: 打印查看即可.  2.是子目录: 继续调用task查找.
        for (File child1 : childList) {

            if( child1.isFile() && child1.getName().endsWith(".mp4") ){
                System.out.println("找到了: " + child1.getName());
            }else if(child1.isDirectory()){
                task( child1 );
            }
        }
    }
}
