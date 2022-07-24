import java.util.Scanner;

/**
 * 狼人杀游戏：实现游戏终止和是否继续游戏的判断（接上机练习五继续完成）
 */
public class GameRules {

    public static void main(String[] args) {

        int live = 1;//解药
        int poison = 1;//毒药
        boolean flag = true; // 游戏结束标志

        // 身份数组
        String[] roles = {"狼人", "狼人", "平民", "平民", "平民", "预言家", "女巫"};
        // 玩家数组
        String[] people = new String[7];
        // 中间数组：该数组的索引对应people中的元素，元素分别对应roles中的元素的索引
        int[] randomRoles = {7, 7, 7, 7, 7, 7, 7};
        // 游标：作为遍历randomRoles数组的游动下标，它的值表示随机分配过程中，randomRoles的当前下标

        // 使用数组来保存每个玩家位置对应的投票状态
        int[] poll = new int[7];
        int cursor = 0;

        //随机分配身份
        do {
            boolean exist = false; // 用于标记当前所生成的随机数是否已经存在于randomRoles数组里
            /*
             生成的随机数，为randomRole数组的元素赋值（元素表示身份数组的下标）：随机范围要为玩家个数
             */
            int j = (int) (Math.random() * 7);
            /*
             查重：
             在randomRoles数组中进行查重，查找是否存在和当前所生成的随机数相等的值，
             如果存在，表示该位置已经有对应的随机身份，cursor++
             */
            for (int role : randomRoles) {
                if (j == role) {
                    exist = true;
                    break;
                }
            }
            // 当前生成的随机数不存在于randomRole中，才进行赋值
            if (!exist) {
                // 进行赋值
                randomRoles[cursor] = j;
                // 移动游标
                cursor++;
            }
        } while (cursor != 7);

        /*
         将randomRole中每一个元素所对应的在roles中的值（身份）赋值给people中的每一个元素，
         相当于给玩家发了身份牌
         */
        for (int i = 0; i < roles.length; i++) {
            people[i] = roles[randomRoles[i]];
        }

        // 输出每个人的身份
        for (int i = 0; i < people.length; i++) {
            System.out.println((i + 1) + "号的身份为：" + people[i] + "\t");
        }

        // 保存2个神职玩家下标
        int yuYan = 0;
        int nvWu = 0;

        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("预言家")) {
                yuYan = i;
            } else if (people[i].equals("女巫")) {
                nvWu = i;
            }
        }

        Scanner in = new Scanner(System.in);
        System.out.println("天黑,请闭眼");
        System.out.println("狼人选择要杀的号码:");
        int werewolfKill = in.nextInt();//被杀的人

        if (!people[yuYan].equals("死")) { //预言家没死，向上帝查看一个人的身份
            System.out.println("预言家要查看谁的身份：");
            int checkRoles = in.nextInt();
            System.out.println(checkRoles + "号的身份为" + people[checkRoles - 1]);
        }
        int die = 1; //标记今晚是否有人被杀
        int nvWuKill = 0;//会被女巫毒死的人
        if (!people[nvWu].equals("死")) {//女巫没死
            if (live != 0) { //可以使用解药
                System.out.println("女巫请选择是否救人(y/n)：");
                String ans = in.next();
                if (ans.equals("n")) {//不救人
                    live = 1;
                    die = 1;
                } else { //救人
                    live = 0;
                    die = 0;


                }

                if (poison != 0) {//可以使用毒药
                    System.out.println("女巫请选择是否毒人:(y/n)：");
                    String ans1 = in.next();
                    if (ans1.equals("y")) {//毒人
                        System.out.println("请输入要毒几号：");
                        nvWuKill = in.nextInt();//被毒死的人
                        die = 2;
                        poison = 0;
                    }
                }

                if (die == 0) { //救了人
                    System.out.println("今晚是平安夜");
                } else if (die == 1) {
                    System.out.println(werewolfKill + "号死了");
                    people[werewolfKill - 1] = "死";
                } else {//毒死了人
                    System.out.println(werewolfKill + "号死了");
                    people[werewolfKill - 1] = "死";//
                    System.out.println(nvWuKill + "号死了");
                    people[nvWuKill - 1] = "死";
                }
            }
        }


        System.out.println("请开始投票");
        //设置投票数
        for (int i = 0; i < people.length; i++) {
            if (!people[i].equals("死")) {//活着的人可以投票
                //原则上玩家不会投票给已经被杀的人
                System.out.println((i + 1) + "号请选择你认为是狼人的玩家:");
                int choice = in.nextInt();
                switch (choice - 1) {//num2-1是被投的人的下标
                    case 0:
                        poll[0]++;//1号玩家票数+1
                        break;
                    case 1:
                        poll[1]++;//2号玩家票数+1
                        break;
                    case 2:
                        poll[2]++;//3号玩家票数+1
                        break;
                    case 3:
                        poll[3]++;//4号玩家票数+1
                        break;
                    case 4:
                        poll[4]++;//5号玩家票数+1
                        break;
                    case 5:
                        poll[5]++;//6号玩家票数+1
                        break;
                    case 6:
                        poll[6]++;//7号玩家票数+1
                        break;
                    case 7:
                        poll[7]++;//7号玩家票数1+

                }
            }
        }
        //在poll数组找到获得最大投票数的下标,
        int max = poll[0];
        int pollKill = 0;
        for (int i = 0; i < poll.length; i++) {
            if (poll[i] > max) {
                max = poll[i];
                pollKill = i;
            }
        }
        System.out.println(pollKill + 1 + "号被投死");
        people[pollKill] = "死";

        //为降低游戏难度,公开所有玩家的身份,也可以只公开被投死的玩家的身份,加大难度.
        for (int i = 0; i < people.length; i++) {
            System.out.println((i + 1) + "号的身份为：" + people[i] + "\t");
        }

        int werewolfNum = 0;//狼人数量
        int villagerNum = 0;//村民数量
        //遍历玩家数组,统计狼人的数量和剩余村民的数量
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("狼人")) {//如果玩家是狼人
                werewolfNum++; //狼人数量+1
            } else {//如果是村民
                villagerNum++;//村民数量+1
            }

        }

        if (werewolfNum == 0) {//如果狼人数量为0
            System.out.println("游戏结束,平民胜利");
            flag = false;
        } else if (werewolfNum <= villagerNum) {//如果狼人数量小于村民数量
            System.out.println("游戏继续");
        } else {//如果狼人数量大于村民数量
            System.out.println("游戏结束,狼人胜利");
            flag = false;//游戏结束
        }

    }
}
