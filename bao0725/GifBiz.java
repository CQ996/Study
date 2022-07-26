package bao0725;

/**
 * @ClassName GifBiz
 * @Description 通过带参方法输入纪念品,查找纪念品
 * @Author CQ
 * @Date 2022/7/25 16:37
 * @Version 1.0
 */
public class GifBiz {
    String[] names=new String[5];
    public void add(String name){
        for (int i = 0; i < names.length; i++) {
            if(names[i]==null){
                names[i]=name;
                break;
            }
        }
    }
    public void show(){
        for (int i = 0; i < names.length; i++) {
            if(names[i]!=null){
                System.out.println(names[i]);
            }
        }
    }

    /**
     * 查找纪念品
     * @param start 开始位置
     * @param end   结束位置
     * @param name  纪念品名称
     * @return 找到为true，未找到为false
     */
    public boolean searchGif(int start,int end,String name){
        boolean flag=false;
        for (int i = start-1;i<end;i++) {
            if(names[i].equals(name)){
                flag=true;
                break;
            }
        }
        return flag;
    }

}
