package bao0720;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName CharacterSorting
 * @Description 数组字母排序,然后插入新字母并保持排序
 * @Author CQ
 * @Date 2022/7/20 10:02
 * @Version 1.0
 */
public class CharacterSorting006007 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char []abc={'a','c','u','b','e','p','f','z',' '};

        System.out.println("升序排序后：");
        Arrays.sort(abc);
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i]+"\t");
        }
        System.out.print("\n");

/*

        System.out.println("逆序排序后：");
        for (int i = abc.length-1; i >=0; i--) {
            System.out.print(abc[i]+"\t");
        }
*/
        System.out.println("插入新字母：");
        //假设插入d
        char insterNum=input.next().charAt(0);
        int index=abc.length;//存储插入位置,假设index 3
        //如果插入的新数据小于原数据，就将下标赋值给index
        for (int i = 0; i < abc.length; i++) {
            if(insterNum<abc[i]){
                index=i-1;//此时index 3，因为要将位数往前移
                break;
            }
        }
        //将倒数第二位移到倒数第一位，循环往复 插入位置后元素依次后移
        //赋值最后一位下标给i，只要i>=新插入下标，就把前一位数据赋值给后一位
        for (int i = 0; i<index ; i++) {
            abc[i]=abc[i+1];
        }
        //将新插入数据赋值给新下标的数组位置
        abc[index]=insterNum;
        System.out.println("插入成绩的下标是："+index);
        System.out.println("插入后的字符序列是：");
        for (int i = 0; i < abc.length; i++) {
            System.out.print(abc[i]+"\t");
        }
    }
}
