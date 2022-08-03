package bao0727.pve;

/**
 * @ClassName Hero
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/27 16:25
 * @Version 1.0
 */

/**
 * 英雄池
 */
public class Hero {
    /**
     * 英雄的基本属性:姓名,HP,sp,攻击,防御
     */
    String name;
    int hp;//血量
    int atk;//攻击力
    int def;//防御力
    double hr;//命中率

    /**
     * 英雄防御方法：对方打自己，自己防御
     */
    public int defense(int realAtk) {

        int realDef = (int) (Math.random() * def + 1);
        System.out.println(name + "进行了防御，真实防御力力为" + realDef);

        //对方的有效攻击力=对方的真实攻击力-自己的真实防御力
        int validAtk = realAtk - realDef;
        if (validAtk < 0) {
            validAtk = 0;
        }
        return validAtk;
    }


    /**
     * 英雄攻击的方法:自己打对方
     */
    public int attack() {
        int realAtk = (int) (Math.random() * atk + 1);
        System.out.println(name + "发起了攻击，真实攻击力为" + realAtk);
        return realAtk;
    }

    /**
     * 英雄死亡的方法
     */
    public boolean isDie() {
        boolean flag = false;
        if (hp <= 0) {
            System.out.println(name + "已经死亡,游戏结束!");
            flag = true;
        }
        return flag;
    }


}
