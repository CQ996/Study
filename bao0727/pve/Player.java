package bao0727.pve;

/**
 * @ClassName Player
 * @Description TODO
 * @Author CQ
 * @Date 2022/7/27 16:52
 * @Version 1.0
 */
public class Player {

    String name;//玩家名称
    Hero hero;//玩家英雄
    int win;//胜出次数
    //int[] selectedHero = {8};//已选择过的英雄的名称列表
    int[] selectedHero = {-1,-1,-1,-1,-1,-1};//已选择过的英雄的列表,每个元素初始值为-1

    /**
     * 判断是否已经选过该英雄
     */
    public boolean isSelected2(int index){
        for (int i = 0; i < selectedHero.length; i++) {
            if (index==selectedHero[i]){
                System.out.println("该英雄已经参与过对战，请选择其他英雄！");
                return true;//选过
            }else{//没选过,添加到selectedHero中
                int size = selectedHero.length;
                int[] tmp = new int[size];
                for (int j = 0; j < size; j++) {
                    tmp[j]=selectedHero[j];
                }
                tmp[size-1]=index;
                selectedHero = tmp;
            }
        }
        return false;
    }

    public boolean isSelected(int index){
        int insertIndex = -1;//插入位置
        for (int i = 0; i < selectedHero.length; i++) {
            if(selectedHero[i]==-1){//当元素值为-1时，表示该元素没有被重新赋值
                insertIndex = i;  //记录添加新元素的位置
                break;
            }
            if (selectedHero[i]==index){
                System.out.println("该英雄已经参与过对战，请选择其他英雄！");
                return true;//选过
            }
        }
        selectedHero[insertIndex] = index;
        return false;
    }

    public void status(){
        System.out.println("\t\t\t"+name+"胜出"+win+"个回合");
    }
}
