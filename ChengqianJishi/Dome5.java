package ChengqianJishi;

import java.util.Scanner;

/**
 * @ClassName Dome5
 * @Description 小明购物结束出来双手都拿着东西，左手提着一箱方便面，右手拿着一摞练习本，
 * 他想把较重的方便面移给右手提着，左手拿练习本，但是东西太大用一只手移动不了天又刚下完雨，
 * 地上很脏不能放在地上，他只有叫来小王帮他拿一下其中的一件东西，然后他就可以完成左手拿着一摞练习本，
 * 右手提着一箱方便面了，通过编程实现这个过程（用代码实现小明双手刚购物结束到换后的状态就可以了）
 * @Author CQ
 * @Date 2022/7/13 14:21
 * @Version 1.0
 */
public class Dome5 {
    public static void main(String[] args) {
        String left = "方便面";
        String right = "练习本";
        System.out.println("没有小王，现在小明的左手拿着：" + left + "\t右手拿着：" + right);
        String xw = "小王";
        xw = left;
        left = right;
        right = xw;
        System.out.println("小王来了后，现在小明的左手拿着：" + left + "\t现在右手拿着：" + right);

    }


}
