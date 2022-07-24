package bao0720;

/**
 * @ClassName ShowItems
 * @Description 用数组显示5件特价商品
 * @Author CQ
 * @Date 2022/7/20 9:04
 * @Version 1.0
 */
public class ShowItems002 {
    public static void main(String[] args) {
        String []items={"耐克背包","阿迪运动衫","李宁运动鞋","Kappa外套","361腰包"};
        for (int i = 0; i < items.length; i++) {
            System.out.println("本次活动特价商品有："+items[i]);
        }
    }
}
