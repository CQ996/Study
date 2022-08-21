package august.bao0822.bufferedIO.char_buffer;

import java.io.*;
import java.util.*;

/**
 * @ClassName BufferedCharTest
 * @Description 缓冲字符流读取文章，自定义排序后再写入新文件
 * @Author CQ
 * @Date 2022/8/22 5:22
 * @Version 1.0
 */
public class BufferedCharTest {
    public static void main(String[] args) {

        try (
                //1.创建缓冲输入流
                BufferedReader br = new BufferedReader(new FileReader("3.txt"));
                //5.定义缓冲字符输出管道与目标文件接通
                BufferedWriter bw = new BufferedWriter(new FileWriter("4.txt"));
                ){

            //2.定义一个List集合存储数据
            List<String> data = new ArrayList<>();
            //3.定义循环按照行读取文章
            String line;
            while ((line = br.readLine()) != null) {
                data.add(line);
            }
            System.out.println(data);
            //4.排序
            //自定义排序规则
            List<String> sizes = new ArrayList<>();
            Collections.addAll(sizes, "一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二");

            Collections.sort(data, new Comparator<String>() {
                @Override
                public int compare(String o1, String o2) {
                    return sizes.indexOf(o1.substring(0, o1.indexOf("."))) - sizes.indexOf(o2.substring(0, o2.indexOf(".")));
                }
            });
            System.out.println(data);
            //5.定义缓冲字符输出管道与目标文件接通

            //遍历集合中的每行文章，且要换行
            for (String s :data) {
                bw.write(s);
                bw.newLine();//换行
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
