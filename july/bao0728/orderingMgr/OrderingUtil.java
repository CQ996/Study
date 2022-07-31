package july.bao0728.orderingMgr;

import java.util.Scanner;

/**
 * @ClassName OrderingUtil
 * @Description 初始化3个菜品信息；初始化两条订单信息
 * @Author CQ
 * @Date 2022/7/28 21:09
 * @Version 1.0
 */
public class OrderingUtil {
    OrderingSet oSet=new OrderingSet();
    Scanner input=new Scanner(System.in);
    int freight;
    //订餐人姓名
    String name;
    //初始化3个菜品信息;
    //选择菜品信息
    String[] dishMegs={"红烧带鱼","鱼香肉丝","时令鲜蔬","佛跳墙"};
    //菜品单价
    double[] priceCai={38.0,20.0,10.0,88.0};
    //点赞信息
    int[] praise={3,5,2,9};

    //用户输入0返回主菜单，否则退出系统
    int whether=1;
    //判断，是否退出系统，默认否
    boolean quit=false;
    //菜单切换
    public void startMenu(){
        do{
            System.out.println("欢迎使用联盟订餐系统");
            System.out.println("***************************");
            System.out.println("1、我要订餐");
            System.out.println("2、查看餐袋");
            System.out.println("3、签收订单");
            System.out.println("4、删除订单");
            System.out.println("5、我要点赞");
            System.out.println("6、退出系统");
            System.out.println("***************************");
            System.out.println("请选择：");
            int select=input.nextInt();
            switch (select){
                case 1:
                    System.out.println("*****我要订餐*****");
                    add();
                    break;
                case 2:
                    System.out.println("*****查看餐袋*****");
                    display();
                    break;
                case 3:
                    System.out.println("*****签收订单*****");
                    sign();
                    break;
                case 4:
                    System.out.println("*****删除订单*****");
                    delete();
                    break;
                case 5:
                    System.out.println("*****我要点赞*****");
                    praise();
                    break;
                case 6:
                    System.out.println("*****退出系统*****");
                    quit=true;
                    break;
            }
            if(!quit){
                System.out.println("输入0返回：");
                whether=input.nextInt();
            }else {
                break;
            }
        }while (whether==0);

    }

    //初始化两条订单信息
    public void initial(){
        oSet.name[0]="张三";
        oSet.dishMegs[0]="红烧带鱼2份";
        oSet.times[0]=12;
        oSet.addresses[0]="天成路207号";
        oSet.states[0]=1;
        oSet.sumPrices[0]=76.0;
        oSet.name[1]="张三";
        oSet.dishMegs[1]="鱼香肉丝2份";
        oSet.times[1]=18;
        oSet.addresses[1]="天成路207号";
        oSet.states[1]=0;
        oSet.sumPrices[1]=45.0;
    }
    //根据状态值输出“已完成”或“已预订”,仅显示订餐人不为空的订单记录
    public void display(){
        System.out.println("序号\t订餐人\t餐品信息\t送餐时间\t送餐地址\t总金额\t订单状态");
        for (int i = 0; i < oSet.name.length; i++) {
            if(oSet.name[i]!=null){
                String state= (oSet.states[i]==0)?"已预定":"已完成";
                System.out.println((i+1)+"\t"+oSet.name[i]+"\t\t"+oSet.dishMegs[i]+"\t\t"+oSet.times[i]+"点"+"\t\t"+oSet.addresses[i]+"\t\t"+oSet.sumPrices[i]+"元"+"\t\t"+state);
            }
        }

    }
    //定位新增位置;接收订餐信息;计算订单总金额;计算送餐费;确定新增位置：第一个name为null的位置
    public void add() {
        boolean isAdd=false;
        for (int i = 0; i < oSet.name.length; i++) {
            if(oSet.name[i]==null){
                isAdd=true;
                System.out.println("请输入订餐人姓名：");
                oSet.name[i]=input.next();//姓名赋值给数组
                System.out.println("序号\t\t菜名\t\t单价\t\t点赞数");
                for (int j = 0; j < dishMegs.length; j++) {
                    System.out.println((j+1)+"\t"+dishMegs[j]+"\t"+priceCai[j]+"\t"+praise[j]);
                }
                System.out.println("请选择你要点的菜品编号：");
                int num=input.nextInt();
                oSet.dishMegs[i]=dishMegs[num-1];//菜名赋值数组
                oSet.priceCai[i]=priceCai[num-1];//菜价赋值数组
                System.out.println("请选择你要点的份数：");
                int portion=input.nextInt();
                System.out.println("请输入送餐时间（送餐时间是10带你到20点间整点送餐）：");
                oSet.times[i]=input.nextInt();//时间赋值数组
                System.out.println("请输入送餐地址：");
                oSet.addresses[i]=input.next();//地址赋值数组
                System.out.println("订餐成功！");
                oSet.states[i]=0;//状态设为已预定
                System.out.println("您订的是："+oSet.dishMegs[num-1]+portion+"份");
                System.out.println("送餐时间："+oSet.times[i]+"点");
                double money1=oSet.priceCai[i]*portion;
                if (money1>=50){
                    freight=0;
                }else {
                    freight=5;
                }
                oSet.sumPrices[i]=money1+freight;//总金额赋值数组
                System.out.println("餐费："+money1+"元,送餐费："+freight+"元，总计："+oSet.sumPrices[i]+"元。");
                break;
            }

        }

        if(!isAdd){
            System.out.println("对不起，您现在不能订餐了！餐袋已满！");
        }
    }
    //接收要签收的订单号;for循环结构遍历全部订单;if选择结构判断订单状态;
    //判断条件 :订餐人姓名是否为null，订单状态是否为已预定，且数组下标是指定订单序号减1对于未找到的订单序号：不执行签收，要给出提示
    public void sign(){
        //定义要签收的订单
        boolean issign=false;
        System.out.println("请选择要签收的订单序号：");
        int numsign=input.nextInt();
        for (int i = 0; i < oSet.dishMegs.length; i++) {
            //已预定序号输入-1：可签收
            //已完成序号输入-1：不可签收
            if(oSet.name[i]!=null && oSet.states[i]==0 && numsign==i+1){
                oSet.states[i]=1;//订单状态设为已完成
                System.out.println("订单签收成功！");
                issign=true;//标记已找到此订单
            }else if(oSet.name[i]!=null &&oSet.states[i]==1 &&numsign==i+1){
                System.out.println("您选择的订单已完成签收，不能再次签收！");
                issign=true;//标记已找到此订单
            }
            if(!issign){
                System.out.println("您选择的订单不存在！！");
            }
        }
    }

