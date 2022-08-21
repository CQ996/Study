package august.bao0819;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * @ClassName Dome2
 * @Description 实现模拟4位随机数:含有0~9, A-Z，a-z. ;保证生成的验证码是不重复的。
 * @Author CQ
 * @Date 2022/8/21 14:10
 * @Version 1.0
 */

public class Dome2{
    public static void main(String[] args){

        char[] yzm = new char[62];//创建数组用于存储大小写字母和数字:26+26+10=62

        // 把26个大写字母放入数组
        //A的ASCCI编码表中对应值是65，+1=66再强转就是B
        char dx = 'A';
        for(int i=0;i<=25;i++)
        {
            yzm[i]=dx;
            dx=(char)(dx+1);//因为相加所以数据类型会自动转换为int型，所以要强制转换为char型不然不匹配
        }

        // 把26个小写字母放入数组
        char xx = 'a';
        for(int i=26;i<=51;i++)
        {
            yzm[i]=xx;

            xx=(char)(xx+1);
        }

        // 把0到9放入数组
        char num = '0';
        for(int i=52;i<=61;i++)
        {
            yzm[i]=num;
            num=(char)(num+1);
        }
        Random sjs = new Random();
        //方法一：set集合收集数据
        Set set1 = new HashSet();
            do {
                int a=sjs.nextInt(62);//生成随机数
                set1.add(yzm[a]);//将随机数 转为对应的 大小写字母或者数字；再放入set集合内
            }while (set1.size()<4);

        Iterator it = set1.iterator();
        while (it.hasNext()) {
            Object next =  it.next();
            System.out.print(next);
        }

/*
        //方法二：用 双层for循环 和 if 判断
        char[] dft = new char[4];//不重复随机数组
        for (int i = 0; i <dft.length ; i++) {
            int a=sjs.nextInt(62);//生成随机数
            dft[i]=yzm[a];//将随机数 转为对应的 大小写字母或者数字；再放入验证码数组内
            for (int j = 0; j < i; j++) {
                // 比较数组存在中的数据，如果有相同的，退出当前循环重新生成一个随机数据，直到在数组中没有相同数据
                //第一次i、j都是0，所以不比较
                if(dft[i]==dft[j]){
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.print(dft[i]);
        }
*/

    }
}
