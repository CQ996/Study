package august.bao0822.BufferedIO;

import java.io.*;

/**
 * @ClassName ByteBufferTimeDemo
 * @Description 普通字节流和缓冲字节流效率对比
 * @Author CQ
 * @Date 2022/8/22 3:49
 * @Version 1.0
 */
public class ByteBufferTimeDemo {
    private static final String SRC_FILE="C:\\Users\\CQ\\Desktop\\4K烤鸭3个版本\\[示范60mbps]HD.Club-4K-Chimei-inn-60mbps.mp4";
    private static final String DEST_FILE="C:\\Users\\CQ\\Desktop\\4K烤鸭3个版本\\";
    public static void main(String[] args) {
        copy01();//使用低级字节流一个一个字节复制文件   767.988s
        copy02();//使用低级字节流一个一个字节数组复制文件  1.144s
        copy03();//使用缓冲字节流一个一个字节复制文件     8.216s
        copy04();//使用缓冲字节数组流一个一个字节复制文件  0.3779s

    }

    private static void copy04() {
        long startTime=System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis=new BufferedInputStream(is);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"a4.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ){

            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;//记录读取每次读取的字节数
            while ((len=bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用缓冲字节流一个一个字节数组复制文件耗时："+(endTime-startTime)/1000.0+"s");
    }


    private static void copy03() {
        long startTime=System.currentTimeMillis();
        try (
                //这里面只能放资源对象，用完会自动关闭：
                // 自动调用资源的close方法关闭资源（即使出现异常也会关闭操作）
                //1.创建一个字节输入流管道与原视频接通
                InputStream is = new FileInputStream(SRC_FILE);
                InputStream bis=new BufferedInputStream(is);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"a3.mp4");
                OutputStream bos = new BufferedOutputStream(os);
        ){
            //3.定义一个变量记录每次读取的字节（一个一个字节的复制）
            int b;
            while ((b=bis.read())!=-1){
                bos.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用缓冲字节流一个一个字节复制文件耗时："+(endTime-startTime)/1000.0+"s");
    }

    private static void copy02() {
        long startTime=System.currentTimeMillis();
        try (
                InputStream is = new FileInputStream(SRC_FILE);
                //2.创建一个字节输出流管道与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"a2.mp4");
        ){

            //3.定义一个字节数组转移数据
            byte[] buffer=new byte[1024];
            int len;//记录读取每次读取的字节数
            while ((len=is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级字节流一个一个字节数组复制文件耗时："+(endTime-startTime)/1000.0+"s");
    }

    private static void copy01() {
        long startTime=System.currentTimeMillis();
        try (
                //1.创建低级字节输入流与源文件接通
                InputStream is=new FileInputStream(SRC_FILE);
                //2.创建低级字节输出流与目标文件接通
                OutputStream os=new FileOutputStream(DEST_FILE+"a1.mp4");
                ){
            //3.定义一个变量记录每次读取的字节（一个一个字节的复制）
            int b;
            while ((b=is.read())!=-1){
                os.write(b);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime=System.currentTimeMillis();
        System.out.println("使用低级字节流一个一个字节复制文件耗时："+(endTime-startTime)/1000.0+"s");
    }
}