    //接收要删除的订单号;遍历全部订单查找要删除的订单;将该订单后数据依次前移一位;最后一个不为空元素置空;
    // 不允许删除“已预订”状态的订单;不存在指定的订单，给出提示
    public void delete(){
        boolean isdel=false;//标记是否有要删除的订单，默认无
        System.out.println("请输入要删除的订单序号：");
        int delId=input.nextInt();
        for (int i = 0; i < oSet.name.length; i++) {

            if(oSet.name[i]!=null && oSet.states[i]==1 && delId==i+1){
                isdel=true;//已找到要删除的订单
                //删除操作1，元素内容前移
                for (int j = 0; j < oSet.name.length-1; j++) {
                    oSet.name[j]=oSet.name[j+1];//姓名
                    oSet.dishMegs[j]=oSet.dishMegs[j+1];//菜品
                    oSet.times[j]=oSet.times[j+1];//时间
                    oSet.addresses[j]=oSet.addresses[j+1];//地址
                    oSet.states[j]=oSet.states[j+1];//状态
                    oSet.sumPrices[j]=oSet.sumPrices[j+1];//总金额
                }
                //删除操作2，最后一位置空
                int end=oSet.name.length-1;
                oSet.name[end]=null;
                oSet.dishMegs[end]=null;
                oSet.times[end]=0;
                oSet.addresses[end]=null;
                oSet.states[end]=0;
                oSet.sumPrices[end]=0;
                System.out.println("删除订单成功！");
                break;
            }
            if(oSet.name[i]!=null && oSet.states[i]==0 && delId==i+1){
                System.out.println("您选择的订单未签收，不能删除。");
                break;
            }else if(!isdel){
                System.out.println("你要删除的订单不存在！");
                break;
            }
        }
    }
    //输出全部订单信息;接收要点赞的菜品序号;为对应菜品的点赞数加1
    public void praise(){
            System.out.println("序号\t\t菜名\t\t单价\t\t点赞数");
            for (int j = 0; j < oSet.dishMegs.length; j++) {
                System.out.println((j+1)+"\t"+oSet.dishMegs[j]+"\t"+oSet.priceCai[j]+"\t"+oSet.praise[j]);
            }
            System.out.println("请选择你要点赞的菜品序号：");
            int numPra=input.nextInt();
            oSet.praise[numPra-1]++;//点赞+1
            System.out.println("点赞成功！");
    }





}
