package bao0718;

import java.util.Scanner;
import java.util.Arrays;

/**
 * @ClassName WordSorting
 * @Description 单词按首字母排序
 * @Author CQ
 * @Date 2022/7/18 15:42
 * @Version 1.0
 */
public class WordSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String []word=new String[7];
        for (int i = 0; i < word.length ; i++) {
            System.out.println("请输入第"+(i+1)+"个单词");
            word[i]= input.next();
        }
        //数组排序，从小到大
        Arrays.sort(word);
        for (int i = 0; i < word.length ; i++) {
            System.out.println(word[i]);
        }

    }
}
