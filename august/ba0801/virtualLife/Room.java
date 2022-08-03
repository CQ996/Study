package august.ba0801.virtualLife;

/**
 * @ClassName Room
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/31 21:05
 * @Version 1.0
 */
public class Room {
    String[] furnitures; //家具
    //添置家具的方法:第一次添置家具：对furnitures数组进行初始化，创建长度为1的furnitures数组
    //否则，通过长度为furnitures.length+1的临时数组转存数据
    public void addFurniture(String name) {
        if(furnitures==null){
            furnitures=new String[1];
            furnitures[0]=name;
        }else {
            String[] furnitures1 = new String[furnitures.length + 1];
            furnitures1[furnitures.length-1]=name;
            furnitures[furnitures.length-1]=furnitures1[furnitures.length-1];
        }
    }
    //查看小窝状态的方法:如果furnitures数组为空，则提示“你的小窝里还什么都没有哦~”
    //否则，将furnitures数组中的元素拼接为一条提示信息并输出到控制台
    public void showRoomStatus() {
        System.out.print("小窝中已经有：");
        for (int i = 0; i < furnitures.length; i++) {
            System.out.print(furnitures[i]+" ");
        }
    }
    //展示小窝状态的方法:在小窝中没有家具时，玩家要到商店购买家具并添加furnitures数组中
    //否则，调用小窝中的showRoomStatus()方法

}
