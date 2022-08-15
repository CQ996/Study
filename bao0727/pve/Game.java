package bao0727.pve;

import java.util.Scanner;

/**
 * @ClassName Game
 * @Description 人机多轮对战，选张飞等英雄
 * @Author CQ
 * @Date 2022/7/27 16:45
 * @Version 1.0
 */
/**
 * 创建游戏类
 */
public class Game {

    Player player;//玩家
    Computer computer;//AI
    int count;//回合对战次数
    String[] heroArr = {"张飞", "后羿", "妲己", "元芳", "露露", "大鱼"};


    /**
     * 初始化
     */
    public void initial() {
        //初始化玩家
        player = new Player();
        System.out.print("请输入你的名称：");
        Scanner input = new Scanner(System.in);
        player.name = input.next();
        //初始化AI
        computer = new Computer();

    }

    /**
     * 展示英雄列表
     */
    public void showHeros() {
        //展示英雄名称列表
        StringBuffer sb = new StringBuffer("【");
        for (int i = 0; i < heroArr.length; i++) {
            if (i != heroArr.length - 1) {
                sb.append(i + 1).append(".").append(heroArr[i]).append(",");
            } else {
                sb.append(i + 1).append(".").append(heroArr[i]).append("】");
            }
        }
        System.out.println(sb.toString());
    }

    /**
     * 获得所选择英雄对象
     *
     * @param index 所选择的英雄编号
     * @return 英雄对象
     */
    public Hero getHero(int index) {
        Hero hero = new Hero();
        hero.name = heroArr[index];
        switch (hero.name) {
            case "张飞":
                hero.hp = 100;
                hero.atk = 10;
                hero.def = 12;
                hero.hr = 0.85;
                break;
            case "后羿":
                hero.hp = 80;
                hero.atk = 15;
                hero.def = 12;
                hero.hr = 0.7;
                break;
            case "妲己":
                hero.hp = 50;
                hero.atk = 20;
                hero.def = 5;
                hero.hr = 0.75;
                break;
            case "元芳":
                hero.hp = 70;
                hero.atk = 10;
                hero.def = 8;
                hero.hr = 0.7;
                break;
            case "露露":
                hero.hp = 70;
                hero.atk = 12;
                hero.def = 10;
                hero.hr = 0.8;
                break;
            case "大鱼":
                hero.hp = 100;
                hero.atk = 5;
                hero.def = 20;
                hero.hr = 0.75;
                break;
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(hero.name + "【生命值：" + hero.hp + " 攻击力：" + hero.atk + " 防御力：" + hero.def + " 命中率：" + hero.hr + "】");
        System.out.println("---------------------------------------------------------");
        return hero;
    }

    /**
     * 开始游戏
     */
    public void start() {
        System.out.println("---------欢迎来到1V1人机对战游戏----------");
        System.out.println("\n\t************************");
        System.out.println("\t***    游戏开始    ****");
        initial();//初始化
        System.out.println("\t\t游戏开始【" + player.name + "】vs【" + computer.name + "】");
        boolean result = true;
        int id = 0;
        String gameContinue = "y";//游戏继续标志
        Scanner input = new Scanner(System.in);
        //一局
        do {
            do {
                //展示英雄名称列表
                showHeros();
                System.out.print("请输入你要选择的英雄的编号：");
                id = input.nextInt();
                //检查该英雄是否已经选过
                result = player.isSelected(id - 1);
            } while (result);
            player.hero = getHero(id - 1);
            //电脑选择英雄
            int index = (int) (Math.random() * heroArr.length);
            computer.hero = getHero(index);
            count = 0;
            //三个回合
            while (count < 3) {
                int cHurted = 0;//AI伤害值清零
                int pHurted = 0;//玩家伤害值清零
                if (!computer.hero.isDie() && !player.hero.isDie()) {
                    System.out.println("**************第" + (count + 1) + "回合**************");
                    //玩家进行攻击
                    System.out.println(player.name + "发动攻击：");
                    if (hitRate((player.hero.hr)) == true) {
                        int realAtk = player.hero.attack();//攻击
                        cHurted = computer.hero.defense(realAtk);//防御
                        computer.hero.hp -= cHurted;//计算剩余血量
                    } else {
                        System.out.println("哎呀！失手了！没打着~~~~");
                    }
                    //AI进行攻击
                    System.out.println(computer.name + "发动攻击：");
                    if (hitRate((computer.hero.hr)) == true) {
                        int realAtk = computer.hero.attack();//攻击
                        pHurted = player.hero.defense(realAtk);//防御
                        player.hero.hp -= pHurted;//计算剩余血量
                    } else {
                        System.out.println("哎呀！失手了！没打着~~~~");
                    }
                    roundWin(cHurted, pHurted);
                } else {
                    break;
                }
                count++;//回合数+1
            }
            System.out.println("-------------------------------------------");
            juWin();
            //显示本局对战结果
            System.out.println("\n是否开始下一局（y/n):");
            gameContinue = input.next();
        } while (gameContinue.equalsIgnoreCase("y"));
        finalWin();
    }

    /**
     * 指定攻击命中率
     */
    public boolean hitRate(double hr) {
        boolean flag = false;
        int r = (int) Math.random();
        if (r < hr) {
            flag = true;
        } else {
            flag = false;
        }
        return flag;
    }

    /**
     * 回合对战结果显示
     *
     * @param cHurted
     * @param pHurted
     */
    public void roundWin(int cHurted, int pHurted) {
        if (cHurted > pHurted) {//电脑受到的有效伤害大于玩家
            System.out.println("第【" + (count + 1) + "】回合赢家是" + player.name);
            player.win++;
        } else if (cHurted == pHurted) {
            System.out.println("第【" + (count + 1) + "】回合平局");
        } else {
            System.out.println("第【" + (count + 1) + "】回合赢家是" + computer.name);
            computer.win++;
        }
    }

    /**
     * 显示本局游戏的对战结果
     */
    public void juWin() {
        if (computer.hero.hp == 0 && player.hero.hp > computer.hero.hp) {
            System.out.println(player.name + "本局胜出");
        } else if (player.hero.hp == computer.hero.hp) {
            System.out.println("本局平手");
        } else {
            System.out.println(computer.name + "本局胜出");
        }
    }

    /**
     * 显示最终对战结果（以回合对战数为标准）
     */
    public void finalWin() {
        System.out.println("\n\t\t************************");
        player.status();
        computer.status();
        if (player.win > computer.win) {
            System.out.println("\t\t\t结果：" + player.name + "胜出");
        } else if (player.win == computer.win) {
            System.out.println("\t\t\t结果：平手");
        } else {
            System.out.println("\t\t\t结果：" + computer.name + "胜出");
        }
        System.out.println("\t\t************************");
    }
}
